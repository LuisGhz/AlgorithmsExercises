package com.algorithms.app;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args)
	{
		/*
		 * Declare the number of elements in the array
		 * Create an array with n number of elements
		 * Create the object that generate pseudorandom numbers
		 */
		final byte ELEMENTS = 50;
		int[] myArr = new int[ELEMENTS];
		Random random = new Random(System.nanoTime());
		
		// Populate the array
		for (byte i = 0; i < ELEMENTS; i++)
		{
			myArr[i] = random.nextInt(50);
		}
		
		// Sorting the array without aux
		for (byte i = 0; i < ELEMENTS; i++)
		{
			for (byte j = 0; j < (ELEMENTS - i) - 1; j++)
			{
				if (myArr[j] > myArr[j + 1])
				{
					myArr[j] = myArr[j] + myArr[j + 1];
					myArr[j + 1] = myArr[j] - myArr[j + 1];
					myArr[j] = myArr[j] - myArr[j + 1];
				}
			}
		}
		
		// Show the sorted array
		System.out.println(Arrays.toString(myArr));
	}
}
