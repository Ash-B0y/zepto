package com.zepto.irctc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.zepto.irctc.model.CoachDetails;
import com.zepto.irctc.model.TrainDetails;
import com.zepto.irctc.model.TrainDetailsCompositeKeys;
import com.zepto.irctc.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	TrainDetails trainDetails;
	@Autowired
    private Environment environment;
	TrainDetails addedCoach;
	TrainDetails removedCoach;

	public List<TrainDetails> getCoaches(String coachType,int trainId){
		return adminRepository.fetchCoaches(coachType,trainId);
	}
	
	public TrainDetails validateAddedCoach(String coachType,int trainId,String coachNo) {
		Optional<TrainDetails> addedCoach = adminRepository.findById(new TrainDetailsCompositeKeys(coachNo,trainId));
		if(addedCoach.isPresent())
			return addedCoach.get();
		else
			return null;
	}
	
	public TrainDetails validateRemovedCoach(int trainId,String coachNo) {
		Optional<TrainDetails> removedCoach = adminRepository.findById(new TrainDetailsCompositeKeys(coachNo,trainId));
		if(removedCoach.isPresent())
			return removedCoach.get();
		else
			return null;
	}
	
	public String addCoaches(List<TrainDetails>coachesAvailable,CoachDetails coachDetailsToBeAdded) {
	
		if(coachDetailsToBeAdded.getCoachType().equals("A/C Sleeper")) {
			if(coachesAvailable.size() < 3) {
				if(coachesAvailable.size()!=0) {
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
				addedCoach = validateAddedCoach(coachDetailsToBeAdded.getCoachType(),coachDetailsToBeAdded.getTrainId(),coachesAvailable.get(0).getCoachNo().charAt(0)+String.valueOf(coachesAvailable.size()+1));
			}
				else if(coachesAvailable.size()==0){
					trainDetails.setCoachNo("A1");
					trainDetails.setCoachType(coachDetailsToBeAdded.getCoachType());
					trainDetails.setTrainId(coachDetailsToBeAdded.getTrainId());
					trainDetails.setTrainName(coachDetailsToBeAdded.getTrainName());
					trainDetails.setTrainSource(coachDetailsToBeAdded.getTrainSource());
					trainDetails.setTrainDestination(coachDetailsToBeAdded.getTrainDestination());
					trainDetails.setTrainSourceStation(coachDetailsToBeAdded.getTrainSourceStation());
					trainDetails.setTrainDestinationStation(coachDetailsToBeAdded.getTrainDestinationStation());
					trainDetails.setAvailableSeats(20);
					adminRepository.save(trainDetails);
					addedCoach = validateAddedCoach(coachDetailsToBeAdded.getCoachType(),coachDetailsToBeAdded.getTrainId(),trainDetails.getCoachNo());	
					
				}
			}
			else
				return environment.getProperty("AdminService.A/C_SLEEPER_COACHES_FILLED");
			
		}
		else if(coachDetailsToBeAdded.getCoachType().equals("Non A/C Sleeper")) {
			
			if(coachesAvailable.size() < 3) {
				if(coachesAvailable.size()!=0) {
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
				addedCoach = validateAddedCoach(coachDetailsToBeAdded.getCoachType(),coachDetailsToBeAdded.getTrainId(),coachesAvailable.get(0).getCoachNo().charAt(0)+String.valueOf(coachesAvailable.size()+1));
			}
				else if(coachesAvailable.size()==0){
					trainDetails.setCoachNo("B1");
					trainDetails.setCoachType(coachDetailsToBeAdded.getCoachType());
					trainDetails.setTrainId(coachDetailsToBeAdded.getTrainId());
					trainDetails.setTrainName(coachDetailsToBeAdded.getTrainName());
					trainDetails.setTrainSource(coachDetailsToBeAdded.getTrainSource());
					trainDetails.setTrainDestination(coachDetailsToBeAdded.getTrainDestination());
					trainDetails.setTrainSourceStation(coachDetailsToBeAdded.getTrainSourceStation());
					trainDetails.setTrainDestinationStation(coachDetailsToBeAdded.getTrainDestinationStation());
					trainDetails.setAvailableSeats(20);
					adminRepository.save(trainDetails);
					addedCoach = validateAddedCoach(coachDetailsToBeAdded.getCoachType(),coachDetailsToBeAdded.getTrainId(),trainDetails.getCoachNo());	
					
				}
			}	
			else
				return environment.getProperty("AdminService.NON_A/C_SLEEPER_COACHES_FILLED");
			
		}
		
		else if(coachDetailsToBeAdded.getCoachType().equals("Seater")) {
	
			if(coachesAvailable.size() < 6) {
				if(coachesAvailable.size()!=0) {
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
				addedCoach = validateAddedCoach(coachDetailsToBeAdded.getCoachType(),coachDetailsToBeAdded.getTrainId(),coachesAvailable.get(0).getCoachNo().charAt(0)+String.valueOf(coachesAvailable.size()+1));
			}
				else if(coachesAvailable.size()==0){
					trainDetails.setCoachNo("C1");
					trainDetails.setCoachType(coachDetailsToBeAdded.getCoachType());
					trainDetails.setTrainId(coachDetailsToBeAdded.getTrainId());
					trainDetails.setTrainName(coachDetailsToBeAdded.getTrainName());
					trainDetails.setTrainSource(coachDetailsToBeAdded.getTrainSource());
					trainDetails.setTrainDestination(coachDetailsToBeAdded.getTrainDestination());
					trainDetails.setTrainSourceStation(coachDetailsToBeAdded.getTrainSourceStation());
					trainDetails.setTrainDestinationStation(coachDetailsToBeAdded.getTrainDestinationStation());
					trainDetails.setAvailableSeats(20);
					adminRepository.save(trainDetails);
					addedCoach = validateAddedCoach(coachDetailsToBeAdded.getCoachType(),coachDetailsToBeAdded.getTrainId(),trainDetails.getCoachNo());	
					
				}
			}
			else
				return environment.getProperty("AdminService.SEATER_COACHES_FILLED");
			
		}
			
     
		if(addedCoach!=null)
			return environment.getProperty("AdminService.COACHES_ADDED");
		
		return environment.getProperty("AdminService.COACHES_ADDITION_FAILURE");
		
	}
	
   public String removeCoaches(List<TrainDetails>coachesAvailable) {
 
			adminRepository.deleteById(new TrainDetailsCompositeKeys(coachesAvailable.get(coachesAvailable.size()-1).getCoachNo(),coachesAvailable.get(coachesAvailable.size()-1).getTrainId()));
			removedCoach = validateRemovedCoach(coachesAvailable.get(coachesAvailable.size()-1).getTrainId(),coachesAvailable.get(coachesAvailable.size()-1).getCoachNo());
			if(removedCoach!=null)
				return environment.getProperty("AdminService.COACHES_REMOVAL_FAILURE");
			else
				return environment.getProperty("AdminService.COACHES_REMOVED");
					
		}   
   }
  

