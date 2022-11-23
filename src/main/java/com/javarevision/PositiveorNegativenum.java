package com.javarevision;

import java.util.Scanner;

public class PositiveorNegativenum {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num1 = input.nextInt();
		System.out.println("The entered number is : " + num1);
		
		if (num1>=0) {
			System.out.println("The Entered number is Positive");
		}
		else {
			System.out.println("The entered number is Negative");
		}
		
	}

}
