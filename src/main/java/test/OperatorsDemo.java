package test;

public class OperatorsDemo {

	public static void main(String[] args) {
//		int a = 12;
//		int b = 6;
		//Arithmetic Operator (+, -, *, / , %)
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(10.4 % 4); //3
//		
//		
//		//check given number is even or odd??
//		System.out.println(19 % 2); //0 = even , else odd
		
		
		//Unary Operator ( +, -, ++(pre/post), --(pre/post))
//		int c = -4; //negative number
//		int d = 1;
//		System.out.println(d++);//1
 		
		//Relational Operator (>, <, >=, <=, ==, !=): output will be in boolean
		int a = 5;
		int b = 4;
		int c = 6;
		System.out.println(a>b ? "yes": "no");//true
		System.out.println(a>=b);//true
		System.out.println(a == b);//false
		System.out.println(a !=b );//true

		//Logical Operators(&&, ||): output will be in boolean
		System.out.println(a>b || a>c); //true && false = false
		/*
		 &&
		 true && true = true
		 true && false = false
		 false && true = false
		 false && false = false
		 
		 ||
		 true || true = true
		 true || false = true
		 false || true = true
		 false || false = false
		 */
		
		//Ternary Operator (condition?true condition:false condition)
		//System.out.println(1>=0? "yes condion is true": "no condition is not true");
//		if(1>=0) {
//			System.out.println("yes condition is true");
//		}else {
//			System.out.println("no condition is not true");
//		}
		
//		System.out.println(15>6?
//				6>14?
//						"6"
//						:"4" 
//					:"5");
		
		//Bitwise operator (&, |)
		int y = 18;
		int z = 3;
		System.out.println((y & 1) == 0 ? "Even": "Odd" );
		
		//Shift operator (<<, >>)
		System.out.println(z << 2);
		
		System.out.println(Integer.toBinaryString(12));
		
	}

}
