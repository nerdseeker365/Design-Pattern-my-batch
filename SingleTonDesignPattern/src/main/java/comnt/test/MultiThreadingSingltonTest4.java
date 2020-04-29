package comnt.test;

import com.nt.stdp.TicketBookingServlet4;

public class MultiThreadingSingltonTest4 {

	public static void main(String[] args) {
		TicketBookingServlet4 servlet=null;
		Thread req1=null;
		Thread req2=null;
		servlet=new TicketBookingServlet4();
		req1=new Thread(servlet);
		req2=new Thread(servlet);
			req1.start();
			req2.start();
	}

}
