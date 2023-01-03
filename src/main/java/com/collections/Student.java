package com.collections;

/**
 * POJO: Plain Old Java Object
 * 1. make all variables as private
 * 2. add default constructor
 * 3. add parameterized constructor
 * 4. add getter && setter methods
 * 5. override toString() method
 */
public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private int rollNumber;
	private String courseName;

	public Student() {}
	public Student(String firstName, String lastName, int rollNumber, String courseName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
		this.courseName = courseName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", rollNumber=" + rollNumber
				+ ", courseName=" + courseName + "]";
	}
	/*
	 * -ve: asc
	 * 0:same
	 * +ve:desc
	 */
	@Override
	public int compareTo(Student o) {
		return this.getFirstName().compareTo(o.getFirstName());//sort by firstName ASC
		//return this.getRollNumber() - o.getRollNumber();//sort by rollNumber ASC
		//return o.getRollNumber() - this.getRollNumber();//sort by rollNumber DESC
	}
	
}