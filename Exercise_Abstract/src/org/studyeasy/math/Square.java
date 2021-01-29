package org.studyeasy.math;

public class Square extends Geometry {
	
	private float height;
	private float width;
	
	
	
	public Square() {
		//super();
		this.height = 2f;
		this.width = 3f;
	}

	public Square(float height, float width) {
		//super();
		this.height = height;
		this.width = width;
	}



	@Override
	public double area() {
		return height * width;
	}
	

}
