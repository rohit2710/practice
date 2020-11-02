package com.cybage;

import java.util.Scanner;

public class Assignment2_5 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a String : ");
		String eg=sc.next();
		int pos;
		if(eg.length()%2==1) {
			pos = eg.length()/2;
			System.out.println(eg.charAt(pos));
		}
		else {
			pos = (eg.length()/2)-1;
			System.out.print(eg.charAt(pos));
			System.out.print(eg.charAt(pos+1));
		}
	}

}
