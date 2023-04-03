package com.ashokit;

public class Maxvalue {
	public static void main(String[] args) {
		int[]a = {12,34,54,78,87,54};
		int max = 0;
		int max2 = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)max =a[i];
			
		}
		for(int i= 0;i<a.length;i++) {
			if(a[i]>max2&&a[i]!=max)max2=a[i] ;
				
			}
			System.out.println("second large : "+max2);
		}
		
	}


