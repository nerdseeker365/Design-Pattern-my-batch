package com.nt.stdp;

public class TicketBookingServlet4 implements Runnable {

	@Override
	public void run() {
		Printer4 p=null;
		p=Printer4.getInstance();
		System.out.println(p.hashCode()+"----->"+Thread.currentThread().getName());

	}

}
