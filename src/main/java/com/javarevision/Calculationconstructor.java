package com.javarevision;

public class Calculationconstructor {
	
	int num1, num2,num3;
 public Calculationconstructor(int num1,int num2, int num3) {
	 this.num1 = num1;
	 this.num2 = num2;
	 this.num3 = num3;
}
 
 public int sum() {
	 int sum = num1+num2+num3;
	 return sum;
 }

	public static void main(String[] args) {
		Calculationconstructor cs = new Calculationconstructor(57867, 345345, 3324);
		System.out.println(cs.sum());
		

	}

}
