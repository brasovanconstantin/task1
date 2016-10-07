package com.endava.domain;

import java.util.ArrayList;
import java.util.List;


public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private Sex gender;
	private boolean capacity;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int age, Sex gender,
			boolean capacity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.capacity = capacity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public boolean isCapacity() {
		return capacity;
	}

	public void setCapacity(boolean capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", gender=" + gender + ", capacity="
				+ capacity + "]";
	}

	public List<Person> filter(List<Person> persons) {
		List<Person> maleList = new ArrayList<>();
		for (Person person : persons) {
			if (person.getGender() == Sex.MALE) {
				maleList.add(person);
			}
		}
		return maleList;
	}
}
