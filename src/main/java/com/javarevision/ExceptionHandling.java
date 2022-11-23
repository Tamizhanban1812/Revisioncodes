package com.javarevision;

public class ExceptionHandling {

	public static void main(String[] args) {
		int num1 = 100;
		int a [] = null;
		String s = "abc";
		int i;
		try {
			int num2 = num1/0;
			System.out.println(num2);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			System.out.println(a.length);
		}
		catch (Exception e) {
			System.err.println(e);
		}
		try {
			i = Integer.parseInt(s) ;
			System.out.println(i);
		} catch (Exception e) {
			System.err.println(e);
	}

}}
