package org.studyeasy;

public class App {

	public static void main(String[] args) {
		int x = 0; //int y = 5;
		try {
			//x = (y=10*10)/0;
			//System.out.println("Hello");
			
			}catch (ArithmeticException e) {
				System.out.println("arithmetic exception");
				
			}catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Inside exception block");
			
		}
		//System.out.println(y);
	}

}
