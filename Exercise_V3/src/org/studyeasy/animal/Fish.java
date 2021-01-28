package org.studyeasy.animal;

import org.studyeasy.parent.Animal;

public class Fish extends Animal {
	private String habitant;
	private String property;
	
	
	public Fish() {
		this.habitant = "Lives in water";
		this.property = "Has gills";
	}
	
	
	public Fish(String habitant, String property) {
		this.habitant = habitant;
		this.property = property;
		
	}


	public String getHabitant() {
		return habitant;
	}


	public String getProperty() {
		return property;
	}
	
	
}
