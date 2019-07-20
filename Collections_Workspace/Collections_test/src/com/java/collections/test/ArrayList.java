package com.java.collections.test;

import java.util.Hashtable;
import java.util.Vector;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {2,3,4,5};
		
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();
		Vector<String> str = new Vector();
		Hashtable<Integer,Integer> ht = new Hashtable();
		
		str.addElement("Sravan");
		v.addElement(1);
		v.addElement(2);
		h.put(1,"geek");
		h.put(2,"4geek");
		ht.put(1, 2);
		
		System.out.println(arr[0]); //int array
		System.out.println(v.elementAt(1)); // vector print
		System.out.println(h.get(1)); //
		System.out.println(str.elementAt(0));
		System.out.println(ht.get(1));
		

	}

}
