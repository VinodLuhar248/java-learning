package com.vinod.classobject;

class calc {
	// instance variables
	int num1, num2, result;

	// instance methods
	public void calculateSum() {
		result = num1 + num2;
		System.out.println("The sum :: " + result);
	}

	public int getSum() {
		return (num1 + num2);
	}
}

public class ClassObjExample {
	public static void main(String[] args) {
		calc c = new calc();
		// 1st way - create object and assign the values
		c.num1 = 10;
		c.num2 = 5;
		c.calculateSum();
		// 2nd way - create method and calculate and return
		int result = c.getSum();
		System.out.println("The another way to get sum :: " + c.getSum());
	}
}
