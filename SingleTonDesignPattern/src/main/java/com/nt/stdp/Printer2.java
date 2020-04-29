package com.nt.stdp;

public class Printer2 {
private static Printer2 INSTANCE;
//private zero param Constructor

private Printer2() {
	System.out.println("zero param private Constructor");
}
//static factory method
public static Printer2 getInstance() {
	if(INSTANCE==null) {
		INSTANCE=new Printer2();//Lazy Instantiation (Good Code)
	}
	return INSTANCE;
}
//business method
public void printData(String data) {
	System.out.println(data);
}
}
