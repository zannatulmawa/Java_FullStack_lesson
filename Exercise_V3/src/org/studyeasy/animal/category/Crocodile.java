package org.studyeasy.animal.category;

//import org.studyeasy.parent.Animal;
import org.studyeasy.animal.Reptile;

public class Crocodile extends Reptile {
	private String eggCategory;
	private Float height;
	
	public Crocodile() {
		this.eggCategory = "Hard-shelled eggs";
		this.height = 5.2f; 
	}
	
	public Crocodile(String eggCategory, Float height) {
		this.eggCategory = eggCategory;
		this.height = height;
	}
	
	public String geteggCategory() {
		return eggCategory;
	}
	
	


	public Float getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Crocodile [eggCategory=" + eggCategory + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
