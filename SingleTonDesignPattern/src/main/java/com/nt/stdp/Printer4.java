package com.nt.stdp;

public class Printer4 {
private static Printer4 INSTANCE;
//private zero param Constructor

private Printer4() {
	System.out.println("zero param private Constructor");
}
//static factory method
public static  Printer4 getInstance() {
	synchronized (Printer4.class) {
	
	if(INSTANCE==null) {
		INSTANCE=new Printer4();//Lazy Instantiation (Good Code)
	}
	
	}
	return INSTANCE;
}
//business method
public void printData(String data) {
	System.out.println(data);
}
}
