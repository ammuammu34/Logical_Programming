package com.ashokit;

import java.util.Scanner;

public class SumOfOdd {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number");
	    int n = sc.nextInt();
	   int sum =0;
	    int i = 0;
	    for( i=0;i<=n;i++)
		if(i %2==1) {
	    	 sum = sum+n;
	    	
		}
System.out.println("Sum of all odd numbers between 0 to " + n + " = " + sum);
	    }

}

