package com.nt.stdp;

public class Printer5 {
	private static Printer5 INSTANCE;
//private zero param Constructor

	private Printer5() {
		System.out.println("zero param private Constructor");
	}

//static factory method
	public static Printer5 getInstance() {
		if (INSTANCE == null) {
			synchronized (Printer5.class) {

				if (INSTANCE == null) {
					INSTANCE = new Printer5();// Lazy Instantiation (Good Code)
				}
			}
		}
		return INSTANCE;
	}

//business method
	public void printData(String data) {
		System.out.println(data);
	}
}
