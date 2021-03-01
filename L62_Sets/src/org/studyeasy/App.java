package org.studyeasy;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Mawa");
		set.add("Bony");
		set.add("Gony");
		set.add("Tony");
		set.add("Honey");
		set.add("Mawa");
		
		for(String charecter: set) {
			System.out.println(charecter);
		}
		
		System.out.println(set.contains("One"));

	}

}
