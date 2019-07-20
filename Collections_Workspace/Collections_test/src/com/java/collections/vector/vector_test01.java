package com.java.collections.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class vector_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vector Basics
		Vector<String> ve = new Vector<String>(2);
		ve.addElement("Sravan1");
		ve.addElement("Sravan2");
		Enumeration en = ve.elements();
		ve.addElement("Sravan3");
		System.out.println("En has elements");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement()+" ");
		}
		
		System.out.println("Size is:"+ve.size());
		System.out.println(ve.capacity());
		
		ve.addElement("Sravan4");
		

		//replace a value in vector
		ve.set(1, "atFirst");
		
		//Vector Remove/Sort/Replace
		ve.remove("Sravan1");
		ve.remove(1);
		for(int i=0;i<ve.size();i++) {
			System.out.println(ve.get(i));
		}
		//Vector clear
		//ve.clear(); // deletes everything in the vector
		
		//set Vector Size
		ve.setSize(15);
		
		//Iterator / ListIterator / Enumeration
		//Iterator
		Iterator it = ve.iterator();
		System.out.println("Vector elements are :");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Forward traversing using ListIterator
		ListIterator Litr = ve.listIterator();
		System.out.println("Traversing in forward direction");
		while(Litr.hasNext()) {
			
			System.out.println(Litr.next());
			
		}
		
		//  Backward traversing using ListIterator
		while(Litr.hasPrevious()) {
			System.out.println(Litr.previous());
		}
		
		
		
		
		
//		Conversions
		//Vector to List
		
		List<String> ls = Collections.list(ve.elements());
		System.out.println("\nList Elements :");
	    for (String str2 : ls){
	       System.out.println(str2);
	    }
		
		//Vector to ArrayList
	    ArrayList<String> arraylist = new ArrayList<String>(ve);
	    
	    
	    //Displaying array Elements
	    System.out.println("\nArrayList Elements :");
	     for (String s : arraylist){
	        System.out.println(s);
	     }
	     
	     //Vector to String
	     String[] str = ve.toArray(new String[ve.size()]);
	}

}
