package com.ashokit;
import java.text.SimpleDateFormat;
import java.util.Date;



	public class DateFormate {
	    public static void main(String[] args) {
	        Date date = new Date();
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	        String formattedDate = formatter.format(date);
	        System.out.println("Current date and time: " + formattedDate);
	        
	    }
	    
}
	