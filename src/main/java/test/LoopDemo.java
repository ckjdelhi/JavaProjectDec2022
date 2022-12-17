package test;

/*
 * Types of Loop
 * 1. While Loop
 * 2. Do-While Loop
 * 3. For Loop
 * 4. For-Each Loop
 * 5. For-Each Java 8 Loop
 */
public class LoopDemo {

	public static void main(String[] args) {
		int number=5;
		
		/*int i=1; //Initialization 
		while(i<=10) {//terminate condition 
			System.out.println(number +"x"+ i +"="+ (number* i));
			i++;
		}
		
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
		*/
		
		for(int k=1;k<=100;k++) {
			if(k%2==0) {
				break;
				//continue;
			}
			System.out.println(k);
			
		
		}
		
		
	}

}
