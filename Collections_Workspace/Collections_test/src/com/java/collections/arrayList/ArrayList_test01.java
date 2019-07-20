package com.java.collections.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_test01 {

	public static void main(String[] args) {
		
		//adding elements to arrayList
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("one");
		testList.add("two");
		testList.add("three");
		System.out.println(testList.add("Four"));
		testList.add(2,"empty");
		System.out.println(testList);
		
		//removing of Elements from Array List
		
		System.out.println(testList.remove(2));
		
		//iterating over arrayList
		for(String str : testList) {
			System.out.println(str);
		}
		
		//replacing a value at an index
		testList.set(2, "twoTwo");
		System.out.println(testList);
		System.out.println("Size of arrayList : "+testList.size());
		//testList.clear();
		System.out.println(testList);
		
		
		//Sorting of ArrayList
		Collections.sort(testList);
		for(String str : testList) {
			System.out.print(str);
		}
		System.out.println();
		
		//Sorting of ArrayList objects
		ArrayList<Student> arLst = new ArrayList<Student>();
		arLst.add(new Student("Chaitanya",384548,26));
		arLst.add(new Student("Rajesh",236547,24));
		
		Collections.sort(arLst);
		
		for(Student str: arLst) {
			System.out.println(str);
		}
		
		
		//sorting by name
		Comparator<Student> comparebyName = (Student st1,Student st2)->st1.getName().compareTo(st2.getName());
		Collections.sort(arLst,comparebyName);
		for(Student str: arLst) {
			System.out.println(str);
		}
		
 		
	}
	
	
	
}
