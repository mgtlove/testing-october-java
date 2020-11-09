package com.cognixia.jump.corejava.classes;

public class Patient {
	
	//Attributes
	public String name;
	private int temperature;
	boolean sick;
	
	//Constructor
	public Patient() {
		this.name = "";
		this.temperature = 0;
		this.sick = false;
	}
	//Overloaded Constructor (just another option)
	public Patient(String name, int temperature, boolean sick) {
		this.name = name;
		this.temperature = temperature;
		this.sick = sick;
	}
	
	//Methods
	public void getSick() {
		this.sick = true;
	}
	
	public void getHealthy() {
		this.sick = false;
	}
	
	// Special Methods - getters and Setters
	public void setName(String name) {
		this.name = name;
	}

}
