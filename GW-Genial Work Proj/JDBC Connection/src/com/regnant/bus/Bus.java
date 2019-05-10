package com.regnant.bus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bus {

	String agency;
	int idnum;
	String regnum;
	Travelling travel;
	List<Bus> busList = new ArrayList<>();

	public List<Bus> getDetails() {
		Bus b1 = new Bus();
		b1.agency = "Orange";
		b1.idnum = 12;
		b1.regnum = "TS 12";
		b1.travel = new Travelling();
		b1.travel.route = "BLR-HYD";
		b1.travel.acType = "AC";
		b1.travel.seaterType = "Semi-Sleeper";
		busList.add(b1);

		Bus b2 = new Bus();
		b2.agency = "MorningStar";
		b2.idnum = 123;
		b2.regnum = "TS 123";
		b2.travel = new Travelling();
		b2.travel.route = "BLR-HYD";
		b2.travel.acType = "AC";
		b2.travel.seaterType = "Sleeper";
		busList.add(b2);

		Bus b3 = new Bus();
		b3.agency = "APSRTC";
		b3.idnum = 121;
		b3.regnum = "AP 121";
		b3.travel = new Travelling();
		b3.travel.route = "BLR-HYD";
		b3.travel.acType = "Non-AC";
		b3.travel.seaterType = "Semi-Sleeper";
		busList.add(b3);

		Bus b4 = new Bus();
		b4.agency = "Orange";
		b4.idnum = 12;
		b4.regnum = "TS 121";
		b4.travel = new Travelling();
		b4.travel.route = "BLR-GOA";
		b4.travel.acType = "AC";
		b4.travel.seaterType = "Semi-Sleeper";
		busList.add(b4);

		Bus b5 = new Bus();
		b5.agency = "MorningStar";
		b5.idnum = 123;
		b5.regnum = "TS 123";
		b5.travel = new Travelling();
		b5.travel.route = "BLR-GOA";
		b5.travel.acType = "AC";
		b5.travel.seaterType = "Sleeper";
		busList.add(b5);

		Bus b6 = new Bus();
		b6.agency = "APSRTC";
		b6.idnum = 121;
		b6.regnum = "TS 121";
		b6.travel = new Travelling();
		b6.travel.route = "BLR-GOA";
		b6.travel.acType = "AC";
		b6.travel.seaterType = "Semi-Sleeper";
		busList.add(b6);

		Bus b7 = new Bus();
		b7.agency = "Orange";
		b7.idnum = 12;
		b7.regnum = "TS 123";
		b7.travel = new Travelling();
		b7.travel.route = "HYD-MAA";
		b7.travel.acType = "AC";
		b7.travel.seaterType = "Sleeper";
		busList.add(b7);

		Bus b8 = new Bus();
		b8.agency = "MorningStar";
		b8.idnum = 123;
		b8.regnum = "TS 123";
		b8.travel = new Travelling();
		b8.travel.route = "HYD-MAA";
		b8.travel.acType = "Non-AC";
		b8.travel.seaterType = "Semi-Sleeper";
		busList.add(b8);

		Bus b9 = new Bus();
		b9.agency = "APSRTC";
		b9.idnum = 121;
		b9.regnum = "TS 123";
		b9.travel = new Travelling();
		b9.travel.route = "HYD-MAA";
		b9.travel.acType = "Non-AC";
		b9.travel.seaterType = "Semi-Sleeper";
		busList.add(b9);

		Bus b10 = new Bus();
		b10.agency = "Orange";
		b10.idnum = 12;
		b10.regnum = "TS 123";
		b10.travel = new Travelling();
		b10.travel.route = "BLR-MAA";
		b10.travel.acType = "AC";
		b10.travel.seaterType = "Semi-Sleeper";
		busList.add(b10);

		Bus b11 = new Bus();
		b11.agency = "MorningStar";
		b11.idnum = 123;
		b11.regnum = "TS 123";
		b11.travel = new Travelling();
		b11.travel.route = "BLR-MAA";
		b11.travel.acType = "AC";
		b11.travel.seaterType = "Semi-Sleeper";
		busList.add(b11);

		Bus b12 = new Bus();
		b12.agency = "APSRTC";
		b12.idnum = 121;
		b12.travel = new Travelling();
		b12.regnum = "TS 123";
		b12.travel.route = "BLR-MAA";
		b12.travel.acType = "AC";
		b12.travel.seaterType = "Semi-Sleeper";
		busList.add(b12);
		
		//Collections.sort(busList, new IdnumSort());
		//Collections.sort(busList, new TravelAgencySort());
		
		return busList;
	}

}
