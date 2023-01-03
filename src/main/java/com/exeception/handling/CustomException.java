package com.exeception.handling;

class AgeInvalidException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public AgeInvalidException(String message) {
		super(message);
	}
}

public class CustomException {

	public static void main(String[] args) throws Exception {
		
		//String s=null;
		//System.out.println(s.length());
		/*
		 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
		 at com.exeception.handling.CustomException.main(CustomException.java:17)
		 */
		
		int age = 17;
		
		if(age<18) {
			throw new AgeInvalidException("You are not eligible for this event");
			/*
			 Exception in thread "main" com.exeception.handling.AgeInvalidException: You are not eligible for this event
			 at com.exeception.handling.CustomException.main(CustomException.java:19)
			 */
		}else {
			System.out.println("You are ready to go.....");
		}

	}

}
