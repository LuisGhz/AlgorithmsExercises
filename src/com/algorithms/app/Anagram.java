package com.algorithms.app;


public class Anagram {
	public static void main(String[] args)
	{
		/*
		 * Anagram: Two word o phrases that have the same letters
		 */
		boolean isAnagram = true;
		
		
		
		String strA = "Agonista  ";
		String strB = "Santia go";
		
		//I need to clean the text because I do not want to compare spaces, numbers etc...
		strA = cleanText(strA);
		strB = cleanText(strB);
		
		//First I compare if the length of both strings it's equal
		if (strA.length() != strB.length())
		{
			isAnagram = false;
		}
		else
		{	
			if (!withCasting(strA, strB))
			{
				isAnagram = false;
			}
		}
		
		if (isAnagram)
		{
			System.out.println("We found an anagram");
		}
		else
		{
			System.out.println("We not found an anagram");
		}
	}
	
	private static String cleanText(String str)
	{
		/*
		 * I convert all letters to lowercase
		 * I replace all the spaces and special characters
		 * This method return the string clean
		 */
		final String REGEX = "[^a-zñ]";
		
		str = str.toLowerCase().replaceAll(REGEX, "");
		
		return str;
	}
	
	private static boolean withCasting(String strA, String strB)
	{
		/*
		 * I must to do a casting from char to int
		 * In the for loop I will sum each char to the variables
		 * I compare the result of both sums if the numbers are equal this method will return true otherwise it will return false
		 */
		int nStrA = 0;
		int nStrB = 0;
		int length = strA.length();
		
		for(int i = 0; i < length; i++)
		{
			nStrA += (int) strA.charAt(i);
			nStrB += (int) strB.charAt(i);
		}
		
		if (nStrA != nStrB)
			return false;
			
		return true;
	}
}
