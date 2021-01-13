package org.studyeasy;

public class Loop_Revisited {

	public static void main(String[] args) {
		
		for(int i=1, j=1; i<10 && j<10; i++, j++) {
			j++;
			System.out.println("i is :" + i +" " + "and" + " " + "j is: " + j);
		}

	}

}
