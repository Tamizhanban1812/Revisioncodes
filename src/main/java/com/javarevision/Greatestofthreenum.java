package com.javarevision;

import java.util.Scanner;

public class Greatestofthreenum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Numbers to find the greatest number");
		System.out.println("Enter the First Number : ");
		int num1 = input.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = input.nextInt();
		System.out.println("Enter the Third Number : ");
		int num3 = input.nextInt();
		
		int temp = num1>num2?num1:num2;
		int greatestnum = temp>num3?temp:num3;
		
		System.out.println("The greatest of the three numbers is : " +greatestnum);
		
		

	}

}
