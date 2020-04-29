package comnt.test;

import com.nt.stdp.Printer6;

public class CloningSingleTest {

	public static void main(String[] args) {
		Printer6 p1=null,p2=null,p3=null;
		p1=Printer6.getInstance();
		try {
			// Cloning
			
			p2=(Printer6)p1.clone();
			p3=(Printer6)p2.clone();
			System.out.println(p1.hashCode()+"  "+p2.hashCode()+"  "+p3.hashCode());
		System.out.println("(p1==p2)"+(p1==p2));
		}
		catch(Exception e) {
		e.printStackTrace();	
		}
	}

}
