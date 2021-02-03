package org.studyeasy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //input is a object here
		System.out.println("What's your name?");			
		String name = input.nextLine();
		System.out.println("How old are you?");
		int age = input.nextInt();
		input.close();
		System.out.println("Hey there " + name + " " + "Good Morning" + " are you " + age + " years old?");

	}

}
