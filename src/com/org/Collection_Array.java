package com.org;

import java.util.ArrayList;
import java.util.List;

public class Collection_Array {
	public static void main(String[] args) {
		List<Object> Aa = new ArrayList<Object>();
		Aa.add(30);
		Aa.add(20);
		Aa.add(30);
		Aa.add("hema");
		System.out.println(Aa);

		int size = Aa.size();
		System.out.println(size);

		Object object = Aa.get(0);
		System.out.println(object);

		/*
		 * Object set = Aa.set(2,"hema"); System.out.println(Aa);
		 */

		int indexOf = Aa.indexOf("hema");
		System.out.println(indexOf);

		boolean contains = Aa.contains("hema");
		System.out.println(contains);

		List<String> Ab = new ArrayList<String>();
		Ab.add("kamalesh");
		Ab.add("ukg");
		Ab.add("intelligent");
		System.out.println(Ab);
		
	/*	Aa.addAll(Ab);
		System.out.println(Aa); */
		
	/*	Aa.retainAll(Ab); //print common values
		System.out.println(Aa);  */
		
		 Aa.remove(2);
		System.out.println(Aa);
		
		Aa.clear();
		System.out.println(Ab);



		
		
	}
}