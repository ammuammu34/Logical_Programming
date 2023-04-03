package com.ashokit;

public class LargestNumberarray {

	public static void main(String[] args) {
     
		int[]arr = {11,22,33,44,55};
		int max=arr[0];
		for(int i =0;i<arr.length; i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>max) max=arr[i];
		
		}
	}
		System.out.println("second largest number in the given array : "+max);

	}
}
