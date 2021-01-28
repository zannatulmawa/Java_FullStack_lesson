package org.studyeasy.person;

public abstract class Person {
	public void speak() {
		System.out.println("Good Morning");
	}
	
	
	//If the relation between classes indicates (is a relationship) then we will go for abstract class
	//-- for example (a person is a vegan or non-vegan)
	//If the relation between classes indicates (can a relationship) or symbolizes an action(can sing or can't sing) then we will go for Interfaces class
	//--for example (a person can sing or can't sing)
	
	
	public abstract void eat();
	

}
