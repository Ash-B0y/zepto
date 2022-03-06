
package com.zepto.irctc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="booking")
@IdClass(BookingDetailsCompositeKeys.class)
public class BookingDetails implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="booking_id")
	private String bookingId;
	@Column(name="train_id")
	private int trainId;
	@Column(name="coach_type")
	private String coachType;
	@Column(name="user_id")
	private int userId;
	@Column(name="train_source")
	private String trainSource;
	@Column(name="train_destination")
	private String trainDestination;
	@Column(name="total_fare")
	private int totalFare;
	@Column(name="passenger_name")
	private String passengerName;
	@Column(name="passenger_age")
	private int passengerAge;
	@Column(name="passenger_gender")
	private String passengerGender;
	@Id
	@Column(name="pnr")
	private String pnr;
	@Column(name="seat_allocated")
	private int seatAllocated;
	
	public String getTrainSource() {
		return trainSource;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	
	public String getCoachType() {
		return coachType;
	}
	public void setCoachType(String coachType) {
		this.coachType = coachType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public int getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(int totalFare) {
		this.totalFare = totalFare;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public int getSeatAllocated() {
		return seatAllocated;
	}
	
	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", trainId=" + trainId + ", coachType=" + coachType
				+ ", userId=" + userId + ", trainSource=" + trainSource + ", trainDestination=" + trainDestination
				+ ", totalFare=" + totalFare + ", passengerName=" + passengerName + ", passengerAge=" + passengerAge
				+ ", passengerGender=" + passengerGender + ", pnr=" + pnr + ", seatAllocated=" + seatAllocated + "]";
	}
	
	

}
