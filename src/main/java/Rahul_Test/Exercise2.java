package Rahul_Test;

public class Exercise2 {
	public static void main(String[] args) {
		String url = "http://www.mapsofindia.com/maps/cities/cities-in-india.html";
		MapsofIndia mi = new MapsofIndia();
		mi.launchApp(url);
		mi.selectBangalore();
		mi.validateCityOrder();
		
		
	}

}
