package com.examples.business.data;

import java.util.Comparator;

public class CityCompareAsc implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getCity().compareTo(s2.getCity());
	}

}
