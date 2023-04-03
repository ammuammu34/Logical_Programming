package com.ashokit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EXamPattern {
	private static EXamPattern Result;


	public static void fizzBuzz(int n) {
	    // Write your code here
	    int i;

	for (i=1; i<=n; i++) {

	if (i%3==0&&i%5==0)
	System.out.printf("FizzBuzz");

	if (i%3==0&&i%5!=0)
	System.out.printf("Fizz");

	if ((i%3)*(i%5)==0)
	System.out.printf("Buzz");
	if(i%3!=0&&i%5!=0)
	System.out.println(i);

	System.out.printf("\n");


	}

	}


	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        Result.fizzBuzz(n);

	        bufferedReader.close();
	    }
	
}
