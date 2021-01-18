package org.studyeasy;

import org.studyeasy.vechicle.Bike;
import org.studyeasy.vechicle.Car;


public class Demo {

	public static void main(String[] args) {
		Bike bikeobj = new Bike();
		bikeobj.handle = "Short"; //Initialize it with a default value, otherwise it won't get the value from vechicle package
									//That's why we use here the string "Short"
		bikeobj.engine ="Petrol";
		System.out.println(bikeobj.engine);
		
		Car carobj = new Car();
		carobj.steering = "Short";
		carobj.lights = "Sony";
		System.out.println(carobj.lights);
		

	}

}
