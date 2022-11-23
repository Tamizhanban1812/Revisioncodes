package com.javarevision;

public class Calculation {

	public int sum(int x, int y) {
		int sum = x+y;
		return sum;
	}

	public int sum(int x, int y, int z) {
		int sum = x+y+z;
		return sum;
	}

	public double sum(double x, double y) {
		double sum = x+y;
		return sum;
	}

	public double sum(double x, double y, double z) {
		double sum = x+y+z;
		return sum;
	}


	public static void main(String[] args) {
		Calculation cs = new Calculation();
		System.out.println(cs.sum(25, 45));
		System.out.println(cs.sum(23, 45,67));
		System.out.println(cs.sum(34.6, 67.8));
		System.out.println(cs.sum(34.89, 67.98, 98.75));

	}

}
