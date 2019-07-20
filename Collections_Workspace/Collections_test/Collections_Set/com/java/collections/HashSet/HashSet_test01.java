package com.java.collections.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_test01 {

	//Non-synchronized
	//
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("hsOne");
		hs.add("hsTwo");
		hs.add("hsThree");
		System.out.println(hs);
		for(String str: hs) {
			System.out.println(str);
		}
		
		//to delete all elements in HashSet
		//hs.clear();
		
		Set<String> tset = new TreeSet<String>(hs);
		//Displaying Treeset elements
		System.out.println("Tree Contains: ");
		for(String str:tset) {
			System.out.println(str);
		}
		
		

	}

}
