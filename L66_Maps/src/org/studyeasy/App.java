package org.studyeasy;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, String> student = new HashMap<>();
		student.put(1,  "Mawa");
		student.put(2,  "Bony");
		student.put(3,  "Ridwone");
		student.put(4,  "Anu");
		
		for(Map.Entry<Integer, String> entry: student.entrySet()) { //entry is a dataset for the map
			System.out.println("Key: " + entry.getKey());
			System.out.println("Key: " + entry.getValue());
			
			for(Integer key:student.keySet()) {
				System.out.println("Key: " +key+ "value: " + student.get(key));
			}
		}
		
		//System.out.println(student.get(3));

	}

}
