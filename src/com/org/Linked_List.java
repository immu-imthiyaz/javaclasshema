package com.org;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	public static void main(String[] args) {
		List<Object> mi = new LinkedList<Object>();
		
		mi.add(10);
		mi.add(20);
		mi.add(null);
		mi.add(30);
		mi.add("immu");
		mi.add("riya");
		mi.add(10);
		mi.add(null);
		System.out.println(mi);
		
		int size = mi.size();
		System.out.println(size);
		
		Object object = mi.get(2);
		System.out.println(object);
		
		Object set = mi.set(2, "vas");
		System.out.println(mi);
		
		int indexOf = mi.indexOf(30);
		System.out.println(indexOf);
		
		boolean contains = mi.contains("immu");
		System.out.println(contains);
		
		List <Integer> mj = new LinkedList<Integer> ();
		mj.add(20);
		mj.add(30);
		mj.add(10);
		mj.add(60);
		System.out.println(mj);
		
//		mi.addAll(mj);
//		System.out.println(mi);
		
//		int size2 = mi.size();
//		System.out.println(size2);
		
//		mi.retainAll(mj);
//		System.out.println(mi);
		
		mi.removeAll(mj);
		System.out.println(mi);
		
//		Collections.sort(mj);
//		System.out.println(mj);
		
//		Collections.sort(mj,Collections.reverseOrder());
//		System.out.println(mj);
		
//	for (Object integer : mi) {
//			System.out.println(integer);
			
			
//			 mi.remove(6);
//			System.out.println(mi);
			
			
			
			
			
			
			
//		mi.clear();
//		System.out.println(mi);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	