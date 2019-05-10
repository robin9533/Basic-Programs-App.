package com.regnant.bus;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Methods {
	Bus b = new Bus();
	List<Bus> bList = b.getDetails();

	void displayAll() {
		for (Bus bu : bList) {
			System.out.println("Bus details");
			System.out.println("Travel agency name: " + bu.agency);
			System.out.println("Bus serial num: " + bu.idnum);
			System.out.println("Bus reg num: " + bu.regnum);
			System.out.println("Bus route: " + bu.travel.route);
			System.out.println("Bus eminities: " + bu.travel.acType);
			System.out.println("Bus seater: " + bu.travel.seaterType + "\n");
		}
	}

	void getAgency() {
		Set<String> agencyset = new HashSet<>();
		for (Bus bu : bList) {
			agencyset.add(bu.agency);
		}
		System.out.println(agencyset);
	}

	void getRoute() {
		Set<String> route = new HashSet<>();
		for (Bus bu : bList) {
			route.add(bu.travel.route);
		}
		System.out.println(route);
	}

	void getSeaterType() {
		Set<String> seater = new HashSet<>();
		for (Bus bu : bList) {
			seater.add(bu.travel.seaterType);
		}
		System.out.println(seater);
	}

	void getEminitiesType() {
		Set<String> eminities = new HashSet<>();
		{
			for (Bus bu : bList) {
				eminities.add(bu.travel.acType);
			}
			System.out.println(eminities);
		}

	}
}
