package com.nt.stdp;

import com.nt.commons.CommonsUtil;

public class Printer8 extends CommonsUtil{
	private static Printer8 INSTANCE;
//private zero param Constructor

	private Printer8() {
		System.out.println("zero param private Constructor");
	}

//static factory method
	public static Printer8 getInstance() {
		if (INSTANCE == null) {//1st null check
			synchronized (Printer8.class) {

				if (INSTANCE == null) {//2nd null check
					INSTANCE = new Printer8();// Lazy Instantiation (Good Code)
				}
			}
		}
		return INSTANCE;
	}

//business method
	public void printData(String data) {
		System.out.println(data);
	}
	//Solving cloning problem of singleton( NOT RECOMMENDED)
	@Override
public 	Object clone()throws CloneNotSupportedException{
	//return INSTANCE;
	//or
		return this;
}
}