package com.zepto.irctc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("serial")
@Entity
@Table(name="seats")
@IdClass(TrainDetailsCompositeKeys.class)
public class TrainDetails implements Serializable {
	@Id
	@Column(name="coach_no")
	private String coachNo;
	@Column(name="coach_type")
	private String coachType;
	@Id
	@Column(name="train_id")
	private int trainId;
	@Column(name="train_name")
	private String trainName;
	@Column(name="train_source")
	private String trainSource;
	@Column(name="train_destination")
	private String trainDestination;
	@Column(name="train_source_station")
	private String trainSourceStation;
	@Column(name="train_destination_station")
	private String trainDestinationStation;
	@Column(name="available_seats")
	private int availableSeats;
	
	public String getCoachNo() {
		return coachNo;
	}
	public void setCoachNo(String coachNo) {
		this.coachNo = coachNo;
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
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	@Override
	public String toString() {
		return "TrainDetails [coachNo=" + coachNo + ", coachType=" + coachType + ", trainId=" + trainId + ", trainName="
				+ trainName + ", trainSource=" + trainSource + ", trainDestination=" + trainDestination
				+ ", trainSourceStation=" + trainSourceStation + ", trainDestinationStation=" + trainDestinationStation
				+ ", availableSeats=" + availableSeats + "]";
	}
	

}
