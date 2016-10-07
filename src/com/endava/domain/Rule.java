package com.endava.domain;

public class Rule {

	private AgeRange personAgeRange;
	private Sex personGender;
	private boolean disable;
	private double cost;

	public Rule() {
		super();
	}

	public Rule(AgeRange personAgeRange, Sex personGender, boolean disable) {
		super();
		this.personAgeRange = personAgeRange;
		this.personGender = personGender;
		this.disable = disable;
	}

	public Rule(AgeRange personAgeRange, Sex personGender, boolean disable,
			double cost) {
		super();
		this.personAgeRange = personAgeRange;
		this.personGender = personGender;
		this.disable = disable;
		this.cost = cost;
	}

	public AgeRange getPersonAgeRange() {
		return personAgeRange;
	}

	public void setPersonAgeRange(AgeRange personAgeRange) {
		this.personAgeRange = personAgeRange;
	}

	public Sex getPersonGender() {
		return personGender;
	}

	public void setPersonGender(Sex personGender) {
		this.personGender = personGender;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Rule [personAgeRange=" + personAgeRange + ", personGender="
				+ personGender + ", disable=" + disable + ", cost=" + cost
				+ "]";
	}
	
	
}