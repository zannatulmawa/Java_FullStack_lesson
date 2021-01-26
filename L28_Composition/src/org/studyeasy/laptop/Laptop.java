package org.studyeasy.laptop;

import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class Laptop {
	
	private Float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	public GraphicsCard graphicsCard;
	private String opticalDrive;
	private String Keyboard;
	//super(); //super is the default constructor
		
	
	
	public Laptop() {
		//super();
		this.screen = 15.6f; //These are peramitarized constructors
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "MLT layer";
		Keyboard = "Backlit";
	}
	public Laptop(Float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		Keyboard = keyboard;
	}
	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", Keyboard=" + Keyboard + "]";
	}
	
	//for 2nd part of the example
	public Processor getProcessor() {
		return processor;
	}
	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}
	
	
	
	
}
