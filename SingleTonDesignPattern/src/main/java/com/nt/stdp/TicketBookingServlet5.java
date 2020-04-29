package com.nt.stdp;

public class TicketBookingServlet5 implements Runnable {

	@Override
	public void run() {
		Printer5 p=null;
		p=Printer5.getInstance();
		System.out.println(p.hashCode()+"----->"+Thread.currentThread().getName());

	}

}
