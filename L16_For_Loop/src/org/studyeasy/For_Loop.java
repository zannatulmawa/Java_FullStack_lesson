package org.studyeasy;

public class For_Loop {

	public static void main(String[] args) {
		
		/*
		for (int i = 1; i<=10; i++)
		System.out.println(i);
		*/
		
		
		int isPrime = 1; //1 indicates prime
		int number = 6;
		for(int i = 2; i<= number / 2; i++)
		if(number % i == 0) {
			isPrime = 0; //'0' indicates not prime
			break;
		}
		if (isPrime==1) {
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("This is not a prime number");
			//System.out.println("Divided by: "+ divider);
		}
	}

}
