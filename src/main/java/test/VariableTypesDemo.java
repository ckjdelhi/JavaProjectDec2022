package test;
/*
 * Type of Variable
 * 1. Local variable: variable inside any method is called as local variable
 * 2. Static variable: variable marked with static is called as static variable
 * 3. Instance Variable: variable which is not marked with static and defined outside of method is called Instance variable
 */
public class VariableTypesDemo {

	//accessModifiers dataType variableName operator value;
	public String firstName = "chandan";
	
	
	static int c = 5; //static variable
	int d = 6; //instance or object variable
	
	
	public static void main(String[] args) {
		int a=5; //local variable of main
	}
	
	void show() {
		float b =5; //local variable of main
		//System.out.println(a);
		System.out.println(firstName);
	}

}
