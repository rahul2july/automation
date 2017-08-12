package Rahul_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Celsius_to_fahrenheit {
	FirefoxDriver ff ;
	String test_val;
	Double output;
	public void launchApp(String url) {
		
		ff = new FirefoxDriver();
		ff.get(url);
		ff.manage().window().maximize();
	}
	
	public void closeApp()
	{
		ff.quit();
		
	}
	
	public Celsius_to_fahrenheit(int input)
	{
		test_val = Integer.toString(input);
		output = input * 1.8 + 32;
	}
	
	
	public Boolean convert() {
		ff.findElement(By.id("T1")).clear();
		ff.findElement(By.id("T1")).sendKeys(test_val);
		
		ff.findElement(By.xpath("//select[@id='field_D1']//option[@value='0']")).click();
		ff.findElement(By.xpath("//select[@id='field_D2']//option[@value='1']")).click();

		String value= ff.findElement(By.id("T2")).getAttribute("value");
		Integer expected_val = Integer.parseInt(value.replaceAll("\\s+",""));
		if ( (double)expected_val == output){
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
