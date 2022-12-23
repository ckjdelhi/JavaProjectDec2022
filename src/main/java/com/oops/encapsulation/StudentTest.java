package com.oops.encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setFirstName("Chandan");
		s1.setLastName("Kumar");
		s1.setRollNumber(100);
		s1.setCourseName("Java");
		
		
		Student s2=new Student();
		s2.setFirstName("Ram");
		s2.setLastName("Kumar");
		s2.setRollNumber(101);
		s2.setCourseName("Java");
		
		Student s3=new Student("Ajay", "Kumar", 102, "Oracle");
		
		System.out.println(s1.getFirstName() + " "+ s1.getLastName() + " " + s1.getRollNumber() + " "+ s1.getCourseName());
		System.out.println(s3.getFirstName() + " "+ s3.getLastName() + " " + s3.getRollNumber() + " "+ s3.getCourseName());
		

	}

}
