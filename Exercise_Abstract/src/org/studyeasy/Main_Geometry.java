package org.studyeasy;

import org.studyeasy.math.Geometry;
import org.studyeasy.math.Square;
import org.studyeasy.math.Circle;

public class Main_Geometry {

	public static void main(String[] args) {
		Geometry squareObj = new Square(3,4);
		System.out.println(squareObj.area());
		Geometry circleObj = new Circle (5);
		System.out.println(circleObj.area());
		
		
		squareObj.calculation();

	}

}
