package com.javarevision;

public class EvenandOddnumbersinarray {

	public static void main(String[] args) {
	 int a[] = {2,4,7,9,12,11};
	 for (int i = 0; i<a.length; i++) {
		 int val = a[i]%2;
		 if (val == 0) {
			 System.out.println("The number " + a[i] + " is even number");
		 }
		 else {
			 System.out.println("The number " + a[i] + " is odd number");
		 }
	 }

	}

}
