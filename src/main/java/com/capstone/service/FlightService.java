package com.capstone.service;

import java.util.Date;

import com.capstone.domain.Flight;

public interface FlightService {
	public void createFlightDetails(Flight flightDetails);

	public Flight getFlightDetails(Date journeyDate);

}
