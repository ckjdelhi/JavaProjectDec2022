package com.oops.poly;
/**
 * Method Overloading:
 * 1. method name should be same
 * 2. no of parameters should be different
 * 3. if no of parameters is same then datatype should be different
 * 4. return type doesn't consider
 */
public class OverloadingDemo {

	public static void main(String[] args) {
		OverloadingDemo obj=new OverloadingDemo();
		obj.show();
		obj.show("Chandan");
		obj.show(20);
		obj.show("Chandan", "Kumar");
		obj.display();
	}
	
	void show() {
		System.out.println("show");
	}
//	int show() {
//		System.out.println("show");
//		return 0;
//	}
	
	void show(String firstName) {
		System.out.println("show: "+firstName);
	}
	void show(int age) {
		System.out.println("show: "+age);
	}
	
	void show(String firstName, String lastName) {
		System.out.println("show: "+firstName + " "+lastName);
	}
	
	void display() {
		System.out.println("display");
	}

}
