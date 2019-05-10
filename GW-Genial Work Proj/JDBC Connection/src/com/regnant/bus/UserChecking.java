package com.regnant.bus;

import java.util.Iterator;
import java.util.List;


public class UserChecking {
	
	Bus agency = new Bus();
	List<Bus> bb = agency.busList;
	
	//Iterator<BusList>
	
	public void agencydetails() {
		
		for(Bus bu : agency.busList) {
			agency.busList.add(bu);
		}
		System.out.println(agency.busList);
	}
	
}
