package com.ashokit;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int i= 1;i<=n;i++) {
			boolean flag = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println(i);
			}
			}		
		}
	}		

			
		


