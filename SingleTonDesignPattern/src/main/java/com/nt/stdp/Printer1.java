package com.nt.stdp;

public class Printer1 {
private static Printer1 INSTANCE=new Printer1();//Eager instantiation(Wrong Code)
//private zero param Constructor

private Printer1() {
	System.out.println("zero param private Constructor");
}
//static factory method
public static Printer1 getInstance() {
	
	return INSTANCE;
}

}

