package com.java.collections.hashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1, "first");
		hmap.put(2, "Second");
		System.out.println("For Loop: ");
		for(Map.Entry me : hmap.entrySet()) {
			System.out.println("key: "+ me.getKey()+" Value: "+me.getValue());
		}
		
		//
		System.out.println("while loop:");
		Iterator it = hmap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry me2 = (Map.Entry)it.next();
			System.out.println("key "+me2.getKey()+" Value : "+me2.getValue());
		}
		
		//HashMap sorting
		HashMap<Integer,String> hms1 = new HashMap<Integer,String>();
		hms1.put(5, "A");
        hms1.put(11, "C");
        hms1.put(4, "Z");
        hms1.put(77, "Y");
        hms1.put(9, "P");
        hms1.put(66, "Q");
        hms1.put(0, "R");
        System.out.println("befoe sorting");
        Iterator it2 = hms1.entrySet().iterator();
        while(it2.hasNext()) {
        	Map.Entry me2 = (Map.Entry)it2.next();
        	System.out.println("Key: "+ me2.getKey()+" Value :"+me2.getValue());
        }
		
		
		System.out.println("After Sorting by key");
		Map<Integer,String> map = new TreeMap<Integer,String>(hms1);
		
        Set set2 = map.entrySet();
        Iterator it3=set2.iterator();
        while(it3.hasNext()) {
        	Map.Entry me3 = (Map.Entry)it3.next();
        	System.out.println(" key: "+me3.getKey()+" Value: "+me3.getValue());
        }
        
        
        //Hashmap sorting by Values
        List list = new LinkedList(hms1.entrySet());
        Collections.sort(list, new Comparator() {
        	 public int compare(Object o1, Object o2) {
                 return ((Comparable) ((Map.Entry) (o1)).getValue())
                    .compareTo(((Map.Entry) (o2)).getValue());
                 } 
        });
        
        
	}

}
