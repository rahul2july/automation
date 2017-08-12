package Day4_interface_intermediate;

public class Abstractdriver {
	
	
	public static void main(String[] args) {
		
		RamYahooSearch ys = new RamYahooSearch();
		ys.openApp("https://search.yahoo.com/");
		System.out.println(ys.extractresult("selenium"));
		ys.Close();
		
		
//		
//		ShyamBing bg = new ShyamBing();
//		bg.openApp("http://www.bing.com/");
//		System.out.println(bg.extractresult("selenium"));
//		bg.Close();

		
		
		
		
		
		
		
		
	}

}
