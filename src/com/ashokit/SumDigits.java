package com.ashokit;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a number");
        int n = sc.nextInt();
       int m, sum = 0;
       while(n>0) {
    	  m = n%10;
        	sum+=m;
        	n = n/10;
        	
        }
       System.out.println("sum of digits :"+sum);

	}

}
