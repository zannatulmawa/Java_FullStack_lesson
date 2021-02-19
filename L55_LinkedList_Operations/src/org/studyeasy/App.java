package org.studyeasy;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("Bangladesh");
		countries.add("USA");
		countries.add("Germany");
		countries.add("Italy");
		countries.add("Paris");
		countries.add("Switzerland");
		countries.add("Australia");
		new App().printList(countries);
		countries.add(1, "Canada");
		new App().printList(countries);
		countries.set(3, "Malaysia");
		new App().printList(countries);
		countries.remove(4);
		new App().printList(countries);
		
	}
	void printList(LinkedList<String> list) {
		for(String element: list) {
			System.out.println("Element: " + element);
		}
		System.out.println("****************");
	}

}
