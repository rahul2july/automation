package Day4_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RamYahooSearch implements Searchinter {

	FirefoxDriver ff;
	
	public void openApp(String Url) {
		// TODO Auto-generated method stub
		ff = new FirefoxDriver();
		ff.get(Url);
		ff.manage().window().maximize();
	}

	public String extractresult(String search) {
		// TODO Auto-generated method stub

		ff.findElement(By.tagName("input")).sendKeys(search);
		ff.findElement(By.className("sbb")).click();
//		one way
		String output = ff.findElement(By.xpath("//div[@class='compPagination']/span")).getText();
		return output;
	}

	public void Close() {
		// TODO Auto-generated method stub
		ff.close();
	}


	
	
}
