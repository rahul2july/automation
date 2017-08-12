package Day3_Java;

public class Accessmodifierss {
	
	public String pub = "public";
	private String pri = "private";
	String def = "default";
	protected String pro = "protected";
	
	
	public void pubmethod(){
		System.out.println("public method");
	}
	
	private void primethod(){
		System.out.println("private method");
	}
	
	 void defmethod(){
		System.out.println("default method");
	}
	
	protected void promethod(){
		System.out.println("protected method");
	}
	
//	public static void main(String[] args) {
//		Accessmodifierss ac = new Accessmodifierss();
//		
		
////		variables
//		System.out.println(ac.pub);
//		System.out.println(ac.pri);
//		System.out.println(ac.def);
//		System.out.println(ac.pro);
//		
//		
//		ac.pubmethod();
//		ac.primethod();
//		ac.defmethod();
//		ac.promethod();
//		
//		
//	}	
	

}
