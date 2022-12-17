package test;

/**
 * static: is property of class
 * instance: is property of object
 */

public class VariableTypesDemo2 {
	
	static int a =50;
	
	int b = 6;
	

	public static void main(String[] args) {
		
		System.out.println(a);
		
		VariableTypesDemo2 obj = new VariableTypesDemo2();
		obj.b =10;
		obj.a = 10;
		
		VariableTypesDemo2 obj2 = new VariableTypesDemo2();
		obj2.b = 20;
		obj2.a = 20;
		
		VariableTypesDemo2 obj3 = new VariableTypesDemo2();
		obj3.b = 30;
		obj3.a = 30;
		
		
		System.out.println(obj.b +" "+obj.a);
		System.out.println(obj2.b+" "+obj2.a);
		System.out.println(obj3.b+" "+obj3.a);

	}

}
