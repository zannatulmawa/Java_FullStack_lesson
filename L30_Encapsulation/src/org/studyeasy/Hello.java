package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		Person mawa = new Person(); //Encapsulate data don't get access to the outside world
		System.out.println(mawa);
		Person bony = new Person("Bony", 30, "Male");
		System.out.println(bony);
		bony.setAge (32);
		System.out.println(bony);
		

	}

}
