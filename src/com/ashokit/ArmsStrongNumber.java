package com.ashokit;

import java.util.Scanner;

public class ArmsStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		int remainder = 0;
		int temp =number;
		int result = 0;
		
        while (number> 0) {
       
            remainder = number % 10;
            result+= (remainder*remainder*remainder);
            number =number/10;
        }

        if(temp==result) {
            System.out.println("it is an Armstrong number.");
        }else {
            System.out.println("it is not an Armstrong number.");
    }
	}
	}


