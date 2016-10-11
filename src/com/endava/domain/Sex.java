package com.endava.domain;

public enum Sex {
	
	MALE, FEMALE;
	
	public static Sex getGender(String s) {
		if (s!=null) {
			for (Sex gender : Sex.values()) {
				if (s.equalsIgnoreCase(gender.toString())) {
					return gender;
				}
			}
		}
		return null;
	}
	
	
}
