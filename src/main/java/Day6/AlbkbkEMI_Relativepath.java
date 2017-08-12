package Day6;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlbkbkEMI_Relativepath {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {	
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir" )+ "/src/main/resources/GlobalSettings.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
//		String url = prop.getProperty("Url");
		String url = prop.getProperty(prop.getProperty("env"));
		
		
//		open app
		FirefoxDriver ff =new FirefoxDriver();
		ff.get(url);
		
//		enter amount
//		ff.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys("100000");
//		ff.findElement(By.xpath("//input[@name='principal']")).sendKeys("10000");
		ff.findElement(By.xpath("//div[@class='frmbody']/div[1]/div[3]/input")).sendKeys("10000");
//		enter rate
		ff.findElement(By.id("two")).sendKeys("10");		
//		enter tenure
		ff.findElement(By.name("instalment")).sendKeys("120");	
//		click on calculate
		ff.findElement(By.name("B1")).click();
		
//		extract EMI
		String act_output = ff.findElement(By.id("four")).getAttribute("value");
		System.out.println(act_output);
//		close app
		ff.close();
		
		
		
		
		
		
		
	}	
	
}
