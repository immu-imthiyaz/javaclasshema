package com.org;

import java.util.Scanner;

public class Scanner_java {
	public static void main(String[] args) {
		
		Scanner even = new Scanner (System.in);
		System.out.println("enter the value");
	

		int n = even.nextInt();
		if (n%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		
	}
	

}
