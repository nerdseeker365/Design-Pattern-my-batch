package com.nt.stdp;

import com.nt.commons.CommonsUtil;

public class Printer6 extends CommonsUtil{
	private static Printer6 INSTANCE;
//private zero param Constructor

	private Printer6() {
		System.out.println("zero param private Constructor");
	}

//static factory method
	public static Printer6 getInstance() {
		if (INSTANCE == null) {
			synchronized (Printer6.class) {

				if (INSTANCE == null) {
					INSTANCE = new Printer6();// Lazy Instantiation (Good Code)
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
