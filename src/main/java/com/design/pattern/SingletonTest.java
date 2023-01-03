package com.design.pattern;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		Singleton obj3=Singleton.getInstance();
		

		if(obj1 == obj2) {
			System.out.println("same object");
		}else {
			System.out.println("diffent object");
		}
		
	}

}
