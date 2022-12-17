package test;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("***********Welcome to IRCTC******");
		System.out.println("1. Book rail ticket");
		System.out.println("2. Update ticket");
		System.out.println("3. Delete ticket");
		System.out.println("4. Search your ticket");
		System.out.println("5. Exit");
		System.out.println("Choose any option:");
		
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		
		switch(a) {
			case 1:
				System.out.println("Book rail ticket menu");
				System.out.println("Enter your name...");
				break;
			case 2:
				System.out.println("2 statements");
				break;
			case 3:
				System.out.println("3 statements");
				System.out.println("3 statements");
				System.out.println("3 statements");
				System.out.println("3 statements");
				break;
			case 4:
				System.out.println("1 statements");
				break;
			default:
				System.out.println("not matched");
				break;
		}
	}

}
