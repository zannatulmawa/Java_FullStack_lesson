package org.studyeasy;

import org.studyeasy.shop.Door;

public class Shop {

	public static void main(String[] args) {
		
		
		//Door doorObj = new Door();
		
		
		if(new Door().isLockedDoor(args[0])) {//new Door() is called the anonymus object
			System.out.println("Shop is closed!");
		} else {
			System.out.println("Welcome!");
		}
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
