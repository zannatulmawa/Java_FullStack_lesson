package org.studyeasy;
import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		primeNum();

	}
	
	public static void primeNum() {
		Scanner inputObj = new Scanner(System.in); //for user input we need to use scanner
		System.out.println("Enter an integer number:"); //second step
		int number = inputObj.nextInt(); //It indicates the type of input (eg: string, int or double)
		
		int isPrime = 1; //1 indicates prime
		int divider = 0;
		for(int i = 2; i<= number / 2; i++)
		if(number % i == 0) {
			isPrime = 0; //'0' indicates not prime
			divider = i;
			break;
		}
		if (isPrime==1) {
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("This is not a prime number");
			System.out.println("Divided by: "+ divider);
		}
	}

}

