package com.nt.stdp;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer1 p=null;
		p=Printer1.getInstance();
		System.out.println(p.hashCode()+"----->"+Thread.currentThread().getName());

	}

}
