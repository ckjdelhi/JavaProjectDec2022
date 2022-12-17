package array;

public class Array1DDemo {

	public static void main(String[] args) {
			
		String s1="A";
		String s2="B";
		String s3="C";
		String s4="D";
		String s5="E";
		
		String[] arr2= {"A", "B", "C", "D", "E"};
		System.out.println(arr2.length);
		
		String[] arr=new String[5];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";
		arr[4] = "E";
		//arr[6] = "F";//Error: ArrayIndexOutOfBoundsException
		
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int i=0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		
		
		for(String obj: arr) {
			System.out.println(obj);
		}
		
		int []arr3= {1,23,4,4,5};
		
		for(int a: arr3) {
			System.out.println(a);
		}
		
	
		
		
		
		
	}

}
