package org.studyeasy;

import java.util.ArrayList;

public class Demo {
	
	
	static ArrayList<String> listNames = new ArrayList<>();
	
	public static void main(String[] args) {
		listNames.add("Mawa");
		listNames.add("Bony");
		listNames.add("Ridwone");
		listNames.add("Ananna");
		listNames.add("Chamaly");
		listNames.add("Amzad");
		listNames.add("Morjina");
		//System.out.println(listNames);
		//System.out.println(listNames.get(1));
		
		Demo demoObj = new Demo();
		demoObj.displayList(listNames);
		System.out.println("***************");
		int position = demoObj.serach("Chamaly");
		if(position != -1) {
			demoObj.modifyName(position, "Lazly");
			demoObj.displayList(listNames);
		} else {
			System.out.println("Invalid entry");
		}
		
		
		
		demoObj.removeNameByPosition(0);
		System.out.println("***************");
		demoObj.displayList(listNames);
		
		
		System.out.println("***************");
		Demo nameObj = new Demo();
		nameObj.removeNameByName("Morjina");
		nameObj.displayList(listNames); 

	}
	void displayList(ArrayList<String> names) {
		for(String name: names) {
			System.out.println(name);
		}
	}
	
	void removeNameByPosition(int position) {
		listNames.remove(position);
	}
	void removeNameByName(String name) {
		listNames.remove(name);
	}
	
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}
	
	int serach(String name) {
		return listNames.indexOf(name);
	}

}
