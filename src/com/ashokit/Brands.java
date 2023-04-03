package com.ashokit;

import java.util.Scanner;

public class Brands {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a barnd");
      String brand  = sc.nextLine();
  switch (brand){
 case "Nike":
System.out.println("Just Do It");
break;
  case" Adidas":
	  System.out.println("Impossible Is Nothing");
  break;
  case "Puma":
	  System.out.println("Forever Faster");
  break;
  case "reebok":
	  System.out.println("Iam What I am");
	  break;
  }
	}
}