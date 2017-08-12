package Day8;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Logsss {
	
	
 public static void main(String[] args) {
	 
	 Logger logr = Logger.getLogger(Logsss.class);
		
//		open app
		FirefoxDriver ff =new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		logr.info("launched application");
//		enter amount
		ff.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys("100000");		
//		enter rate
		ff.findElement(By.id("two")).sendKeys("10");		
//		enter tenure
		ff.findElement(By.name("instalment")).sendKeys("120");	
//		click on calculate
		ff.findElement(By.name("B1")).click();
		logr.info("Clicked on Calculate button");
//		extract EMI
		String act_output = ff.findElement(By.id("four")).getAttribute("value");
		System.out.println(act_output);
		logr.info("Application output is :" + act_output);
//		close app
		ff.close();
		
			
		
	}	
	
	
	
	
	
	

}
