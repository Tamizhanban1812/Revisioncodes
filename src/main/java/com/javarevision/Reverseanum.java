package com.javarevision;

public class Reverseanum {

	public static void main(String[] args) {
		int num1 = 98743;
		int rev = 0;
		while(num1 !=0) {
			rev = rev * 10 + num1%10;
			num1 = num1/10;
		}
		System.out.println(rev);

	}

}
