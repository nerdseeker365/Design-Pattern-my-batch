package comnt.test;

import com.nt.stdp.Printer;
import com.nt.stdp.Printer1; 

public class SinglTonTest1 {
public static void main(String[] args) {
	
	try {
	Class.forName("com.nt.stdp.Printer1");
	}
	catch(Exception e) {
		e.getMessage();
		e.printStackTrace();
		System.out.println(e);
	}
	}
}
