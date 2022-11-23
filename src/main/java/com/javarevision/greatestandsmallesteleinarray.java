package com.javarevision;

public class greatestandsmallesteleinarray {

	public static void main(String[] args) {
		int a[] = {23,345,434,8,233,4534};
		int greatestnum = a[0];
		int smallestnum = a[0];
		
		
		for (int i = 0; i<a.length; i++) {
			if (a[i]>greatestnum) {
				greatestnum = a[i];
			}
			if (a[i]<smallestnum)
				smallestnum = a[i];
		
		}
		System.out.println("The greatest num is : " + greatestnum);
		System.out.println("The smallest num is : " + smallestnum);
		

	}

}
