package com.zepto.irctc.model;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class BookingDetailsCompositeKeys implements Serializable{
	private String bookingId;
	private String pnr;
	
	public BookingDetailsCompositeKeys() {
	
	}
	
	public BookingDetailsCompositeKeys(String bookingId, String pnr) {
		super();
		this.bookingId = bookingId;
		this.pnr = pnr;
	}
	
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(bookingId,pnr);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj ) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BookingDetailsCompositeKeys compositeKey = (BookingDetailsCompositeKeys) obj;
        return Objects.equals(bookingId, compositeKey.bookingId) &&
                Objects.equals(pnr, compositeKey.pnr);
		
		
	}
	

}
