package com.endava.domain;

import java.util.List;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Person{

	private String firstName;
	private String lastName;
	private int age;
	private Sex gender;
	private Boolean disable;
	private String id;
	private static int counter = 0;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int age, Sex gender,
			Boolean capacity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.disable = capacity;
		this.id = "" + counter++;
	}

	public Person(String s) {

		String[] person = s.split(",");
		this.firstName = person[0];
		this.lastName = person[1];
		this.age = Integer.parseInt(person[2]);
		this.gender = Sex.getGender(person[3]);
		this.disable = Boolean.parseBoolean(person[4]);
		this.id = "" + counter++;
	}

	public String getId() {
		return id;
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

	public Boolean isCapacity() {
		return disable;
	}

	public void setCapacity(Boolean disable) {
		this.disable = disable;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", gender=" + gender + ", capacity="
				+ disable + "]";
	}

	/*
	 * public static List<Person> filter(List<Person> persons) { List<Person>
	 * maleList = new ArrayList<>(); for (Person person : persons) { if
	 * (person.getGender() == Sex.MALE) { maleList.add(person); } } return
	 * maleList; }
	 */

	/*
	 * public static Predicate<Person> isMale() { return p -> p.getGender() ==
	 * Sex.MALE; }
	 */

	static class PersonPredicate {

		public static final BiPredicate<Person, AgeRange> IS_IN_RANGE = (
				Person p, AgeRange a) -> p.getAge() >= a.getMinAge()
				&& p.getAge() <= a.getMaxAge();

		public static final Predicate<Person> IS_MALE = p -> p.getGender() == Sex.MALE;

		public static final Predicate<Person> IS_DISABLE = p -> p.isCapacity() == false;

	}

	public static List<Person> filterPersons(List<Person> persons,
			Predicate<Person> predicate) {

		return persons.stream().filter(predicate)
				.collect(Collectors.<Person> toList());
	}
	
}
