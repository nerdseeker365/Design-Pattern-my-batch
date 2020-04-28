package comnt.test;

import com.nt.stdp.Printer; 

public class SinglTonTest {
public static void main(String[] args) {
	Printer p1=null,p2=null;
	//p1=new Printer();//not possible
	p1=Printer.getInstance();
	p2=Printer.getInstance();
	System.out.println(p1.hashCode()+"   "+p2.hashCode());
	System.out.println("--------------------");
	System.out.println("(p1==p2??)"+(p1==p2));
	System.out.println("--------------------------");
	p1.printData("sankar");
	p2.printData("gajini");
}
}
