package org.studyeasy.animal.category;

//import org.studyeasy.parent.Animal;
import org.studyeasy.animal.Reptile;

public class Crocodile extends Reptile {
	private String eggCategory;
	
	public Crocodile() {
		this.eggCategory = "Hard-shelled eggs";
	}
	
	public Crocodile(String eggCategory) {
		this.eggCategory = eggCategory;
	}
	
	public String geteggCategory() {
		return eggCategory;
	}
	
	public int showInfo() {
		return 0;
	}

	@Override
	public String toString() {
		return "Crocodile [eggCategory=" + eggCategory + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
