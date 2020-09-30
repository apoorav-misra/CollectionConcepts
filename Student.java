package com.collectionConcepts;

import java.util.Comparator;

public class Student {
	private String name, stream;
	private int id, rollno;
	
	Student(int id, String name, String stream,int rollno){
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.rollno = rollno;
	}
	
	public int getStudentId() {
		return id;
	}
	
	public void setStudentId(int id) {
		this.id = id;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public void setStudentName(String name) {
		this.name = name;
	}
	
	public String getStreamName() {
		return stream;
	}
	
	public void setStreamName(String stream) {
		this.stream = stream;
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	public void setRollNo(int rollNo){
		this.rollno = rollNo;
	}
	
	public static Comparator<Student> sname = new Comparator<Student>() {
		
		public int compare(Student s1, Student s2) {
			String std1 = s1.getStudentName();
			String std2 = s2.getStudentName();
			
			return std1.compareTo(std2);    //this for ascending order
											//for descending order use std2.compareTo(std1);
		}
		
	};
	
	
	public static Comparator<Student> srollNo = new Comparator<Student>() {
		
		public int compare(Student s1, Student s2) {
			
			int std1 = s1.getRollNo();
			int std2 = s2.getRollNo();
			
			return std1-std2;			//This is for ascending order. For descending order use std2-std1
		}
	};
	
	
	public static Comparator<Student> sstream = new Comparator<Student>() {
		
		public int compare(Student s1, Student s2) {
			
			String std1 = s1.getStreamName();
			String std2 = s2.getStreamName();
			
			return std1.compareTo(std2); 		//This is for ascending order. For descending use std2.compareTo(std1)
		}
	};
	
	public String toString() {
		return "[id = "+ id +" name = "+ name +" stream = "+stream+" roll no =" +rollno+"]";
		 
	}
	
}
