package org.studyeasy;

public class Switch_Case {

	public static void main(String[] args) {
		String name = "teaCher";
		
		switch(name.toLowerCase()) {
		case "author": System.out.println("The value of x is Mawa"); //code block {} is optional here for every line. 
				break;
		case "team": System.out.println("The value of x is Bony");
				break;
		case "editor": System.out.println("The value of x is Ridwone");
				break;
		case "teacher": System.out.println("The value of x is Raihan");
				break;
		default: System.out.println("The value of x is different");
				break;
			
		}
				
				

	}

}
