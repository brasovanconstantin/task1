package com.endava.main;

import java.util.Scanner;

import com.endava.domain.Commands;
import com.endava.domain.DataSource;
import com.endava.domain.Person;
import com.endava.domain.PersonInMemoryDataSource;
import com.endava.domain.Rule;
import com.endava.domain.RuleInMemoryDataSource;

public class App {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Write a comand: ");
		String input;
		DataSource<Person> persondDs = new PersonInMemoryDataSource();
		DataSource<Rule> ruleDs = new RuleInMemoryDataSource();

		// while (!input.equalsIgnoreCase(Commands.EXIT.toString())) {
		//
		// if (input.equalsIgnoreCase(Commands.CREATE.toString())
		// || input.equalsIgnoreCase(Commands.READ.toString())
		// || input.equalsIgnoreCase(Commands.UPDATE.toString())
		// || input.equalsIgnoreCase(Commands.DELETE.toString())) {
		// System.out.println("OK");
		//
		// } else {
		// System.out.println("Wrong command");
		//
		// }

		while (true) {

			input = keyboard.nextLine().toLowerCase().trim();

			switch (input) {
			case "exit":
				return;

			case "read":
				System.out.println("OK");
				break;

			case "update":
				System.out.println("OK");
				break;

			case "delete":
				System.out.println("OK");
				break;

			default:
				
				//create person firstName,lastName,15,male,false
				//create rule 15,20,male,true,200.0
				String[] words = input.split(" ");
				if (words[0].equalsIgnoreCase("create")) {
					if (words[1].equalsIgnoreCase("person")) {
						Person p = new Person(words[2]);
						String id = persondDs.save(p);
						System.out.println(id);
						Person savedPerson = persondDs.read(id);
						System.out.println(savedPerson.toString());
					} else if(words[1].equalsIgnoreCase("rule")) {
						Rule r = new Rule(words[2]);
						String id = ruleDs.save(r);
						System.out.println(id);
						Rule savedRule = ruleDs.read(id);
						System.out.println(savedRule.toString());
					}
				} else {
					System.out.println("Wrong Command");
				}

				break;
			}
			

		}
		
	}
}
