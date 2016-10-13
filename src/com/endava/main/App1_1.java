package com.endava.main;

import java.util.Scanner;

import com.endava.domain.Command;
import com.endava.domain.CommandFactory;

public class App1_1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Write a comand");
		
		String input;
		

		while (true) {
			input = keyboard.nextLine().toLowerCase().trim();
			String[] words = input.split(" ");
			Command command;
			try {
				command = CommandFactory.newCommand(words);
				command.doStuff();
			} catch (NullPointerException e) {
				//e.printStackTrace();
			}
			
			//create person firstName,lastName,15,male,false
			//create rule 15,20,male,true,200.0
		}
		
		
	}

}
