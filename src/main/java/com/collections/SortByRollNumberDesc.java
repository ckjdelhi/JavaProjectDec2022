package com.collections;

import java.util.Comparator;

public class SortByRollNumberDesc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getRollNumber()-o1.getRollNumber();
	}

}
