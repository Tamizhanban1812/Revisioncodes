package com.javarevision;

public class additionoftwomatrices {

	public static void main(String[] args) {
		int a[][] = {{1,2}, {2,4}};
		int b [][] = {{3,4}, {5,6}};
		int c[][]= new int [2][2];
		
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j<a.length; j++) {
				 c[i][j] = a[i][j] + b[i][j];
				 System.out.println(c[i][j]);
			}
		}
		
		

	}

}
