package org.studyeasy;

import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;
import org.studyeasy.phone.Iphone9;

public class Main {

	public static void main(String[] args) {
		//OnePlus5 oneObj = new OnePlus5();
		//int processor = oneObj.processor();
		//System.out.println(oneObj.processor());
		
		Phone phoneObj = new OnePlus5(); /*Here Phone is a interface that is implemented by
											our class OnePlus5 (polymorphism) */
		System.out.println(phoneObj.processor());
		
		Phone phObj = new Iphone9(); // We can use any class which interfaces phone class
									//This is the advantage of interface
		System.out.println(phObj.spaceInGB());
		
		

	}

}
