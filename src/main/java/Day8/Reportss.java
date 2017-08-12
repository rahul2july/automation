package Day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reportss {
	
public static void main(String[] args) throws Exception {
	
	 	ExtentReports eReports = new ExtentReports("/Users/rahulgupta/Downloads/reports.html");
		ExtentTest startTest = eReports.startTest("TC_01");
	 	
	 	
//		open app
		FirefoxDriver ff =new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
		startTest.log(LogStatus.PASS, "Launching application" , "Passed as the application is launched");
//		enter amount
		ff.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys("100000");		
//		enter rate
		ff.findElement(By.id("two")).sendKeys("10");		
//		enter tenure
		ff.findElement(By.name("instalment")).sendKeys("120");	
//		click on calculate
		ff.findElement(By.name("B1")).click();
		startTest.log(LogStatus.PASS, "Entering value in application" , "Passed as the application data is entered");
		
//		extract EMI
		String act_output = ff.findElement(By.id("four")).getAttribute("value");
		System.out.println(act_output);
		
		TakesScreenshot screen = (TakesScreenshot)ff;
		File screenshot = screen.getScreenshotAs(OutputType.FILE);
		String path = "/Users/rahulgupta/Downloads//s2_.png";
		FileUtils.copyFile(screenshot, new File(path));
		
		
		startTest.log(LogStatus.PASS, "output value" , "Passed as the Output is displayed" + startTest.addScreenCapture(path));
//		close app
		ff.close();
		
		eReports.endTest(startTest);
		eReports.flush();
				
	}		

}
