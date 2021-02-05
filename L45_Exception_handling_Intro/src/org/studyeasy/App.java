package org.studyeasy;

public class App {

	public static void main(String[] args) {
		App obj = new App();
		obj.case1(10, 5);

	}
	
	public void case1(int x, int y) {
		if(y != 0) {
			System.out.println(x/y);
		} else {
			System.out.println("the value is 0");
		}
		
	}
	
	public void case2(int x, int y) {
		try {
			System.out.println();
		}catch (Exception e) {
			System.out.println("The value is 0");
		}
		
	}

}
