package com.javarevision;

public class Stringclass {

	
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Maruthi";
		String s3 = "Hanuman";
		String s4 = "Tam";
		String s5 = "Jai";
		
		System.out.println(s2);
		System.out.println(s1.compareTo(s3));
		System.out.println(s5.concat(" " +s3));	
		System.out.println(s3.length());
		System.out.println(s3.substring(4, 7));
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append("Tamil"));
		StringBuffer Appendedstring = sb.append(" " + "Ram");
		System.out.println(Appendedstring);
}
}


