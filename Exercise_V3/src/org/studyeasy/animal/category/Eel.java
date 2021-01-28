package org.studyeasy.animal.category;

import org.studyeasy.animal.Fish;

public class Eel extends Fish {
	private String ability;
	
	public Eel() {
		this.ability = "release electric charge";
	}
	
	public Eel(String ability) {
		this.ability = ability;
	}
	
	public String getability() {
		return ability;
	}

	@Override
	public String toString() {
		return "Eel [ability=" + ability + ", getHabitant()=" + getHabitant() + ", getProperty()=" + getProperty()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}


