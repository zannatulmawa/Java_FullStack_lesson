package org.studyeasy;

import java.io.FileNotFoundException;
//import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("Catch block of main method");
		}

	}
	
	/*
	public static void someMethod() { // Try and catch 
		try{
			FileReader in = new FileReader("file.txt");
		} catch(FileNotFoundException e) {
			System.out.println("Msg from catchblock");
			//e.printStackTrace();
		}
		System.out.println("Here u go");
	
	} */
	
	public static void someMethod() throws FileNotFoundException{//throws keyword
		//FileReader in = new FileReader("file.txt");
		
		System.out.println("Msg from catchblock");
		throw new FileNotFoundException();
		//System.out.println("Msg from catchblock");
	}

}
