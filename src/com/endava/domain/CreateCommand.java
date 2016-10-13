package com.endava.domain;

public class CreateCommand implements Command {
	
	
	private String type;
	private String value;

	public CreateCommand(String[] args) {
		
		this.type = args[1];
		this.value = args[2];
	}


	@Override
	public void doStuff() {
		
		if (type.equalsIgnoreCase("person")) {
			Person person = new Person(value);
			System.out.println(person.toString());
		} else if (type.equalsIgnoreCase("rule")) {
			Rule rule = new Rule(value);
			System.out.println(rule.toString());
		} 
		
	}
	
	

}
