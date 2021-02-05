package org.studyeasy;

import java.lang.RuntimeException;
import java.lang.Exception;

public class App {

	public static void main(String[] args) {
		int x = 2;
		
		try {			
			System.out.println("The value is " + x/2);
			
			
		}catch(RuntimeException e){
			System.out.println("Runtime exception");
		}
		
		catch(Exception e){
			System.out.println("exception");
		}
		
		
		finally {
			System.out.println("This will be get printed");
			System.out.println();
		}
		
	}

}
