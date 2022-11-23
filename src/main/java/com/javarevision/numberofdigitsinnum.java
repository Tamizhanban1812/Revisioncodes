package com.javarevision;

public class numberofdigitsinnum {

	public static void main(String[] args) {
		int num = 123467567;
		int count = 0;
		
	while (num !=0) {
		num = num/10;
		count++;
	}
System.out.println(count);
}
			
}