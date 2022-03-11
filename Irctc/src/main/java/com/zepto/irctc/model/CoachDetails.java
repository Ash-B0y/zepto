package com.zepto.irctc.model;



public class CoachDetails {
	private String coachType;
	private int trainId;
	private String trainName;
	private String trainSource;
	private String trainDestination;
	private String trainSourceStation;
	private String trainDestinationStation;
	
	public CoachDetails(String coachType, int trainId, String trainName, String trainSource, String trainDestination,
			String trainSourceStation, String trainDestinationStation) {
		super();
		this.coachType = coachType;
		this.trainId = trainId;
		this.trainName = trainName;
		this.trainSource = trainSource;
		this.trainDestination = trainDestination;
		this.trainSourceStation = trainSourceStation;
		this.trainDestinationStation = trainDestinationStation;
	}
	
	public String getCoachType() {
		return coachType;
	}
	public void setCoachType(String coachType) {
		this.coachType = coachType;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainSource() {
		return trainSource;
	}
	public void setTrainSource(String trainSource) {
		this.trainSource = trainSource;
	}
	public String getTrainDestination() {
		return trainDestination;
	}
	public void setTrainDestination(String trainDestination) {
		this.trainDestination = trainDestination;
	}
	public String getTrainSourceStation() {
		return trainSourceStation;
	}
	public void setTrainSourceStation(String trainSourceStation) {
		this.trainSourceStation = trainSourceStation;
	}
	public String getTrainDestinationStation() {
		return trainDestinationStation;
	}
	public void setTrainDestinationStation(String trainDestinationStation) {
		this.trainDestinationStation = trainDestinationStation;
	}
	

}
