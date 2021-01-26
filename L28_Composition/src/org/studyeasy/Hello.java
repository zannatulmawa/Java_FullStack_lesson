package org.studyeasy;

import org.studyeasy.laptop.Laptop;


public class Hello {

	public static void main(String[] args) {
		Laptop lapObj = new Laptop();
		System.out.println(lapObj);
		
		//for 2nd part of the exp
		System.out.println(lapObj.getProcessor().getGeneration()); // In this way we can get method of objects of object
		System.out.println(lapObj.graphicsCard.band);
		System.out.println(lapObj.getGraphicsCard().get_Series());
	}

}
