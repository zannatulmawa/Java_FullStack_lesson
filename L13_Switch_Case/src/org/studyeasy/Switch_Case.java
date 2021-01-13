package org.studyeasy;

public class Switch_Case {

	public static void main(String[] args) {
		int x = 9;
		
		/*
		if(x == 1) {
			System.out.println("The value of x is 1");
		}
		
		else if (x == 2) {
			System.out.println("The value of x is 2");
		}
		
		else if (x ==3 ){
			System.out.println("The value of x is 3");
		}
		
		else {
			System.out.println("The value of x is different");
		}


		*/
		
		
		switch(x) {
		case 1: System.out.println("The value of x is 1"); //code block {} is optional here for every line. 
				break;
		case 2: System.out.println("The value of x is 2");
				break;
		case 3: System.out.println("The value of x is 3");
				break;
		case 4: System.out.println("The value of x is 4");
				break;
		default: System.out.println("The value of x is different");
				break;
			
		}
	}

}
