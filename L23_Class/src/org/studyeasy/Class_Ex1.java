package org.studyeasy;

public class Class_Ex1 {

	public static void main(String[] args) {
		Car carObj = new Car("closed", "on", "seated", 10); //Object of car class (Crating an object)
				//new Car (This is the way of creating custom data type, here Car is the constructor)
		
		
		//car.setSpeed(10);
		//System.out.println(car.getSpeed());
		
		/*
		carObj.setDoors("closed");
		carObj.setDriver("seated");
		carObj.setEngine("on");
		carObj.setSpeed(10);
		*/
		
		System.out.println(carObj.run());

	}

}
