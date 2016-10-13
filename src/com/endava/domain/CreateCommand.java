package com.endava.domain;

public class CreateCommand implements Command {
	
	
	private String type;
	private String value;

	public CreateCommand(String[] args) {
		
		this.type = args[1];
		this.value = args[2];
	}
	
	DataSource<Person> personDs = new PersonInMemoryDataSource();
	DataSource<Rule> ruleDs = new RuleInMemoryDataSource();


	@Override
	public void doStuff() {
		
		if (type.equalsIgnoreCase("person")) {
			Person person = new Person(value);
			String id = personDs.save(person);
			System.out.println(id);
			Person savedPerson = personDs.read(id);
			System.out.println(savedPerson.toString());
		} else if (type.equalsIgnoreCase("rule")) {
			Rule rule = new Rule(value);
			String id = ruleDs.save(rule);
			System.out.println(id);
			Rule savedRule = ruleDs.read(id);
			System.out.println(savedRule.toString());
		} 
		
	}
	
	

}
