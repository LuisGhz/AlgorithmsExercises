package com.algorithms.app;

import java.util.Scanner;

public class FactorialRecursive {
	public static void main(String[] args)
	{
		int number = 0;
		int factorial = 0;
		boolean isOk = false;
		Scanner kInput = new Scanner(System.in);
		
		do
		{
			System.out.println("Input the number to get the factorial (minimum 2)");
			number = kInput.nextInt();
			
			if (number > 2)
				isOk = true;
		}
		while(!isOk);
		
		factorial = fact(number);
		
		System.out.println(String.format("The factorial of %d is %d", number, factorial));
		
		kInput.close();
		
	}
	
	private static int fact(int number)
	{
		
		if (number > 1)
			return number * fact(number - 1);
		
		return number;
	}
}
