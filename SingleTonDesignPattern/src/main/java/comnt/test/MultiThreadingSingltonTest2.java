package comnt.test;

import com.nt.stdp.TicketBookingServlet2;

public class MultiThreadingSingltonTest2 {

	public static void main(String[] args) {
		TicketBookingServlet2 servlet=null;
		Thread req1=null;
		Thread req2=null;
		servlet=new TicketBookingServlet2();
		req1=new Thread(servlet);
		req2=new Thread(servlet);
			req1.start();
			req2.start();
	}

}
