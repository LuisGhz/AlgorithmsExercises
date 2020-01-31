package com.algorithms.app;

public class vowels {
	public static void main(String[] args)
	{
		final String REGEX = "[^%s]";
		final String FINAL_MSG  = "A: %d E: %d I: %d O: %d U: %d";
		
		int nA = 0;
		int nE = 0;
		int nI = 0;
		int nO = 0;
		int nU = 0;
		
		String str = "This string contains many vowels";
		
		str = str.toLowerCase();
		
		nA = str.replaceAll(String.format(REGEX, "a"), "").length();
		nE = str.replaceAll(String.format(REGEX, "e"), "").length();
		nI = str.replaceAll(String.format(REGEX, "i"), "").length();
		nO = str.replaceAll(String.format(REGEX, "o"), "").length();
		nU = str.replaceAll(String.format(REGEX, "u"), "").length();
		
		System.out.println(String.format(FINAL_MSG, nA, nE, nI, nO, nU));
	}
}
