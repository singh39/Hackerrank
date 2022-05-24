package com.hackerrank.solutions;

class Base {
	public void Print() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void Print() {
		System.out.println("Derived");
	}
}

public class loopsAndRecursion {

	public static void main(String[] args) {
		Base y = new Derived();
		y.Print();
	}
}
