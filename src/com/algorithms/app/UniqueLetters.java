package com.algorithms.app;

import java.util.HashMap;
import java.util.Map;

public class UniqueLetters {
	public static void main(String[] args)
	{
		String strA = "asdbzm";
		String strB = "azmoup";
		String fStr = strA + strB;
		
		Map<Character, Integer> myMap = new HashMap<>();
		
		for (char c : fStr.toCharArray())
		{
			if (myMap.putIfAbsent(c, 1) != null)
			{
				myMap.put(c, myMap.get(c) + 1);
			}
		}
		
		// Show the letters that are unique
		for (Map.Entry<Character, Integer> e : myMap.entrySet())
		{
			if (e.getValue() == 1)
			{				
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}
	}
}
