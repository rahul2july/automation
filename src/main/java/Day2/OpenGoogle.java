package Day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {
	
public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.google.co.in/");
		ff.manage().window().maximize();
}

}
