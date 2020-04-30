package com.nt.stdp;

import com.nt.commons.CommonsUtil;

public class Printer7 extends CommonsUtil{
	private static Printer7 INSTANCE;
//private zero param Constructor

	private Printer7() {
		System.out.println("zero param private Constructor");
	}

//static factory method
	public static Printer7 getInstance() {
		if (INSTANCE == null) {//1st null check
			synchronized (Printer7.class) {

				if (INSTANCE == null) {//2nd null check
					INSTANCE = new Printer7();// Lazy Instantiation (Good Code)
				}
			}
		}
		return INSTANCE;
	}

//business method
	public void printData(String data) {
		System.out.println(data);
	}
	//Solving cloning problem of singleton(RECOMMENDED)
	@Override
public 	Object clone()throws CloneNotSupportedException{
	throw new CloneNotSupportedException("Cloning is not allowed on singlton class");
}
}
