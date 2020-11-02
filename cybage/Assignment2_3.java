package com.cybage;

import java.util.Scanner;

public class Assignment2_3 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter number between 0 to 1000 : ");
		int var=sc.nextInt();
		int var1=var;
		int num,sum=0;
		if(var1>0 && var1<=1000) {
			while(var1 > 0)
	        {
	            num = var1 % 10;
	            sum = sum + num;
	            var1 = var1 / 10;
	        }
	        
		}else {
			System.out.println("you entered number out of range");
		}
		System.out.println("Sum of all digits in "+var+" is "+sum);
	}

}
