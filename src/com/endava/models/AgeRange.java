package com.endava.models;

public class AgeRange {

	private int minAge;
	private int maxAge;

	public AgeRange() {
		super();
	}

	public AgeRange(int minAge, int maxAge) {
		super();
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		if (minAge >= 0) {
			this.minAge = minAge;
		}

	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		if((maxAge>= 1) && (maxAge <= 100))
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		return "AgeRange [minAge=" + minAge + ", maxAge=" + maxAge + "]";
	}

}
