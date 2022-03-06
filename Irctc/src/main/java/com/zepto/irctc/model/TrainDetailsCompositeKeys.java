package com.zepto.irctc.model;

import java.io.Serializable;
import java.util.Objects;


@SuppressWarnings("serial")
public class TrainDetailsCompositeKeys implements Serializable{
	private String coachNo;
	private int trainId;
	
	public TrainDetailsCompositeKeys() {
		
	}
	
	public TrainDetailsCompositeKeys(String coachNo, int trainId) {
		super();
		this.coachNo = coachNo;
		this.trainId = trainId;
	}
	
	public String getCoachNo() {
		return coachNo;
	}
	public void setCoachNo(String coachNo) {
		this.coachNo = coachNo;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(coachNo,trainId);
	}

	@Override
	public boolean equals(Object obj) {
		
		 if (this == obj) {
	            return true;
	        }
		 
	        if (obj == null || getClass()!=obj.getClass()) {
	            return false;
	        }
	        
	        TrainDetailsCompositeKeys compositeKey = (TrainDetailsCompositeKeys) obj;
	        return Objects.equals( coachNo, compositeKey.coachNo ) &&
	                Objects.equals( trainId, compositeKey.trainId);
		
	}

}
