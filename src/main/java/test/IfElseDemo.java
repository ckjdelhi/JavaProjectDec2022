package test;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int a = 5; 
		int b = 6;
		int c = 7;
		
		boolean result = a<b;
		
		if(result) {
			System.out.println("Yes a is greater than b");
		}
		
		
		if(result) {
			System.out.println("Yes a is greater than b");
		}else {
			System.out.println("Yes b is greater than a");
		}

		if(a>b) {
			System.out.println("Yes a is greater than b");
		}else if(a>c) {
			System.out.println("a is greater than c");
		}else if(a>c) {
			System.out.println("a is greater than c");
		}else if(a>c) {
			System.out.println("a is greater than c");
		}else if(a>c) {
			System.out.println("a is greater than c");
		}else if(a>c) {
			System.out.println("a is greater than c");
		}else {
			System.out.println("condition is not matching");
		}
		
		
	}

}
