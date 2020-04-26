package com.wilmir.demorest;

import java.util.ArrayList;
import java.util.List;

public class RomanNumeralApp {

	private static List<Integer> decimal = new ArrayList<Integer>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * 
		 */

		{
			add(1);
			add(4);
			add(5);
			add(9);
			add(10);
			add(40);
			add(50);
			add(90);
			add(100);
			add(400);
			add(500);
			add(900);
			add(1000);
		}
	};
	
	private static List<String> roman = new ArrayList<String>(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * 
		 */

		{
			add("I");
			add("IV");
			add("V");
			add("IX");
			add("X");
			add("XL");
			add("L");
			add("XC");
			add("C");
			add("CD");
			add("D");
			add("CM");
			add("M");
		}
	};
	
	
	public static String convertToRoman(int value) {
		
		if(value == 0) {
			return "zero";
		}
		
		StringBuffer sb = new StringBuffer();
		int write, remaining;
		
		remaining = value;
		
		for(int i = (decimal.size() -1); i >=0; i--) {
			write = remaining/decimal.get(i);
			remaining = remaining - (write*decimal.get(i));
			
			if(write > 0) {
				if(decimal.get(i) == 1 || decimal.get(i) == 100 || decimal.get(i) == 1000) {
					for(int j = 1; j<= write; j++) {
						sb.append(roman.get(i));
					}
				}else {
					sb.append(roman.get(i));
				}
			}	
		}
		
		return sb.toString();
	}

	
	
	
	public static int convertToDecimal(String value) {
		int number = 0;
		char currentChar, nextChar;
		int currentIndex,indexOfNextChar;
		
		for(int i  = 0; i<value.length(); i++) {	
			currentChar = value.charAt(i);
			nextChar = value.charAt(i+1);

			
			currentIndex = roman.indexOf(Character.toString(currentChar));	
			indexOfNextChar = roman.indexOf(Character.toString(nextChar));
			
			//logic to check for 4,9 and their multiples
			if(indexOfNextChar > currentIndex) {
				currentIndex = roman.indexOf(Character.toString(currentChar) + Character.toString(nextChar));
				i++;
			}
					
			number += decimal.get(currentIndex);
		}
		
		
		return number;
		
	}
	
	
}