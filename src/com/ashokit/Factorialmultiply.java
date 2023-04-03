package com.ashokit;

public class Factorialmultiply {

	public static void main(String[] args) {
		  int i,j,fact=1;
		  int sum = 0;
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){ 
			  for(j=i+1;j<=number;j++)
		      sum = sum*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
