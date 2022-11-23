package com.javarevision;

public class Forloopnumformation {

	public static void main(String[] args) {
		int num = 7;
		for (int i = 1; i<=num; i++) {
			for (int space = 1; space <=i; space++) {
				System.out.print(" ");
			}
			for (int count = i; count <=num; count++) {
			System.out.print(count + " ");
			}
			System.out.println();
		}
		

	}

}
