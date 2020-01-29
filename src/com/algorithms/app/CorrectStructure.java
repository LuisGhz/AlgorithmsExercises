package com.algorithms.app;

import java.util.Scanner;
import java.util.Stack;

public class CorrectStructure {
	public static void main(String[] args)
	{
		/*
		 * Create a boolean to save the result of checkStructure method
		 * Create a string to save de input of the user
		 * Create the object Scanner to allow to the user pay in a string
		 */
		boolean isValid = true;
		String str = "";
		Scanner kInput = new Scanner(System.in);
		
		/*
		 * Show a message explaining to the user what is the process 
		 */
		System.out.println("Input a string with the next symbols (){}[]");
		System.out.println("Example: (abc[aks{askm}ass]fmf)");
		System.out.println("I will check if the structure of the symbols it's correct");
		str = kInput.next();
		
		// Execute the checkStructure() method to check if the structure of the string is correct
		isValid = checkStructure(str);
		
		
		if(isValid)
		{
			// If the structure is correct show this message
			System.out.println("The structure is correct");
		}
		else
		{
			// if the structure is not correct show this message
			System.out.println("The structure is not correct");
		}
		
		kInput.close();
	}
	
	private static boolean checkStructure(String str)
	{
		/*
		 * length: Save the length of the string into a variable (I use 'short' deducing the string not be long)
		 * i: To iterate the string
		 * isValid: By default it's true if the structure is not valid change to false
		 * myStack: Save the closing symbol correspondent to the opening symbol
		 */
		short length = (short) str.length();
		short i = 0;
		boolean isValid = true;
		Stack<Character> myStack = new Stack<>();
		
		/*
		 * The loop will continue running if isValid == true and i it's less than the length of the string
		 * Compare the opening symbols and add the closing symbol to the stack
		 * Compare if the closing symbol it's the same than the symbol in the stack (FIFO)
		 */
		while (isValid && i < length)
		{
			char actualChar = str.charAt(i);
			if(actualChar == '(')
				myStack.push(')');
			else if(actualChar == '{')
				myStack.push('}');
			else if(actualChar == '[')
				myStack.push(']');
			
			if (actualChar == ')' || actualChar == '}' || actualChar == ']')
			{
				if (myStack.isEmpty() || myStack.pop() != actualChar)
					isValid = false;
			}
				
			i++;
		}
		
		/*
		 * The stack must be empty because all symbols had to be closed in the string
		 * otherwise the structure it's incorrect
		 */
		if(!myStack.isEmpty())
			isValid = false;
		
		return isValid;
	}
}
