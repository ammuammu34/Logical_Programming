package com.ashokit;

public class ArrayProgram {
	public static boolean Check(int arr[],int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if (arr[i - 1] >= arr[i]) {
				count++;
				
			}
		}
	
		if(count==1) {
			return true;
		}
		if(count>=1) {
			return false;
		}
		return false;
	}

	public static void main(String[] args) {

		 int arr[] = {1,2,10,5,7};
		 int n = 0;
		if (Check(arr, n)){
		        System.out.println("intialize");
		}else {
		        System.out.println("un initialize");
		}
	
	}

}
