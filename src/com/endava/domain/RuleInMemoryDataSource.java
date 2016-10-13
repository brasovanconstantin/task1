package com.endava.domain;

import java.util.HashMap;

public class RuleInMemoryDataSource implements DataSource<Rule>{
	
	private HashMap<String, Rule> map = new HashMap<>();
	
	@Override
	public Rule read(String id) {
		return map.get(id);
	}

	@Override
	public String save(Rule entity) {
		String id = entity.getId();
		map.put(id, entity);
		return id;
	}

}
