package test;

/*
 *  0 or 1 = 1 bit
 *  8 bit = 1 byte
 *  1024 byte = 1 KB kilo byte
 *  1024 KB = 1 MB
 *  1024 MB = 1 GB
 *  1024 GB = 1 TB
 *  1024 TB = 1 PB
 *  ..
 *  
 */


//Total Memory =26 + 26 + 26= ? bytes
public class DataTypesDemo {

	/*int a = 5000; //4 bytes
	String name="chandan1"; //8x2=16 bytes
	float salary=50000; //4 bytes
	
	boolean a1=true; //true or false
	
	char c= 35;//ASCII code
	char c1 ='A';*/
	
	
	byte a2 = 127; // 1 bytes
	short a3=50; // 2 bytes
	int a4 =50; //4 bytes
	long a5 =50L; //8 bytes
	
	float f1= 50.50f; //4 bytes
	double f2=50.50d;//8 bytes
	
	
	
	
	public static void main(String[] args) {
		
		DataTypesDemo obj=new DataTypesDemo(); //26 bytes
		//System.out.println(obj.a2);
		//System.out.println(obj.a3);
		System.out.println(obj.a4);
		
		

		DataTypesDemo obj2=new DataTypesDemo(); //26 bytes
		//System.out.println(obj2.a2);
		//System.out.println(obj2.a3);
		System.out.println(obj2.a4);
		

		DataTypesDemo obj3=new DataTypesDemo(); //26 bytes  ALT+shift+R to rename
		//System.out.println(obj3.a2);
		//System.out.println(obj3.a3);
		System.out.println(obj3.a4);
		
		

	}

}
