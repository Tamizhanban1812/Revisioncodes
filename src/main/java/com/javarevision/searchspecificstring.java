package com.javarevision;

public class searchspecificstring {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Maruthi";
		String s3 = "Tam";
		
		String S[] = {s1, s2,s3};
		for (int i = 0; i <S.length; i++) {
			if (S[i].equalsIgnoreCase("Ram")) {
				System.out.println("The string is present in the index : " + i);
			}
		}
				

	}

}
