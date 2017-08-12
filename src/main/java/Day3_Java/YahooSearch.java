package Day3_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearch extends SearchGenerics{
		
//	Search and Extract
	public String searchAndExtract(String searchoption){
		
		ff.findElement(By.tagName("input")).sendKeys(searchoption);
		ff.findElement(By.className("sbb")).click();
//		one way
		String output = ff.findElement(By.xpath("//div[@class='compPagination']/span")).getText();
		return output;
	
	}
	

	

}





