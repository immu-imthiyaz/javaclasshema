package com.org;

public class Memory_class {
//	main method

	public static void main(String[] args) {
//		String s1 = "imthiyaz";
//	    String s2 = "imthiyaz";
//		System.out.println(System.identityHashCode(s1));
//	    System.out.println(System.identityHashCode(s2));
//				System.out.println(s1+s2);  merge
//		System.out.println(System.identityHashCode(s1+s2));    new memory allocate

		StringBuffer refname1 = new StringBuffer("Ramuthai");
		StringBuffer refname2 = new StringBuffer("Ramuthai");
	System.out.println(System.identityHashCode(refname1));
		System.out.println(System.identityHashCode(refname2));
	 
		System.out.println(refname1.append(refname2));

		StringBuilder r = new StringBuilder();
		StringBuilder r2 = new StringBuilder();
		
		
	}

}
