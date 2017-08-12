package Day3_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingSearch extends SearchGenerics{

	
	public String searchandExtract(String search){
		
		ff.findElement(By.id("sb_form_q")).sendKeys(search);
		ff.findElement(By.id("sb_form_go")).click();
		
		return ff.findElement(By.className("sb_count")).getText();	
			
	}
	
	
	
	
	
	
	
	
	
	
	

}
