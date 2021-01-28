package org.studyeasy;

import org.studyeasy.phone.Phone;
import org.studyeasy.phone.GooglePixel5;
import org.studyeasy.phone.SamsungJ7;

public class Hello {

	public static void main(String[] args) {
		
		/*
		Phone phoneObj = new Phone("Nokia 3320");
		System.out.println(phoneObj.getModel());
		phoneObj.features() ;
		
		GooglePixel5 pixelObj = new GooglePixel5("Pixel 5");
		System.out.println(pixelObj.getModel());
		pixelObj.features();
	*/
		
		
		//Phone pixel5 = new GooglePixel5("Pixel 5"); //for part 1
		Phone pixel5 = new Hello().phone(1); //this for part 2
		System.out.println(pixel5.getModel());
		pixel5.features();
		
		//Phone SamsungJ7 = new SamsungJ7("Samsung J7");//for part1
		Phone SamsungJ7 = new Hello().phone(2);//for part 2
		System.out.println(SamsungJ7.getModel());
		SamsungJ7.features();
	}
	
	//This for part 2 example
	
	//If I use the static method, I can use the part1 line for executing the program
	//but as I did not use the static method here, I have to use part2
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new GooglePixel5("Pixel 5");
		case 2: return new SamsungJ7("Samsung J7");
		}
		return null;
		
	}

}
