package com.ashokit;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("enter a second number");
		int y = Integer.parseInt(sc.nextLine());
		int z = x+y;
		System.out.println("z value: "+z);
		int p = x*y;
		System.out.println("multiplication: "+p);
		
		
	}

}
