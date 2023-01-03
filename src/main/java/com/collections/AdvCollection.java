package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AdvCollection {

	public static void main(String[] args) {
		//studentList.forEach(obj-> System.out.println(obj.getFirstName()));
		
//		ArrayList<Integer> list=new ArrayList<>();//[20, 10, 20, 30, 20, 40]
//		list.add(20);
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(20);
//		list.add(40);
//		System.out.println("Before sorting: "+list);
//		Collections.sort(list);
//		System.out.println("After sorting: "+list);
		Student s1=new Student("Chandan", "Kumar", 100, "MBA");
		Student s2=new Student("Ram", "Kumar", 99, "MCA");
		Student s3=new Student("Mohan", "Kumar", 101, "MBA");
		Student s4=new Student("Ajay", "Kumar", 105, "BTech");
		Student s5=new Student("Vikas", "Kumar", 98, "MTech");
						
		ArrayList<Student> studentList=new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		System.out.println(studentList);
		System.out.println("Before sorting: ");
		for(Student s: studentList) {
			System.out.println(s.getFirstName() + "\t"+ s.getCourseName() +"\t"+s.getRollNumber());
		}
		
		Collections.sort(studentList);
		
		System.out.println("\nAfter sorting(default: by firstname): ");
		for(Student s: studentList) {
			System.out.println(s.getFirstName() + "\t"+ s.getCourseName() +"\t"+s.getRollNumber());
		}
		
		//Custom sorting: Comparator Interface
		System.out.println("\nAfter sorting(by course name DESC): ");
		Collections.sort(studentList, new SortByCourseDesc());
		for(Student s: studentList) {
			System.out.println(s.getFirstName() + "\t"+ s.getCourseName() +"\t"+s.getRollNumber());
		}
		
		System.out.println("\nAfter sorting(by Rollnumber ASC): ");
		Collections.sort(studentList, new SortByRollNumberAsc());
		for(Student s: studentList) {
			System.out.println(s.getFirstName() + "\t"+ s.getCourseName() +"\t"+s.getRollNumber());
		}
		
		System.out.println("\nAfter sorting(by Rollnumber DESC): ");
		Collections.sort(studentList, new SortByRollNumberDesc());
		for(Student s: studentList) {
			System.out.println(s.getFirstName() + "\t"+ s.getCourseName() +"\t"+s.getRollNumber());
		}
		
		System.out.println("\nAfter sorting(by firstname desc): ");
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getFirstName().compareTo(o1.getFirstName());
			}
		});
		
		for(Student s: studentList) {
			System.out.println(s.getFirstName() + "\t"+ s.getCourseName() +"\t"+s.getRollNumber());
		}
		
		System.out.println("\nAfter sorting Java 8(by rollno asc): ");
		studentList.sort((a,b)-> a.getRollNumber()-b.getRollNumber());
		studentList.forEach(s-> System.out.println(s.getFirstName() + "\t"+ s.getCourseName() +"\t"+s.getRollNumber()));
		
		
	}

}
