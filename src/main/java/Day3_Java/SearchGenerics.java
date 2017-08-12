package Day3_Java;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchGenerics  {

	
	FirefoxDriver ff;
	
//	Launch
	public void launchApp(String url){
		
		ff = new FirefoxDriver();
		ff.get(url);
		ff.manage().window().maximize();
		
	}
	
	

//	Close App
	public void tearDown(){
		
		ff.close();
		
	}
	
	
	
	
	
}
