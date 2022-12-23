package com.oops.poly;
class Parent1 {
	void show() {
		System.out.println("P:show");
	}
	void insert() {
		System.out.println("P: insert");
	}
}
class Child1 extends Parent1{
	void display() {
		System.out.println("C:display");
	}
	void show() {
		System.out.println("C:show");
	}
}
public class RuntimeBindingDemo {

	public static void main(String[] args) {
		Parent1 obj=new Parent1();
		obj.show();
		
		Child1 obj2=new Child1();
		obj2.display();
		obj2.show();
		
		Parent1 obj3 = new Child1(); //runtime binding
		obj3.show();
		obj3.insert();
		//obj3.display();
		System.out.println("------------------------");
		
		//Error: ClassCastException
		/*Child1 obj4=(Child1)new Parent1();  //runtime binding
		obj4.show();
		obj4.display();
		obj4.insert();
		*/
		
	}

}
