package com.oops.poly;

public class Calculator {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int res = obj.add(20, 30);
		System.out.println(res);
	}
	
	int add(int a, int b) {
		int result = a+ b;
		return result;
	}

	void show() {
		System.out.println("hi");
	}
}
