package com.oops.poly;

/*
 * Method Overriding
 * 1. method name should be same
 * 2. no of parameters should be same
 * 3. return type should be same or lower class
 */
		
class Parent {
	String show(int a) {
		System.out.println("P:show");
		return "";
	}
}
class Child extends Parent{
	void display() {
		System.out.println("C:display");
	}
	
	String show(int a) {
		System.out.println("C:show");
		return "";
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.show(10);
		
	}

}
