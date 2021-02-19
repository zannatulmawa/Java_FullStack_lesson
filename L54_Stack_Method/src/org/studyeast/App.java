package org.studyeast;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack <Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		//demo.pop();
		demo.push(40);
		
		
		
		
		
		if (demo.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is not empty");
		}
		
		System.out.println(demo.search(40));
		
		
		for (Integer temp: demo) {
			System.out.println(temp);
		}
		
		
		System.out.println("*********");
		System.out.println(demo.peek()); //It will get the last element
		
		
	}
	
	

}
