package com.ashokit;

public class TotalDemo {

	public static void main(String[] args) {
   
		String []a= {"M8N","PB5","7KN"};
		int sum = 0;
		for(int i= 0;i<a.length;i++) {
			for (int j = 0;j < a[i].length();j++){
				int x= a[i].charAt(j);
				if(x >= 48 && x <=57) 
					sum+=Integer.parseInt(a[i].charAt(j)+"");
			}		
			}
			System.out.println("the sum is : "+sum);
			
		
	}

}
