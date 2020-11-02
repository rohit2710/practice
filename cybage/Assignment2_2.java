package com.cybage;

import java.util.Calendar;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		Calendar c=Calendar.getInstance();
		this.day=c.get(Calendar.DATE);
		this.month=c.get(Calendar.MONTH)+1;
		this.year=c.get(Calendar.YEAR);
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}

public class Assignment2_2 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.toString());
		
		Date d2=new Date(11,01,2020);
		System.out.println(d2.toString());

	}

}
