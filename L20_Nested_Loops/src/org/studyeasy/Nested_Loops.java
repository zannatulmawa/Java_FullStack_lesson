package org.studyeasy;

public class Nested_Loops {

	public static void main(String[] args) {
		
		/*
		for(int i =1; i<=10; i++) {
			for ( int j = 1; j<=10; j++) {
				System.out.println("Value of i is:" + i + "value of j is: " + j);
			}
			System.out.println("****************");
		}
		*/
		
		
		int itr = 5;
		
			for (int j=1; j<=itr; j++) { //row
				for (int i=1; i<=j; i++) { //column
				System.out.print("@");
				}
				System.out.println();
			}
		
			
			for (int j=1; j<=4; j++) {    
				for (int i=1; i<=j; i++) {
				System.out.print(i);
				}
				System.out.println();
			}
			
			for (int j=1; j<=3; j++) {    
				for (int i=1; i<=j; i++) {
				System.out.print(i+j);
				}
				System.out.println();
			}
					
	}

}
