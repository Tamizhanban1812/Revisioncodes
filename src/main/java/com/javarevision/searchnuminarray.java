package com.javarevision;

import java.util.Scanner;

public class searchnuminarray {

	public static void main(String[] args) {
		int a[] = new int [5];
		a[0] = 12;
		a[1] = 13;
		a[2] = 32;
		a[3] = 78;
		a[4] = 23;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to search in the given array : ");
		int givennum = input.nextInt();
		
		for (int i = 0; i<a.length;i++) {
			if(a[i] == givennum) {
				System.out.println("The number is present in the index num " + i);
				break;
			}	
		}
		

	}

}
