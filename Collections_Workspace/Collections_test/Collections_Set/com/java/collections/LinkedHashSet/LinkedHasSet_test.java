package com.java.collections.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHasSet_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashSet doesn’t maintain any kind of order of its elements.
//		TreeSet sorts the elements in ascending order.
//		LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence in which they have been added to the Set.
//		
		
		LinkedHashSet<String> lhst = new LinkedHashSet<String>();
		lhst.add("Z");
		lhst.add("A");
		lhst.add("B");
		lhst.add("O");
		System.out.println(lhst);
		
		
		//LinkedHashSet of Integer type
		LinkedHashSet<Integer> lhst2 = new LinkedHashSet<Integer>();
		
		lhst2.add(2);
		lhst2.add(3);
		lhst2.add(4);
		lhst2.add(10);
		
		System.out.println(lhst2);
		
		
		
	}

}
