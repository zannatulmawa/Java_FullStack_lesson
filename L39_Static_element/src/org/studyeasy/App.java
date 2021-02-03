package org.studyeasy;

import org.studyeasy.test.TestStatic;

public class App {

	public static void main(String[] args) {
		//TestStatic obj1 = new TestStatic();
		System.out.println(TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(1);
		System.out.println(TestStatic.getStaticVariable());
		
		//TestStatic obj2 = new TestStatic();
		System.out.println("The current value is " + TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(122);
		System.out.println("The current value is " + TestStatic.getStaticVariable());
		
		//TestStatic obj3 = new TestStatic();
		System.out.println("The current value is " + TestStatic.getStaticVariable());

	}

}
