package com.ashokit;

public class ConvertNumberToWord {
	private static final String[] twodigits = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};  
	//string type array for two digits numbers   
	private static final String[] onedigit = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
	private static final String Number = null;  
	//defining constructor of the class  
	private ConvertNumberToWord ()   
	{  
	}  
	//user-defined method that converts a number to words (up to 1000)  
	private static String convertUptoThousand(int number)   
	{  
	String soFar;  
	if (number % 100 < 20)  
	{  
	soFar = onedigit[number % 100];  
	number = number/ 100;  
	}  
	else   
	{  
	soFar = onedigit[number % 10];  
	number = number/ 10;  
	soFar = twodigits[number % 10] + soFar;  
	number = number/ 10;  
	}  
	if (number == 0)   
	return soFar;  
	return onedigit[number] + " Hundred " + soFar;  
	}  
int hundredThousands = Integer.parseInt(Number.substring(4,6)); 
	public static void main(String args[])   
	{  
	//calling the user-defined method that converts the parsed number into words  
	System.out.println(convertNumberToWord(2));  
	System.out.println(convertNumberToWord(99)); 
}
	private static char[] convertNumberToWord(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
