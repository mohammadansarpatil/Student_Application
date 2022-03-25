package com.examples.business.data;

import java.util.Comparator;

public class EmailCompareDesc implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s2.getEmail().compareTo(s1.getEmail());
	}
	

}
