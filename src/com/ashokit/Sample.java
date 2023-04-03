package com.ashokit;

import java.util.Scanner;

public class Sample {
	private static void printPattern(int n) {
		for(int i=0;i<=n;i++) {
			for(int j =i-1;j<=i;j++) {
				System.out.print("*"+ "");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n = sc.nextInt();
		printPattern(n);
  
	}

}
