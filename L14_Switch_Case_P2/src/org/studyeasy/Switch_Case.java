package org.studyeasy;

public class Switch_Case {

	public static void main(String[] args) {
		char x = 'A';
		
		switch(x) {
		case 'a':
		case 'A':	
			System.out.println("The value of x is 1"); //code block {} is optional here for every line. 
				break;
		case 'b': System.out.println("The value of x is 2");
				break;
		case 'c': System.out.println("The value of x is 3");
				break;
		case 'd': System.out.println("The value of x is 4");
				break;
		default: System.out.println("The value of x is different");
				break;
			
		}

	}

}
