package com.javarevision;

interface A{
public static final int a = 100;
public static final int b = 200;
public int sum();
}

interface B{
	int x = 1000;
	int y = 2000;
	public int mul();
}

public class Interfacerev implements A,B {

	public static void main(String[] args) {
		Interfacerev sm = new Interfacerev();
		System.out.println(sm.sum());
		System.err.println(sm.mul());
	}

	public int sum() {
		int s = a +b;
		return s;
	}

	public int mul() {
		int m = x*y;
		return m;
	}

}
