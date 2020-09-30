package com.collectionConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Random {

	public static void main(String[] args) {
		Student s1 = new Student(1,"ABC","ME",108);
		Student s2 = new Student(2,"DEF","ECE",105);
		Student s3 = new Student(3,"XYZ","EE",118);
		Student s4 = new Student(4,"PQR","CSE",113);
		Student s5 = new Student(5,"ABC","ME",100);
		
		List<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		System.out.println(" **** Sorting based on Student Name  ****");
		Collections.sort(l, Student.sname);
		
		for(Student s : l) {
			System.out.println(s);
		}
		
		
		System.out.println("**** Sorting based on Stream Name  ****");
		Collections.sort(l, Student.sstream);
		
		for(Student s : l) {
			System.out.println(s);
		}
		
		System.out.println(" *** Sorting based on roll number ****");
		Collections.sort(l,Student.srollNo);
		
		for(Student s : l) {
			System.out.println(s);
		}
		

	}

}
