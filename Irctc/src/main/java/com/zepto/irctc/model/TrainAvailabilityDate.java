package com.zepto.irctc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="dates")
@IdClass(TrainAvailabilityDateCompositeKeys.class)
public class TrainAvailabilityDate implements Serializable{
	@Id
	@Column(name="journey_date")
	private Date journeyDate;
	@Column(name="arrival_time")
	private String arrivalTime;
	@Id
	@Column(name="departure_time")
	private String departureTime;
	@Id
	@Column(name="train_id")
	private int trainId;
	
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	
	@Override
	public String toString() {
		return "TrainAvailabilityDate [journeyDate=" + journeyDate + ", arrivalTime=" + arrivalTime + ", departureTime="
				+ departureTime + ", trainId=" + trainId + "]";
	}
	
	

}
