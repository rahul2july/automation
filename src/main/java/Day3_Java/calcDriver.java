package Day3_Java;

public class calcDriver {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		double c = 2.0;
		double d = 2.0;
		
		Ram_ScientificCalc rm = new Ram_ScientificCalc();
		System.out.println(rm.add(a, b));
		System.out.println(rm.multiply(a, b));
		System.out.println(rm.poww(c, d));
		
		
		Shyam_simplecalc sm = new Shyam_simplecalc();
		System.out.println(sm.add(a, b));
		System.out.println(sm.multiply(a, b));
		System.out.println(sm.kgtogm(a));
		
		
		
		
		
	}
	
	

}
