package org.studyeasy;

import org.studyeasy.animal.Reptile;
import org.studyeasy.animal.category.Crocodile;
import org.studyeasy.animal.category.Eagle;
import org.studyeasy.animal.category.Eel;

public class Anim {

	public static void main(String[] args) {
		Reptile repObj = new Reptile();
		Crocodile croObj = new Crocodile();
		
		
		System.out.println(croObj.geteggCategory());
		
		System.out.println(repObj.getBloodType());
		System.out.println(repObj.getAnimalType());
		//System.out.println(repObj.);
		System.out.println(croObj);
		//Bird birdObj = new Bird();
		System.out.println(new Eagle());
		System.out.println(new Eel());
	}	

}
