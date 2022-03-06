package com.zepto.irctc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.irctc.model.TrainDetails;
import com.zepto.irctc.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	TrainDetails trainDetails;
	String response;
	public String addCoaches(int userId,String coachType,int trainId) {
		
		List<TrainDetails> coachesAvailable = adminRepository.fetchCoaches(coachType,trainId);
		if(coachType.equals("A/C Sleeper")) {
			if(coachesAvailable.size() < 3) {
				trainDetails.setCoachNo(coachesAvailable.get(0).getCoachNo().charAt(0)+String.valueOf(coachesAvailable.size()+1));
				trainDetails.setCoachType(coachesAvailable.get(0).getCoachType());
				trainDetails.setTrainId(coachesAvailable.get(0).getTrainId());
				trainDetails.setTrainName(coachesAvailable.get(0).getTrainName());
				trainDetails.setTrainSource(coachesAvailable.get(0).getTrainSource());
				trainDetails.setTrainDestination(coachesAvailable.get(0).getTrainDestination());
				trainDetails.setTrainSourceStation(coachesAvailable.get(0).getTrainSourceStation());
				trainDetails.setTrainDestinationStation(coachesAvailable.get(0).getTrainDestinationStation());
				trainDetails.setAvailableSeats(20);
				adminRepository.save(trainDetails);
			}
			else
				response="";
			
		}
		else if(coachType.equals("Non A/C Sleeper")) {
			
			if(coachesAvailable.size() < 3) {
				trainDetails.setCoachNo(coachesAvailable.get(0).getCoachNo().charAt(0)+String.valueOf(coachesAvailable.size()+1));
				trainDetails.setCoachType(coachesAvailable.get(0).getCoachType());
				trainDetails.setTrainId(coachesAvailable.get(0).getTrainId());
				trainDetails.setTrainName(coachesAvailable.get(0).getTrainName());
				trainDetails.setTrainSource(coachesAvailable.get(0).getTrainSource());
				trainDetails.setTrainDestination(coachesAvailable.get(0).getTrainDestination());
				trainDetails.setTrainSourceStation(coachesAvailable.get(0).getTrainSourceStation());
				trainDetails.setTrainDestinationStation(coachesAvailable.get(0).getTrainDestinationStation());
				trainDetails.setAvailableSeats(20);
				adminRepository.save(trainDetails);
			}
			
			else
				response="";
			
		}
		
		else if(coachType.equals("Seater")) {
	
			if(coachesAvailable.size() < 6) {
				trainDetails.setCoachNo(coachesAvailable.get(0).getCoachNo().charAt(0)+String.valueOf(coachesAvailable.size()+1));
				trainDetails.setCoachType(coachesAvailable.get(0).getCoachType());
				trainDetails.setTrainId(coachesAvailable.get(0).getTrainId());
				trainDetails.setTrainName(coachesAvailable.get(0).getTrainName());
				trainDetails.setTrainSource(coachesAvailable.get(0).getTrainSource());
				trainDetails.setTrainDestination(coachesAvailable.get(0).getTrainDestination());
				trainDetails.setTrainSourceStation(coachesAvailable.get(0).getTrainSourceStation());
				trainDetails.setTrainDestinationStation(coachesAvailable.get(0).getTrainDestinationStation());
				trainDetails.setAvailableSeats(20);
				adminRepository.save(trainDetails);
			}
			
			else
				response="";
			
		}

		return response;
		
	}
	
	

}
