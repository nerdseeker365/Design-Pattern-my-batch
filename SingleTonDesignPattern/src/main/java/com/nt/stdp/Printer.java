package com.nt.stdp;

public class Printer {
private static Printer INSTANCE;
//private zero param Constructor

private Printer() {
	System.out.println("zero param private Constructor");
}
//static factory method
public static Printer getInstance() {
	if(INSTANCE==null) {
		INSTANCE=new Printer();//Lazy Instantiation (Good Code)
	}
	return INSTANCE;
}
//business method
public void printData(String data) {
	System.out.println(data);
}
}
