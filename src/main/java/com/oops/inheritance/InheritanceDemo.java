package com.oops.inheritance;
/*
 * Inheritance provides code reusability 
 * Types of Inheritance
 * 1. Single Level Inheritance
 * 2. Multilevel Inheritance
 * 3. Hierarchical Inheritance
 * 4. Multiple Inheritance (not supported in java)
 * 5. Hybrid Inheritance (not supported in java)
 */
public class InheritanceDemo {

	public static void main(String[] args) {
		GrandParent o = new GrandParent();
		o.delete();
		
		Parent obj=new Parent();
		obj.show();
		obj.display();
		obj.delete();
		
		Child obj2= new Child();
		obj2.insert();
		obj2.show();
		obj2.display();
		obj2.delete();
		
		Child2 obj3= new Child2();
		obj3.show();
		obj3.display();
		obj3.delete();
	}

}
