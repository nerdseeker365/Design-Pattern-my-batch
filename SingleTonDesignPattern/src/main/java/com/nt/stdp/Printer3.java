package com.nt.stdp;

public class Printer3 {
private static Printer3 INSTANCE;
//private zero param Constructor

private Printer3() {
	System.out.println("zero param private Constructor");
}
//static factory method
public static synchronized Printer3 getInstance() {
	if(INSTANCE==null) {
		INSTANCE=new Printer3();//Lazy Instantiation (Good Code)
	}
	return INSTANCE;
}
//business method
public void printData(String data) {
	System.out.println(data);
}
}
