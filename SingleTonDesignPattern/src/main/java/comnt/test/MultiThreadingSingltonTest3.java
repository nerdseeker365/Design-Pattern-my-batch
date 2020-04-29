package comnt.test;

import com.nt.stdp.TicketBookingServlet3;

public class MultiThreadingSingltonTest3 {

	public static void main(String[] args) {
		TicketBookingServlet3 servlet=null;
		Thread req1=null;
		Thread req2=null;
		servlet=new TicketBookingServlet3();
		req1=new Thread(servlet);
		req2=new Thread(servlet);
			req1.start();
			req2.start();
	}

}
