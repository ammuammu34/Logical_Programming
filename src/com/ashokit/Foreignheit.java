package com.ashokit;

import java.util.Scanner;

public class Foreignheit {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a number");
	 Double c =Double.parseDouble(sc.nextLine());
	 int Celsius = 0;
	double forenheit = (Celsius *9/3)+32;
	System.out.println("forenheit : "+forenheit);
}
}
