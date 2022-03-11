package com.zepto.irctc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.irctc.model.CoachDetails;
import com.zepto.irctc.model.TrainDetails;
import com.zepto.irctc.service.AdminService;



@RestController
@PropertySource("classpath:configuration.properties")
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
    private Environment environment;
	
	@GetMapping("/viewSeats")
	public ResponseEntity<?> viewSeats(@RequestParam(name="userId", required = true) int userId,@RequestParam(name="coachType", required = true) String coachType,@RequestParam(name="trainId", required = true) int trainId)
	{
		List<TrainDetails> seatDetails = adminService.getCoaches(coachType,trainId);
		if(seatDetails.size()!=0)
			return new ResponseEntity<>(seatDetails, HttpStatus.OK);
		return new ResponseEntity<>(environment.getProperty("AdminService.COACHES_AVAILABLE_NIL"), HttpStatus.BAD_REQUEST);		
   }
	
	@PostMapping("/addCoaches")
	public ResponseEntity<?> addCoaches(@RequestBody CoachDetails coachDetailsToBeAdded)
	{
		List<TrainDetails> coachDetails = adminService.getCoaches(coachDetailsToBeAdded.getCoachType(),coachDetailsToBeAdded.getTrainId());
		String result= adminService.addCoaches(coachDetails,coachDetailsToBeAdded);
		if(result.contains("success"))
			return new ResponseEntity<>(result, HttpStatus.OK);
		return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);		
   }

	@DeleteMapping("/removeCoaches")
	public ResponseEntity<?> removeCoaches(@RequestParam(name="userId", required = true) int userId,@RequestParam(name="coachType", required = true) String coachType,@RequestParam(name="trainId", required = true) int trainId)
	{
		List<TrainDetails> coachDetails = adminService.getCoaches(coachType, trainId);
		if(coachDetails.size()!=0) {
			String result= adminService.removeCoaches(coachDetails);
			if(result.contains("success"))
				return new ResponseEntity<>(result, HttpStatus.OK);
			return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
		
	}
		return new ResponseEntity<>(environment.getProperty("AdminService.COACHES_NIL"), HttpStatus.BAD_REQUEST);
}
}
