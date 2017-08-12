package Day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Day7.ExcelReadwrite;

public class Assignment extends Base{
	
	
	Logger Alog = Logger.getLogger(Assignment.class);
	
	@Test(dataProvider = "dp")
	public void emiCalc(Map<String,String> hm) throws Exception{
		
		startTest = eReports.startTest(hm.get("ID"));	
		Alog.info("Started execution: " + hm.get("ID"));
		startTest.log(LogStatus.PASS, "Started execution" ,"Passed as execution started" + startTest.addScreenCapture(fullscreen()));
		ff.manage();
//		enter amount
		ff.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys(hm.get("Amount"));
//		enter rate
		ff.findElement(By.id("two")).sendKeys(hm.get("Interest").replace(".0", ""));		
//		enter tenure
		ff.findElement(By.name("instalment")).sendKeys(hm.get("Tenure").replace(".0", ""));	
//		click on calculate
		ff.findElement(By.name("B1")).click();
		Alog.info("Entered the value");
//		extract EMI
	WebElement ele = ff.findElement(By.id("four"));
	String act_output = ele.getAttribute("value");
		System.out.println(act_output);
		
		if(act_output.equals(hm.get("EMI"))){
			System.out.println("Pass");
			Alog.info("passed as Value is matching ");
			startTest.log(LogStatus.PASS, "Validation" ,"Passed as value matching");
		}else{
			System.out.println("Fail");	
			Alog.error("Failed as Actual was " + act_output + " and expected was " + hm.get("EMI"));
			startTest.log(LogStatus.FAIL, "Validation" ,"Failes as actual value " + act_output + " and expected was " + hm.get("EMI") + startTest.addScreenCapture(elementscreen(ele)));
		}
		

	}

	
	@DataProvider(name="dp")
	public  Iterator<Object[]> dpdata() throws Exception{
		

		ExcelReadwrite ex = new ExcelReadwrite(System.getProperty("user.dir") + "\\src\\main\\resources\\EMI.xlsx");
		int rowCount = ex.rowCount("Sheet1");
		int colCount = ex.colCount("Sheet1");
		
		ArrayList<Object[]> ls = new ArrayList<Object[]>();	
		
//		iterate thru each row
		for(int iRow = 1 ;iRow<=rowCount;iRow++){
//			create object array
			Object[] obj = new Object[1];
			
//			create map
			Map<String, String> Map = new HashMap<String,String>();
//			iterate thru column
			for(int iCol = 0;iCol<colCount;iCol++){
				
				String Key = ex.readCellValue("Sheet1", 0, iCol);
				String Val = ex.readCellValue("Sheet1", iRow, iCol);
				
				Map.put(Key, Val);
				
			}	//			iterate thru column
			
			obj[0]=Map;
			ls.add(obj);
			
		}//		iterate thru each row
		
		
		return ls.iterator();
		
		
		
		
		
		
	}
	
	
	
	
}
