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
		AnimalType = "Wild";
		BloodType = "B+";
	}
	
	public Animal(Float height, Float weight, String animalType, String bloodType) {
		super();
		this.height = height;
		this.weight = weight;
		AnimalType = animalType;
		BloodType = bloodType;
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
