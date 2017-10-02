package com.sanan.highestnumber.util;

import java.util.Comparator; 

public class HighestPossibleComparator implements Comparator<Long> {

	public int compare(Long num1, Long num2) {
		String str1 = Long.toString(num1);
		String str2 = Long.toString(num2);
		/*
		 * Logic: Form the two possible strings using the numbers
		 * ie. given the numbers 35, 5, 100
		 * comparator compares all numbers to all cases so for example
		 * 35 compared to 5 will form the two possible numbers: 535 and 355,
		 * we then compare these two numbers and it returns 2 because 5 is 2 MORE then
		 * 3. The number doesn't matter, just checks
		 * if number is positive or negative or 0 (equal). Now the 
		 * comparator sorts in order of smallest to largest. So since
		 * we got a positive number we know num1 comes AFTER num2. 
		 * 
		 * ^^^^^^^
		 * This process gets repeated until the position of each number
		 * is determined. 
		 * 
		 * To switch from forming the largest number to forming the smallest number
		 * we simply just multiply by -1 or switch the compare order of the two formed strings
		 */
		
		return (str2 + str1).compareTo(str1 + str2);
	}



}
