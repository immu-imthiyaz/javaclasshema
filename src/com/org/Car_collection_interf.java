package com.org;

public class Car_collection_interf implements Car_Value_Inter {

	@Override
	public void lambogerni() {
		System.out.println("speed 500kmph");
	}

	@Override
	public void ferrari() {
		System.out.println("speed 400kmph");
	}

	@Override
	public void rollsroyhe() {
		System.out.println("speed 350kmph");
	}

	@Override
	public void nexon() {
		System.out.println("speed 200kmph");
	}

	@Override
	public void bmw() {
		System.out.println("speed 300kmph");
	}

	@Override
	public void audi() {
		System.out.println("speed 250kmph ");

	}
	

	public static void main(String[] args) {

		Car_collection_interf obj = new Car_collection_interf();
		obj.ferrari();
		obj.lambogerni();
		obj.rollsroyhe();
		obj.nexon();
		obj.bmw();
		obj.audi();
	}

}
