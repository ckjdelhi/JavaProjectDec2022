package com.collections;

import java.util.Comparator;

public class SortByCourseDesc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getCourseName().compareTo(o1.getCourseName());
	}

}
