package Day4_interface_intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RamYahooSearch extends Intermediateclass {



	public String extractresult(String search) {
		// TODO Auto-generated method stub

		fd.findElement(By.tagName("input")).sendKeys(search);
		fd.findElement(By.className("sbb")).click();
//		one way
		String output = fd.findElement(By.xpath("//div[@class='compPagination']/span")).getText();
		return output;
	}

	
	
}
