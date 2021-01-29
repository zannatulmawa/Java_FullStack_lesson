package org.studyeasy.math;

public class Circle extends Geometry {
	
	private float radius;
	private double num_pi = Math.PI;
	
	
	public Circle() {
		//super();
		this.radius = 2f;
	}
	public Circle(float radius) {
		//super();
		this.radius = radius;
	}
	
	public float func_square(float a) {
		return a*a;
	}


	@Override
	public double area() {
		return num_pi * func_square(radius);
	}

}
