package com.nt.stdp;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer2 p=null;
		p=Printer2.getInstance();
		System.out.println(p.hashCode()+"----->"+Thread.currentThread().getName());

	}

}
