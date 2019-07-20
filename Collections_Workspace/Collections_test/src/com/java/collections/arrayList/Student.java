package com.java.collections.arrayList;

import java.util.Comparator;

public class Student implements Comparable<Student>{

		private String name;
		private int rollNo;
		private int age;
		
		public Student(String name,int rollNo, int age) {
			this.name =name;
			this.rollNo = rollNo;
			this.age = age;	
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public int compareTo(Student st1) {
		
			return (this.getAge() < st1.getAge() ? -1 : 
	            (this.getAge() == st1.getAge() ? 0 : 1)); 
		}
		
		 @Override     
		  public String toString() {         
		    return " Name: " + this.name + ", Age: " + this.age + ", RollNo:" + this.rollNo;     
		  }
		
		
	
}
