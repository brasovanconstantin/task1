package com.endava.main;

import java.util.Scanner;

import com.endava.domain.Commands;
import com.endava.domain.Person;

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

			case "create":
				// System.out.println("OK");
				String[] words = input.split(" ");
				if (words[0].equalsIgnoreCase("create")
						&& words[1].equalsIgnoreCase("person")) {
					Person p = new Person(words[2]);
				}
				break;

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
				System.out.println("Wrong Command");
				break;
			}

		}
	}
}
