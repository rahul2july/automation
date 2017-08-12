package Rahul_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MapsofIndia {
	FirefoxDriver ff ;
	
	public void launchApp(String url) {	
		ff = new FirefoxDriver();
		ff.get(url);
		ff.manage().window().maximize();
	}
	
	public void closeApp()
	{
		ff.quit();
		
	}
	
	public void selectBangalore(){
		ff.findElement(By.xpath("//select[@name='dir']//option[@value='http://www.mapsofindia.com/bangalore/']")).click();		
		
	}
	
	public void validateCityOrder(){
		List<WebElement> ls = ff.findElements(By.xpath("//select[@name='dir']"));
		System.out.println(ls);
		
	}

}
