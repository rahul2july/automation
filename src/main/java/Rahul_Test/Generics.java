package Rahul_Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Generics {
	FirefoxDriver ff;
	public void launchApp(String url) {
		ff = new FirefoxDriver();
		ff.get(url);
		ff.manage().window().maximize();
	}
	
	public void teardown(){
		ff.quit();
	}
		
		

}
