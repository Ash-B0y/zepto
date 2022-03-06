package com.zepto.irctc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@SuppressWarnings("serial")
public class TrainAvailabilityDateCompositeKeys implements Serializable{

	private Date journeyDate;	
	private String departureTime;
	private int trainId;
	
	public TrainAvailabilityDateCompositeKeys() {
		
   }
	
	public TrainAvailabilityDateCompositeKeys(Date journeyDate, String departureTime, int trainId) {
		super();
		this.journeyDate = journeyDate;
		this.departureTime = departureTime;
		this.trainId = trainId;
	}
	
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
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
	public int hashCode() {
		
		return Objects.hash(journeyDate,departureTime,trainId);
	}

	@Override
	public boolean equals(Object obj) {
		
		if ( this == obj ) {
            return true;
        }
		
        if ( obj == null || getClass() != obj.getClass() ) {
            return false;
        }
        
        TrainAvailabilityDateCompositeKeys compositeKey = (TrainAvailabilityDateCompositeKeys) obj;
        return Objects.equals(journeyDate, compositeKey.journeyDate ) && Objects.equals(departureTime, compositeKey.departureTime) &&
                Objects.equals(trainId, compositeKey.trainId);
			}

	
}
