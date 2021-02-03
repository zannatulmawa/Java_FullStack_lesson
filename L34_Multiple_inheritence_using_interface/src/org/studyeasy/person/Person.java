package org.studyeasy.person;

public abstract class Person implements IsAlive, LiveLife {
	public void speak() {
		System.out.println("Types of Person! ");
	}
	
	
	public void message() {
		System.out.println("Always try to keep happy! ");
	}
	
	
	public void walk() {
		System.out.println("Need to do exercise everyday! ");
	}
	
	
	public abstract void eat();
	

}
