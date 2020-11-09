package com.cognixia.jump.corejava.classes;

public class ClinicDriver {

	public static void main(String[] args) {
		
		// Create some patient objects
		// we need the 'new' keyword to set aside space in mem. 
		// then we call one of our constructors to build our object
		Patient patient1 = new Patient(); 
		Patient patient2 = new Patient("Mike", 97, false);
		
		// Test print the names
		System.out.println(patient1.name);
		System.out.println(patient2.name);
		
		
		// Use some of our methods
//		System.out.println(patient2.sick + " " + patient2.temperature);
//		patient2.getSick();
//		System.out.println(patient2.sick + " " + patient2.temperature);
//		patient2.getHealthy();
//		System.out.println(patient2.sick + " " + patient2.temperature);
		
		// patients getting
//		for(int i = 1; i <=2; i++) {
//			
//		}
		

	}

}
