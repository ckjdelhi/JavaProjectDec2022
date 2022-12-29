package com.abstraction;
/*
 * Abstraction:
 * 	1. Abstract class
 * 		* add 'abstract' modifier to class
 * 		* we can't create object of abstract class
 * 		* always extends the abstract class
 * 		* using child class object, access methods
 * 		* in abstract class we can have abstract method and non abstract method as well.
 * 		* abstract method can't have body
 * 		* child class must override the abstract method
 *  2. Interface
 *  	* Use 'interface' keyword instead of 'class'
 *  	* inside interface all methods are by default abstract method
 *  	* always 'implements' interface with child class
 *  	* child class must override the abstract method
 */

//interface is 100% abstraction
interface iTest {
	void insert(); //public abstract void insert();
}


//0 to 100% abstraction
abstract class Test {
	//Non abstract method (concrete method)
	void show() {
		System.out.println("HI");
	}
	//abstract method
	abstract void display();
}

public class AbstractionDemo extends Test implements iTest{

	public static void main(String[] args) {
		//Test obj=new Test();
		//obj.show();
		
		AbstractionDemo obj = new AbstractionDemo();
		obj.show();
		obj.display();
		obj.insert();
	}

	@Override
	void display() {
		System.out.println("display");
	}

	public void insert() {
		System.out.println("insert");
	}

}
