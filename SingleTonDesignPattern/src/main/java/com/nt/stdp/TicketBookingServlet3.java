package com.nt.stdp;

public class TicketBookingServlet3 implements Runnable {

	@Override
	public void run() {
		Printer3 p=null;
		p=Printer3.getInstance();
		System.out.println(p.hashCode()+"----->"+Thread.currentThread().getName());

	}

}
