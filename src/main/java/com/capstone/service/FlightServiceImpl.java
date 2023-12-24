package com.capstone.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.capstone.domain.Flight;
import com.capstone.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	@Qualifier("flightRepositoryImpl")
	public FlightRepository master;

	@Override
	public void createFlightDetails(Flight flightDetails) {
		// TODO Auto-generated method stub
		master.addFlightDetails(flightDetails);
	}

	@Override
	public Flight getFlightDetails(Date journeyDate) {
		// TODO Auto-generated method stub
		return master.searchFlightDeatils(journeyDate);

	}

}
