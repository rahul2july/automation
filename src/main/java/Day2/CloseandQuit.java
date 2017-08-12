package Day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseandQuit {
	
	public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://in.rediff.com/");
		ff.manage().window().maximize();
		
//		close parent window
//		ff.close();
		
//		close all the browser open during the sesson
		ff.quit();
		
		
		
		
	}
}
