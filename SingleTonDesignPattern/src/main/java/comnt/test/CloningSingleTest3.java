package comnt.test;

import com.nt.stdp.Printer8;

public class CloningSingleTest3 {

	public static void main(String[] args) {
		Printer8 p1=null,p2=null,p3=null;
		p1=Printer8.getInstance();
		try {
			// Cloning
			
			p2=(Printer8)p1.clone();
			p3=(Printer8)p2.clone();
			System.out.println(p1.hashCode()+"  "+p2.hashCode()+"  "+p3.hashCode());
		System.out.println("(p1==p2)"+(p1==p2));
		}
		catch(CloneNotSupportedException e) {
		e.printStackTrace();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
