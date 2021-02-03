package org.studyeasy;

import org.studyeasy.person.Vegan;
import org.studyeasy.person.Person;
import org.studyeasy.person.NonVegan;



public class Main {

	public static void main(String[] args) {
		Person mawa = new NonVegan();
		Person bony = new Vegan();
		mawa.eat();
		mawa.message();
		mawa.walk();
		mawa.speak();
		
		System.out.println("*************");
		bony.eat();
		
		

	}

}
