package com.endava.domain;

public class AgeRange {

	private int minAge;
	private int maxAge;

	public AgeRange() {
	}

	public AgeRange(int minAge, int maxAge) {

		if ((minAge >= 0)) {
			this.minAge = minAge;
		} else {
			throw new IllegalArgumentException();
		}
		if ((maxAge >= minAge) && (maxAge <= Integer.MAX_VALUE)) {
			this.maxAge = maxAge;
		} else {
			throw new IllegalArgumentException();
		}

		this.maxAge = maxAge;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		return "AgeRange [minAge=" + minAge + ", maxAge=" + maxAge + "]";
	}

}
