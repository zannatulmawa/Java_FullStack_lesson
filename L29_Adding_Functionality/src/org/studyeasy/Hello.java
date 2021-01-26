package org.studyeasy;

import org.studyeasy.laptop.Laptop;
import org.studyeasy.laptop.components.Processor;
import org.studyeasy.laptop.components.GraphicsCard;


public class Hello {

	public static void main(String[] args) {
		
		Processor proObj = new Processor("intel", "7200U", 7, 4, 4, "6MB" + "", "2.5Ghz", "2.5Ghz", "3.5Ghz" );
		
		GraphicsCard graObj = new GraphicsCard("Nividia", 1050, "4GB" );
		Laptop gamingLap = new Laptop(17f,  proObj, "DDR4", "2TB", graObj, null, "backlit");
		System.out.println(gamingLap);
		gamingLap.gamingMode();
		System.out.println("Gaming mode on");
		System.out.println(gamingLap.getProcessor().getFrequency());
	}

}
