package com.endava.domain;

public class CommandFactory{

	public static Command newCommand(String[] args){
		
		switch (args[0].toLowerCase().trim()) {
		case "create":
			return new CreateCommand(args);
		case "exit":
			System.exit(0);	
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
			System.out.println("Wrong command");
			break;
		}
		
		return null;
		
	}
	

}
