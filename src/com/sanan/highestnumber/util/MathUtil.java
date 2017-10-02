package com.sanan.highestnumber.util;

import java.util.Arrays;

public class MathUtil {

	public static String getLargestPossible(String input) {

		String inputWithoutSpaces = input.replaceAll("\\s", "");
		
		String[] stringValues = inputWithoutSpaces.split(",");
		Long[] values = new Long[stringValues.length];
	
		for (int i=0; i < stringValues.length; i++) {
			values[i] = Long.parseLong(stringValues[i]);
		}
		
		Arrays.sort(values, new HighestPossibleComparator());

		String result = "";
		for (Long value : values) {
			result += value.toString();
		}
		return result;
    }
	
}
