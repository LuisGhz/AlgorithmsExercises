package com.algorithms.app;

import java.util.Scanner;

public class FibonacciRecursive {
	public static void main(String[] args)
	{
		int fibonacci = 0;
		int max = 0;
		boolean isOk = false;
		
		Scanner kInput = new Scanner(System.in);
		
		do {			
			System.out.println("Input the index of the element that you want to see in the fibonacci serie");
			System.out.println("The minimum number is 2");
			max = kInput.nextInt();
			
			if (max < 2 )
			{
				System.out.println("The minimum number is 2");
			}
			else
			{
				isOk = true;
			}
		}
		while(!isOk);
		
		fibonacci = fib(0, 1, 0, max, 2);
		
		System.out.println(fibonacci);
		
		kInput.close();
	}
	
	private static int fib(int n1, int n2, int fib, int max, int counter)
	{
		if (max == 2)
			return 1;
		
		fib = n1 + n2;
		n1 = n2;
		n2 = fib;
		
		if (counter < max)
		{
			return fib(n1, n2, fib, max, counter + 1);
		}
		else
		{
			return fib;
		}
	}
}
