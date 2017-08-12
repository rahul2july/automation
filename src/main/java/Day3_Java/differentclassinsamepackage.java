package Day3_Java;

public class differentclassinsamepackage {
	
	
	public static void main(String[] args) {
		Accessmodifierss ac = new Accessmodifierss();
		
		
//		variables
		System.out.println(ac.pub);
//		System.out.println(ac.pri);
		System.out.println(ac.def);
		System.out.println(ac.pro);
		
		
		ac.pubmethod();
//		ac.primethod();
		ac.defmethod();
		ac.promethod();
		
		
	}	
	
	
	
	
	
	
	
	
	

}
