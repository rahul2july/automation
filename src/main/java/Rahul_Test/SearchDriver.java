package Rahul_Test;

public class SearchDriver {
	public static void main(String[] args) {
		FlipkartSearch fs= new FlipkartSearch();
		fs.launchApp("https://www.flipkart.com/");
		fs.SearchandExtract("mobile");
		fs.teardown();
		
		GoogleSearch gs = new GoogleSearch();
		gs.launchApp("https://www.google.co.in");
		
		
		
		
		
	}

}
