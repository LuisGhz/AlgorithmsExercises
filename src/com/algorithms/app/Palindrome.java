package com.algorithms.app;

public class Palindrome {
	public static void main(String[] args)
	{
		String str = "A cavar a Caravaca";
		boolean isPalindrome = true;
		
		str = cleanText(str);
		
		if (!withOneLoop(str))
			isPalindrome = false;
		
		if(isPalindrome)
		{
			System.out.println("The word/phrase is a palindrome");
		}
		else
		{
			System.out.println("The word/phrase is not a palindrome");
		}
	}
	
	private static String cleanText(String str)
	{
		final String REGEX = "[^a-zñ]";
		
		str = str.toLowerCase().replaceAll(REGEX, "");
		
		return str;
	}
	
	private static boolean withOneLoop(String str)
	{
		boolean isPalindrome = true;
		short length = (short) (str.length() - 1);
		for (short i = 0, j = length; i <= length ; i++)
		{
			if (str.charAt(i) != str.charAt(j))
				isPalindrome = false;
		}
		
		return isPalindrome;
	}
}
