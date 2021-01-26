package org.studyeasy.laptop.components;

public class GraphicsCard {
	public String band; //properties
	private int series;
	private String memory;
	
	public GraphicsCard() { //constructor
		//super();
		this.band = "Nvidia";
		this.series = 940;
		this.memory = "2GB";
	}
	

	public GraphicsCard(String band, int series, String memory) { //constructor
		//super();
		this.band = band;
		this.series = series;
		this.memory = memory;
	}


	@Override
	public String toString() {
		return "GraphicsCard [band=" + band + ", series=" + series + ", memory=" + memory + "]";
	}
	
	public int get_Series() {
		return series;
	}
	
	
}
