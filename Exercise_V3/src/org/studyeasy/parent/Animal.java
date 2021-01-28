package org.studyeasy.parent;

public class Animal {
	private Float height;
	private Float weight;
	private String AnimalType;
	private String BloodType;
	
	
	public Animal() {
		//super();
		this.height = 2.3f;
		this.weight = 3.4f;
		this.AnimalType = "Wild";
		this.BloodType = "B+";
	}
	
	public Animal(Float height, Float weight, String animalType, String bloodType) {
		super();
		this.height = height;
		this.weight = weight;
		this.AnimalType = animalType;
		this.BloodType = bloodType;
	}

	public Float getHeight() {
		return height;
	}

	public Float getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return AnimalType;
	}

	public String getBloodType() {
		return BloodType;
	}
	
	
	
	
}
