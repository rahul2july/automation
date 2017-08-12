package Day2_Java;

public class yahoodriver {
	
	public static void main(String[] args) {
		
		YahooSearch ys = new YahooSearch();
		ys.launchApp("http://search.yahoo.com/");
		System.out.println(ys.searchAndExtract("Sikuli"));
		ys.tearDown();
		
		
		
		
		
	}
	

}
