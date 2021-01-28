package org.studyeasy;

public class Animal {

	private Float height;
	private Float weight;
	private String AnimalType;
	private String BloodType;
	
	
	public Animal() { //constructor
		//super();
		this.height = 2.5f;
		this.weight = 30.5f;
		this.AnimalType = "Pet";
		this.BloodType = "B+";
	}
	
	public Animal(Float height, Float weight, String animalType, String bloodType) { //constructor
		//super();
		this.height = height;
		this.weight = weight;
		this.AnimalType = animalType;
		this.BloodType = bloodType;
	}

	
	
}
