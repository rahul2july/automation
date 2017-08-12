package Day8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {
	
	WebDriver ff;
	ExtentReports eReports;
	ExtentTest startTest;
	@BeforeSuite
	public void initSetup(){
		eReports = new ExtentReports("/Users/rahulgupta/Downloads" + getDatetimeStamp() + ".html");		
	}
	
	@BeforeMethod
	public void launchApp(){
//		open app
		 ff =new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");	
		
	}
	
	@AfterMethod
	public void teardown(){
		eReports.endTest(startTest);
		eReports.flush();
//		close app
		ff.close();	
		
	}
	
//	datetimestamp
	public String getDatetimeStamp(){	
		
		Date date = new Date();
		SimpleDateFormat sformat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		return sformat.format(date);		
	}
	
//	capture screenshot
	public String fullscreen() throws Exception{
		
		TakesScreenshot screen = (TakesScreenshot)ff;
		File screenshot = screen.getScreenshotAs(OutputType.FILE);
		String path = "/Users/rahulgupta/Downloads/s1_" + getDatetimeStamp() + ".png";
		FileUtils.copyFile(screenshot, new File(path));
		return path;
		
	}
	
//	capture element screenshot
	public String elementscreen(WebElement ele) throws Exception{
		
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
		String path = "/Users/rahulgupta/Downloads//s1_" + getDatetimeStamp() + ".png";
		FileUtils.copyFile(screenshot1, new File(path));
		return path;
		
	}
	
	
	
	
	

}














