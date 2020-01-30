package com.algorithms.app;

import java.util.Random;

public class FizzBuzz {
	public static void main(String[] args)
	{
		/*
		 * ELEMENTS: Length of array
		 * MAX_NUMBER: The max number generated by random
		 * msg: Final message
		 * arr: Array with the elements
		 * random: object that will generate the pseudo-random number
		 */
		final byte ELEMENTS = 50;
		final byte MAX_NUMBER = 50;
		String msg = "";
		byte[] arr = new byte[ELEMENTS];
		Random random = new Random(System.nanoTime());
		
		// Populating the array
		for (byte i = 0; i < ELEMENTS; i++)
		{
			arr[i] = (byte) random.nextInt(MAX_NUMBER);
		}
		
		/*
		 * Divisible by 3 and 5: FizzBuzz
		 * Divisible by 3: Fizz
		 * Divisible by 5: Buzz
		 */
		for (byte i = 0; i < ELEMENTS; i++)
		{
			byte e = arr[i];
			
			if (e % 3 == 0 && e % 5 == 0)
				msg += e + ": FizzBuzz\n";
			else if ( e % 3 == 0)
				msg += e + ": Fizz\n";
			else if ( e % 5 == 0)
				msg += e + ": Buzz\n";
		}
		
		// Show the final string
		System.out.println(msg);
	}
}
