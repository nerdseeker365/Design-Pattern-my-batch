package comnt.test;

import com.nt.stdp.TicketBookingServlet5;

public class MultiThreadingSingltonTest5 {

	public static void main(String[] args) {
		TicketBookingServlet5 servlet=null;
		Thread req1=null;
		Thread req2=null;
		servlet=new TicketBookingServlet5();
		req1=new Thread(servlet);
		req2=new Thread(servlet);
			req1.start();
			req2.start();
	}

}
