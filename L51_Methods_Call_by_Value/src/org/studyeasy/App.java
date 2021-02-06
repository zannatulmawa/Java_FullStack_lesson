package org.studyeasy;

public class App {

	public static void main(String[] args) {
		String[] names = {"Mawa", "Bony", "Ridwone", "Raihan", "Sohidul"};
		App app = new App();
		app.displayNames(names);
		System.out.println("***************");
		System.out.println(names[0]);
		
		int a = 1, b = 2;
		new App().dispNum(a,b);
		System.out.println(a);
		
		//int value = 22;
		//App app = new App(); 
		//app.displayValue(value);
		//System.out.println("Current value is " + value);
		
	}
	
	 //void displayValue(int value) {/*as we did not say anything about the method,
	 //that the method should be static or non static, that's why we are using the 
	 //class object to call the method. Here app is the class, so we are using
	 //app class object to call the displayValue method */
		//System.out.println("value is " + value);
		//value = 20;
		//System.out.println("value is " + value);
	
		
		
		
	
	void displayNames(String[] names2) { //pointer like functionality given
		names2[0] = "Tony";
		//System.out.println(names[0]);
		for(String i: names2) {
			System.out.println(i);
		}
		
		
	}
	void dispNum(int a, int b) { //values given
		a=10;
		System.out.println(a);
		
	}
	

}
