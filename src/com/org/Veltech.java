package com.org;

public class Veltech extends College {
	@Override
	public void agri(String agri,float per) {
	System.out.println(agri+"-"+per);	
	}
	@Override
	public void maths(String art,float per,int count) {
		System.out.println(art+"-"+per+"-"+count);
	}
	public static void main(String[] args) {
		Veltech clg = new Veltech();
		clg.aero("b.e", 20);
		clg.medical("doctor", 10);
		clg.Arts("bsc", 40);
		clg.agri("horti",15.6f );
		clg.maths("bsc", 18.9f, 35);
	}
	

}
