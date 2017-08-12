package Day7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class screenshots {
	
	public static void main(String[] args) throws IOException {
	
//		open app
		WebDriver ff =new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
		
		WebElement ele = ff.findElement(By.name("B1"));		
		
//		Element level screenshot============================
		File screenshot1 = ((TakesScreenshot)ff).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg = ImageIO.read(screenshot1);

		// Get the location of element on the page
		 int xcor = ele.getLocation().getX();
		 int ycor = ele.getLocation().getY();
		 
		 

		// Get width and height of the element
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot= fullImg.getSubimage(xcor, ycor,eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", screenshot1);
		
		FileUtils.copyFile(screenshot1, new File("/Users/rahulgupta/Desktop/s1.png"));
		
//		element level screenshot=================================
		
//		enter amount
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
		
		
		
		Date date = new Date();
		SimpleDateFormat sformat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		String output = sformat.format(date);
		
//		Screenshot	
		
		TakesScreenshot screen = (TakesScreenshot)ff;
		File screenshot = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("/Users/rahulgupta/Desktop/s1_" + output + ".png"));
		
//		close app
		ff.close();
		
		
	}
	

}
