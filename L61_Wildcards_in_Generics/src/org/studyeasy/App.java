package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int vehicleId;

	public Vehicle(int vehicleId) {
		//super();
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}
	
	void info() {
		System.out.println("vehicle ID is " +getVehicleId());
	}
	
}

class Car extends Vehicle{
	private String CarModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		CarModel = carModel;
	}

	public String getCarModel() {
		return CarModel;
	}

	@Override
	public String toString() {
		return "Car [CarModel=" + CarModel + "]";
	}
	
	void info() {
		System.out.println("Car model is " +getCarModel());
	}
}

public class App {

	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "Toyota Camry"));
		//list.add(new String("My car"));
		display(list);

	}
	
	/* Here, extends vehicle is a upper-bond , which means only the list of the
	 * property of parent class like vehicle or its child class
	 * like car can be displayed*/
	
	/* public static void display(List <? super Car> list) 
	 * here car is the lower-bound which uses super that means it can only allow
	 * the properties of car or it's super class*/
	public static void display(List <? extends Vehicle> list) { //As we don't know the list category(vehicle/car), that's why we are using (?) as a wildcards generic
		for(Vehicle element: list) {
			element.info();
		}
	}

}
