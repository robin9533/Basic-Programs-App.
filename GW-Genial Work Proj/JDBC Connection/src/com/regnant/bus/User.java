package com.regnant.bus;

public class User implements Comparable<User> {
	String name;
	int id;
	int Priority;

	@Override
	public int compareTo(User o) {
		if (this.id == o.id)
			return 0;
		else if (this.id > o.id) {
			return 1;
		} else
			return -1;
	}
}


