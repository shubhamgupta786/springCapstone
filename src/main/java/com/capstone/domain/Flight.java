package com.capstone.domain;

import java.time.LocalDate;
import java.util.Date;

public class Flight {
	private String flightId;
	private String airlines;
	private String source;
	private String destination;
	private Double fare;

	private Date journeyDate;
	private Integer seatCount;

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlines=" + airlines + ", source=" + source + ", destination="
				+ destination + ", fare=" + fare + ", journeyDate=" + journeyDate + ", seatCount=" + seatCount + "]";
	}
}
