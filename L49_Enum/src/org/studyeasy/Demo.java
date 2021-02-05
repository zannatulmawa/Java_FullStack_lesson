package org.studyeasy;

public class Demo {

	public static void main(String[] args) {
		Learning learn = Learning.COLLECTIONS;
		
		switch(learn) {
		case COLLECTIONS:
			System.out.println("Step 2:Learning collection frameworks");
			break;
		case COREJAVA:
			System.out.println("Step 1:Learning core java");
			break;
		case GENERICS:
			System.out.println("Step 3: Learning Generics");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 4: Learning JSP and Servelets");
			break;
		case MULTITHREADING:
			System.out.println("Step 5: Learning multithreading");
			break;
		default:
			System.out.println("Not in the List");
			break;
		
		}

	}

}
