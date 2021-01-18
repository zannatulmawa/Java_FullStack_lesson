package org.studyeasy;

public class Car {

	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	private String doors; //private is a method
	private String engine;
	private String driver;
	private int speed;
	
	public void setSpeed(int speed) { //method
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
}