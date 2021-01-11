package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		
		//explicit: backward
		int y = 10;
		//short x = y;  // it won't work
		//because Implicit type casting (widening) byte-short-int-long-float-double
		
		short x = (short)y; //short or byte will work because they require less memory according to the implicit casting
		System.out.println(y);
		

		double v2 = 20.8123456789021d;
		float v1 = (float) v2; //Explicit type Casting
		
		System.out.println(v1);
		
		
		/*
		float a = 10.0f;
		int b = (int)a;
		System.out.println(b);
		*/
		
		long i = 10l;
		float f = i;
		System.out.println(f); //It will work
		
		/*
		float g = 10.0f;
		long l = g;
		System.out.println(g); //It will show an error
		*/
		
		//explicit casting: forward
		//trying out int-->float
		int u = 5;
		double u_float = (double) u;
		System.out.println("u_float:"+ u_float);
		
		
		float g = 10.0f;
		long l = (long)g;
		System.out.println(g); //It will work as we converted long to long
		
		//implicit casting
		short s_a = 3;
		float short_float = s_a;
		System.out.println("short a: "+ short_float);

	}

}
