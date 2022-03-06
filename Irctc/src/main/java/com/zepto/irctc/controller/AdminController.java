package com.zepto.irctc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.irctc.model.TrainDetails;
import com.zepto.irctc.service.AdminService;



@RestController
@PropertySource("classpath:configuration.properties")
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
    private Environment environment;
	
	@PostMapping("/addCoaches")
	public ResponseEntity<?> addCoaches(@RequestParam(name="userId", required = true) int userId,@RequestParam(name="coachType", required = true) String coachType,@RequestParam(name="trainId", required = true) int trainId)
	{
		String result= adminService.addCoaches(userId,coachType,trainId);
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	

}
