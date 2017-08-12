package Day3_Accmodifier_outsidepackage;

import Day3_Java.Accessmodifierss;

public class Acc_extends extends Accessmodifierss{
	
	public static void main(String[] args) {
		Acc_extends ac = new Acc_extends();
		
		
//		variables
		System.out.println(ac.pub);
//		System.out.println(ac.pri);
//		System.out.println(ac.def);
		System.out.println(ac.pro);
		
		
		ac.pubmethod();
//		ac.primethod();
//		ac.defmethod();
		ac.promethod();
		
		
	}	
	
	
	
	
	
	
	
	
	

}
