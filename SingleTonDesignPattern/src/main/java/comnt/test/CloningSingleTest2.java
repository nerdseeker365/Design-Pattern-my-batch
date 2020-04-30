package comnt.test;

import com.nt.stdp.Printer7;
//after call zero param constructor cloning is stopped 
//not allow to create more objects
public class CloningSingleTest2 {

	public static void main(String[] args) {
		Printer7 p1=null,p2=null,p3=null;
		p1=Printer7.getInstance();
		try {
			// Cloning
			
			p2=(Printer7)p1.clone();
			p3=(Printer7)p2.clone();
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
