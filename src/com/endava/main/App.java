package com.endava.main;

import java.util.Scanner;

import com.endava.domain.Commands;
import com.endava.domain.Person;
import com.endava.domain.Rule;

public class App {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Write a comand: ");
		String input;

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

			input = keyboard.nextLine().toLowerCase();

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
				
				//create person fff,lll,15,male,false
				//create rule 15,20,male,true,200.0
				String[] words = input.split(" ");
				if (words[0].equalsIgnoreCase("create")) {
					if (words[1].equalsIgnoreCase("person")) {
						Person p = new Person(words[2]);
						System.out.println(p.toString());
					} else if(words[1].equalsIgnoreCase("rule")) {
						Rule r = new Rule(words[2]);
						System.out.println(r.toString());
					}
				} else {
					System.out.println("Wrong Command");
				}

				break;
			}
			

		}
	}
}
