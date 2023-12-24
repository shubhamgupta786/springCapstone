package com.capstone.repository;

import java.util.Date;

import com.capstone.domain.Flight;

public interface FlightRepository {

	public void addFlightDetails(Flight flight);

	public Flight searchFlightDeatils(Date journeydate);

}
