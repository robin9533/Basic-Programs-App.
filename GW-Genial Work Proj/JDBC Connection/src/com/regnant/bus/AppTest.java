package com.regnant.bus;

public class AppTest {
	public static void main(String[] args) {
		Methods m = new Methods();
		m.displayAll();
		System.out.println(" ");
		System.out.println("Number of Bus agency Available");
		m.getAgency();
		System.out.println(" ");
		System.out.println("Bus routes Available");
		m.getRoute();
		System.out.println(" ");
		System.out.println("Bus Seating Facilities");
		m.getSeaterType();
		System.out.println(" ");
		System.out.println("Details of available Bus Eminsities ");
		m.getEminitiesType();
		System.out.println(" ");
		UserChecking u =  new UserChecking();
		u.agencydetails();
	}
}
