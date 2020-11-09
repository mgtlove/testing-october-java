package com.cognixia.jump.corejava;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {

		// If statement (stand alone)
		System.out.println("If example:\n");

		// Our printed prompt to the user so we don't just see a blank cursor
		System.out.println("Enter an integer: ");
		// After importing, we need instantiate a new Scanner object with read from
		// keyboard constructor
		Scanner userInput = new Scanner(System.in);
		// Line 18 is doing the actual reading of what you type and then hit 'enter'
		int checkInt = 0;
		boolean valid = userInput.hasNextInt();
		if (valid) {
			checkInt = userInput.nextInt();
		}
		
		double newDub = 49;
		
		// New Scanner taking different input
		Scanner userInputAlt = new Scanner(System.in);
		
		System.out.println("Type in anything - we'll store as a string");
		String stringIn = userInputAlt.nextLine();
		
		System.out.println(newDub / 10);

		if (checkInt % 10 == 0) {
			System.out.println("We are divisible by 10!");
		}

		System.out.println("We are going on with the program");

		// If - else, and else - if
		System.out.println("\nIf - else and else if:\n");
		checkInt = 45;
		if (checkInt % 10 == 0) {
			System.out.println("Divisible by 10!");
		}

		else if (checkInt % 5 == 0) {
			System.out.println("Divisible by 5!");
		}

		else {
			System.out.println("No match.");
		}

		// Logical Condition Operators (some combinations)
		System.out.println("\nIf conditional operators:\n");
		checkInt = 45;
		if (!(checkInt > 50 ^ checkInt % 5 == 0)) {
			System.out.println("success");
		}

		// Nested Conditionals
		checkInt = 45;
		System.out.println("\n Nested conditionals:\n");
		if (checkInt % 5 == 0) {
			if (checkInt % 2 == 0) {
				System.out.println("Your num is divis. by 10");
			} else {
				System.out.println("Divis. by 5, but not by 10");
			}
		}
		
		String input = "sefsf";
		
		if(input == "sefsf") {
			System.out.println("User input yes");
		}

		// Switch Statement (ATM Example)
		System.out.println("\nswitch ATM example:\n");
		
		// Our ATM display menu
		System.out.println("Welcome to the JUMP ATM.  Please choose from the\n"
				+ "options below:");
		System.out.println("Press 1 for Balance\n"
				+ "Press 2 for deposit\n"
				+ "Press 3 for withdraw\n"
				+ "Press 4 to Exit");
		
		//Hard code different user inputs
		checkInt = 3;
		// The Switch case is the logic only
		switch(checkInt) {
		case 1:
			System.out.println("You want to check balance");
			break;
		case 2:
			System.out.println("You want to deposit");
			break;
		case 3:
			System.out.println("You want to withdraw");
			break;
		case 4:
			System.out.println("You want to exit");
		default:
			System.out.println("Exiting");
		}
		
		char charIn = ' ';
		charIn = 'A';
		switch (charIn) {
		case 'a':
		case 'A':
			System.out.println("You chose the char a or A");
			break;
		case 'b':
		case 'B':
			System.out.println("You chose the char b or B");
		default:
			break;
		}
		
		// Ternary Operator
		int n1 = 5, n2 = 10, max;
		
		// max will get set to something, based on a condition (n1 or n2)
		// (this is the condition) ? -> this sepaates the condtion from outputs
		// the right of the ?, is what happens if true : false
		// ? true : false;
		max = (n1 > n2) ? n1 : n2;
		
		if(n1 > n2) {
			max = n1;
		}
		else {
			max = n2;
		}
		
		System.out.println(max);
		
		userInput.close();
		userInputAlt.close();

	}

}
