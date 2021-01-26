package org.studyeasy.vechicle;

import org.studyeasy.parent.Vechicle;

public class Bike extends Vechicle {
	private String handle;
	
	

	public Bike() {
		super();
		this.handle = "short";
	}



	public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank,lights);
		this.handle = handle;
	}



	public String getHandle() {
		return handle;
	}



	@Override //custom toString method
	public String toString() {
		return "Bike [handle=" + handle + ", getHandle()=" + getHandle() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}