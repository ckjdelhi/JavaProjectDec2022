package com.oops.poly;


class Test{
	
	Test() {
		System.out.println("const-1");
	}
	
	Test(int a) {
		this();
		System.out.println("const-2");
	}
	
	Test(int a, int b) {
		this(20); //this is being called to call one constructor to another
		System.out.println("const-3");
	}
	
	void show() {
		System.out.println("show");
	}
}

public class ConstructorOverloadingDemo {
	

	public static void main(String[] args) {
		Test obj=new Test(10);
		obj.show();
//		
//		Test obj1=new Test(20);
//		obj1.show();
//		
//		Test obj2=new Test();
//		obj2.show();
		
	}

}
