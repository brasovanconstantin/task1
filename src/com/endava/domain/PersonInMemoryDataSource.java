package com.endava.domain;

import java.util.HashMap;


public class PersonInMemoryDataSource implements DataSource<Person> {

	private HashMap<String, Person> map = new HashMap<>(); 
	
	@Override
	public Person read(String id) {		
		return map.get(id);
	}

	@Override
	public String save(Person entity) {
		String id = entity.getId();
		map.put(id, entity);
		return id;
	}

//	DataSource<Person> personDs = new PersonInMemoryDataSource();

}
