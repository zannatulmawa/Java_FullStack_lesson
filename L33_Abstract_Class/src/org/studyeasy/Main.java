package org.studyeasy;

import org.studyeasy.person.Vegan;
import org.studyeasy.person.Person;
import org.studyeasy.person.NonVegan;



public class Main {

	public static void main(String[] args) {
		Person Mawa = new Vegan();
		Mawa.speak();
		Mawa.eat();
		System.out.println("************");
		Person bony = new NonVegan();
		bony.eat();
		bony.speak();
		
		

	}

}
