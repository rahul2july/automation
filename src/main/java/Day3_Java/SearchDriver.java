package Day3_Java;

public class SearchDriver {
	
	public static void main(String[] args) {
	
		YahooSearch ys = new YahooSearch();
		ys.launchApp("https://search.yahoo.com/");
		System.out.println(ys.searchAndExtract("sikuli"));
		ys.tearDown();
		
		
		BingSearch bs = new BingSearch();
		bs.launchApp("http://www.bing.com/");
		System.out.println(bs.searchandExtract("sikuli"));
		bs.tearDown();
		
		
		
		
		
		
	}	

}
