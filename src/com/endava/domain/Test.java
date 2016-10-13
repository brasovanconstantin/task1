package com.endava.domain;

import java.util.UUID;

public class Test {

	public static void main(String[] args) {

		String id = UUID.randomUUID().toString();

		for (int i = 0; i < 5; i++) {
			System.out.println(id);
		}
	}

}
