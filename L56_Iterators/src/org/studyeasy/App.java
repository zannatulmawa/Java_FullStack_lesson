package org.studyeasy;

import java.util.Collections;
import java.util.LinkedList;
//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("Bangladesh");
		countries.add("USA");
		countries.add("Germany");
		countries.add("Italy");
		countries.add("Paris");
		countries.add("Switzerland");
		countries.add("Australia");
		//new App().printList(countries);
		
		
		App appObj = new App();
		appObj.printList(countries);
		System.out.println("*****");
		countries.sort(null);
		appObj.printList(countries);
		System.out.println("*****");
		Collections.reverse(countries); //collection is the parent class for the list class
		appObj.printList(countries);
		
		

	}
	
	void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
