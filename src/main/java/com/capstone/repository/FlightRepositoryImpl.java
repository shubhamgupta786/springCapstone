package com.capstone.repository;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;

import com.capstone.domain.Flight;
import org.springframework.stereotype.Component;

@Component
public class FlightRepositoryImpl implements FlightRepository {

	private int flightId = 1000;

	private Map<String, Flight> flightRepo = new HashMap<>();

	@Override
	public void addFlightDetails(Flight flight) {
		// TODO Auto-generated method stub
		flight.setFlightId(String.valueOf(++flightId));
		flightRepo.put(flight.getFlightId(), flight);
		for (String keys : flightRepo.keySet()) {
			System.out.println(keys);
		}

	}

	@Override
	public Flight searchFlightDeatils(Date journeydate) {
		// TODO Auto-generated method stub
		for (Flight savedetails : flightRepo.values()) {
			if (savedetails.getJourneyDate().compareTo(journeydate) == 0) {
				return savedetails;
			}
			;
		}
		return null;
	}

}
