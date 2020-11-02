package com.cybage;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Assignment3_1 {

	public static void main(String[] args) {
		//Calendar instance
		Calendar c=Calendar.getInstance();
        //set the value of calendar instance last day of month
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("No of days in month: "+c.getTime());
	
        //get current date and time using LocalDateTime class
        LocalDateTime live = LocalDateTime.now();
        System.out.println("Current full Date is: " + live.getDayOfMonth()+"/"+live.getMonthValue()+"/" +live.getYear()+" The time is : "+live.getHour()+":"+live.getMinute()+":"+live.getSecond());

        //get current date and time using Calendar class
        java.util.Date date=Calendar.getInstance().getTime();  
        System.out.println(date);  
	}

}
