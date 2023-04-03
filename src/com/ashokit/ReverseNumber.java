package com.ashokit;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
   
    int number = 987654,reverse = 0;
    while(number!=0)
    {
    	int remainder = number%2;
    	reverse = reverse *  10 + remainder;
    	number = number/2;
    }
    System.out.println("the given number : "+reverse);
		
    
    int number1 = 987654, reverse1 = 0;  
    while(number1 != 0)   
    {  
    int remainder = number1 % 10;  
    reverse1 = reverse1 * 10 + remainder;  
    number1 = number1/10;  
    }  
    System.out.println("The reverse of the given number is: " + reverse1);  
	}
	

}
