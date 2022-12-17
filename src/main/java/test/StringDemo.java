package test;

public class StringDemo {

	public static void main(String[] args) {
//		int a = 5;
//		int b = 5;
//		System.out.println(a == b);//true
//		
//		
//		String s1="Hi";
//		String s2="Hi";
//		System.out.println(s1 == s2);//true
//		System.out.println(s1.equals(s2));
//		
//		String s3=new String("HI");
//		String s4=new String("hi");
//		System.out.println(s3 == s4);//false
//		System.out.println(s3.equalsIgnoreCase(s4));
			
		
		String str="Hi Welcome to Java Programming";
		System.out.println(str.matches("Hi.*"));
		System.out.println(str.contains("Java"));
		
		System.out.println(str.indexOf("Java"));
		System.out.println(str.substring(str.indexOf("Java")));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(1)); //single charector on given index
		String[] arr= str.split(" ");
		System.out.println("No of words: "+arr.length);
		System.out.println(str.substring(3));
		System.out.println(str.substring(0, 2));
		
		System.out.println("Welcome to Java\t\tSpringboot course");
		
		String one = "Hello";
		String two = "World";

		String three = one.concat(" ").concat(two);
		System.out.println(three);

		String s1="Hi";
		String s2=" Hi ";
		System.out.println(s1.equals(s2.trim()));
		System.out.println(s1.replace("H", "W"));
		
		int a=12345;
		System.out.println(String.valueOf(a));
		
		
		
		
	
		
		
	

	}

}
