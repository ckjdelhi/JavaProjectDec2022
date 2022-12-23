package com.oops.poly;

import com.oops.encapsulation.AccessModifiersDemo;

public class Calculator extends AccessModifiersDemo{

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int res = obj.add(20, 30);
		System.out.println(res);
		
		
		System.out.println(obj.pubA);//public
		//System.out.println(obj.priB);//private
		//System.out.println(obj.defC);//default
		System.out.println(obj.proD);//protected
		
		
		AccessModifiersDemo obj1 = new AccessModifiersDemo();
		System.out.println(obj1.pubA); //public 
		//System.out.println(obj1.priB); //private
		//System.out.println(obj1.defC);//default: not accessible outside of package
		//System.out.println(obj1.proD);//protected: not accessible outside of package
	}
	
	int add(int a, int b) {
		int result = a+ b;
		return result;
	}

	void show() {
		System.out.println("hi");
	}
}
