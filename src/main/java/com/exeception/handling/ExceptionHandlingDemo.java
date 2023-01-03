package com.exeception.handling;

import java.util.Scanner;

/*
 * working:
 * 1. try-catch
 * 2. try-catch-catch
 * 3. try-finally
 * 4. try-catch-finally
 * 5. try-catch-catch-finally
 */
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			//ArithmeticException 
			int a = 5;
			int b = 1;
			System.out.println(a/b); //ArithmeticException
			
			String s="";
			System.out.println(s.length()); //NullPointerException
			
			String s1="20";
			String s2="20";
			System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); //NumberFormatException
		
		}catch (ArithmeticException e) {
			System.out.println("Error bcz of division" );
		}catch (NullPointerException e) {
			System.out.println("Error bcz of Null ref." );
		}catch (RuntimeException e) {
			System.out.println("Error bcz of custom" );
		}finally {
			System.out.println("always run");
			sc.close();
		}
	}

}
