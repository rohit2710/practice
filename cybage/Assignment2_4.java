package com.cybage;

import java.util.Scanner;

public class Assignment2_4 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Please enter six positive digits number : ");
        int var = sc.nextInt();
        int num1 = var / 100000 % 10;
        int num2 = var / 10000 % 10;
        int num3 = var / 1000 % 10;
        int num4 = var / 100 % 10;
        int num5 = var / 10 % 10;
        int num6 = var % 10;
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
		
//another way
		
//		System.out.println("please enter a number : ");
//		int num=sc.nextInt();
//		String output = "";
//		int temp=num,var;
//		
//		while(temp>0) {
//			var=temp%10;
//			temp=temp/10;
//			output+=var+" "; 
//		}
//		System.out.println(output);
//		
//		char[] reversedString = output.toCharArray();
//		
//		 for (int i = reversedString.length - 1; i >= 0; i--)
//	            System.out.print(reversedString[i]);
		}
}
