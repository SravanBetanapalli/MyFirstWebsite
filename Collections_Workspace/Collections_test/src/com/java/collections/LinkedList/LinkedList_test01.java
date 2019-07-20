package com.java.collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("steve");
		list.add("Carl");
		list.add("Raj");
		
		list.addFirst("Negan");
		list.addLast("Sravan");
		list.add(0, "Rajesh");
		
		  //Iterating Linked List
		  Iterator<String> iterate = list.iterator();
		  System.out.println("Using Iterator"); 
		  while(iterate.hasNext()) {
		  System.out.println(iterate.next()); }
		 		
	    System.out.println("Using forEach: ");
		for(String str:list) {
			System.out.println(str);
		}
		
		
		//Removing LS
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("steve");
		ls.add("Jorge");
		ls.add("Raj");
		ls.add("Negan");
		ls.add("Rick");
		System.out.println("");

		ls.removeFirst();
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//ls.remove(4);
		
		Iterator<String> it2 = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it2.next());
		}

		//poll();pollFirst();pollLast();push(); pop();
		
		//poll() : removes the head of this list
		System.out.println("Element removed :"+ls.poll());
		System.out.println(ls);
		
		
		
	}

}
