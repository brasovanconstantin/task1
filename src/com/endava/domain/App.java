package com.endava.domain;

import java.util.Scanner;

public class App {

	static Scanner keyboard;

	public static void main(String[] args) {

		keyboard = new Scanner(System.in);

		System.out.println("Write a comand: ");
		String input = keyboard.nextLine().toLowerCase();

		while (!input.equalsIgnoreCase(Comands.exit.toString())) {

			if (input.equalsIgnoreCase(Comands.create.toString())
					|| input.equalsIgnoreCase(Comands.read.toString())
					|| input.equalsIgnoreCase(Comands.update.toString())
					|| input.equalsIgnoreCase(Comands.delete.toString())) {
				System.out.println("OK");

			} else {
				System.out.println("Wrong command");

			}

			input = keyboard.nextLine().toLowerCase();
		}

	}

}
