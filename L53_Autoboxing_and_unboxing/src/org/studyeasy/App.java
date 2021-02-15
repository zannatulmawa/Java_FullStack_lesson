package org.studyeasy;

import java.util.ArrayList;



class intWrapper{
	public int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
}

public class App {

	public static void main(String[] args) {
		/*ArrayList<Integer> studentNumbers = new ArrayList<>(); //Integer primitive object is working as a primitive data type, this is called a wrapper class.
		studentNumbers.add(25);//Autoboxing
		studentNumbers.add(22);
		System.out.println(studentNumbers.get(1));*/
		
		
		/*ArrayList<intWrapper> studentNumbers = new ArrayList<>();
		studentNumbers.add(new intWrapper(12)); //we are converting a primitive data into object
												//This is known as boxing
		System.out.println(studentNumbers.get(0).getIntValue()); //unboxing
		*/
		
		
		ArrayList<Double> demoList = new ArrayList<>();
		//System.out.println(demoList.add(21.5));
		//demoList.add(new Double(43.6));
		demoList.add(Double.valueOf(1.2)); //this is done while autoboxing
		System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); // this is done while unboxing
		
		
		
		
		
		
	}

}
