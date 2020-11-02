package com.cybage;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3_4 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	   int[] arr = {12,45,78,89,54,32,67,98,43,23,8,54,67};
	   System.out.println("Enter an index");
	   int position = sc.nextInt();
	   System.out.println("Enter a value");
	   int newValue = sc.nextInt();

	  System.out.println("Original Array : "+Arrays.toString(arr));     
	   
	  for(int i=arr.length-1; i > position; i--){
	    arr[i] = arr[i-1];
	   }
	   arr[position] = newValue;
	   System.out.println("New Array: "+Arrays.toString(arr));
	}
}
