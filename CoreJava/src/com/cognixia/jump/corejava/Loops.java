package com.cognixia.jump.corejava;

public class Loops {

	public static void main(String[] args) {
		
		//While Loop
		System.out.println("While Loop:");
		
		int count = 0;
		boolean condition = true;
		while (true) {
			
			if(count % 2 != 0) {
				System.out.println(count);
			}
			count++;
			if(count % 25 == 0) {
				//condition = false;
				break;
				//return; //or use break;
			}
		}
		
		
		//Do - While at least one iteration
		System.out.println("\nDo While Example");
		
		int count1 = 11;
		do {
			System.out.println("in the loop");
			count1++;
			
		} while(count1 < 10);
		
		
		
		//For Loop
		System.out.println("\nFor Loops:");
		
		for(int i = 50; i > -5; i--) {
//			int x = 1;
//			x+=1;
			// same thing x = x + 1;
			System.out.println(i);
		}
		
		//Nested Loop
		System.out.println("\nNested Loops:");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(i + "" + j);
			}
		}

	}

}
