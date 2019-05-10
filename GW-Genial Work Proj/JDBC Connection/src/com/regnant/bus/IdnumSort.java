package com.regnant.bus;

import java.util.Comparator;

public class IdnumSort implements Comparator<Bus> {

	@Override
	public int compare(Bus ref1, Bus ref2){
		if(ref1.idnum==ref2.idnum) {
			return 0;
		}
		else if(ref1.idnum>ref2.idnum) {
			return 1;
		}
		else
		return -1;
	}
}

class TravelAgencySort implements Comparator<Bus> {

	@Override
	public int compare(Bus ref1, Bus ref2) {
		return ref1.agency.compareToIgnoreCase(ref2.agency);
	}
}
