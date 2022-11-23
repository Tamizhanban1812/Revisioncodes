package com.javarevision;

public class Student {
	int SID;
	String SName;
	int sub1;
	int sub2;
	int sub3;

	public void getstudata(int SID, String SName) {
		this.SID = SID;
		this.SName = SName;
		System.out.println("Student ID : " + SID);
		System.out.println("Student Name: " + SName);
	}

	public void getstumarks(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		System.out.println("Sub 1 Marks : " +sub1);
		System.out.println("Sub 2 Marks : " +sub2);
		System.out.println("Sub 3 Marks : " +sub3);
	}

	public int totalmarks() {
		int sum = sub1 + sub2 + sub3;
		return sum;
	}

	public static void main(String[] args) {
		Student Ram = new Student();
		Ram.getstudata(1001, "Ram");
		Ram.getstumarks(98, 100, 98);
		System.out.println("The total Marks is : " +Ram.totalmarks());
	}
}
