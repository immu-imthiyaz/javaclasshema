package com.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps_Col {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(10,"rajini");
		m.put(40, "kamal");
		m.put(50, null);
		m.put(70, null);
		m.put(30,"vikaram");
		m.put(30, "jayamravi");
		m.put(10, "vijay");
		m.put(60, "ajith");
		System.out.println(m);

		
		int size = m.size();
		System.out.println(size);
		
		String string = m.get(10);
		System.out.println(string);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey(30);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("jayamravi");
		System.out.println(containsValue);
		
		
		
		
		
		
		
		
	}	
	}