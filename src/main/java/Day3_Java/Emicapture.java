package Day3_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 class Emicapture {
	
	public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.homeloanshub.com/mortgage-calculator/");
		ff.manage().window().maximize();
		
		String tenure = "10";
		ff.findElement(By.name("principal")).sendKeys("10000");
		ff.findElement(By.name("interest")).sendKeys("10");
		WebElement duration = ff.findElement(By.name("tenure"));
		duration.sendKeys(tenure);
		
		ff.findElement(By.className("btn1")).click();
		
		
		int years = Integer.parseInt(tenure);
		int mts = years * 12;
		String str_mts = Integer.toString(mts);
		
			
		List<WebElement> fs= ff.findElements(By.xpath("//div[@id='emiresults']/table/tbody/tr"));
		int rowCount = fs.size();
//		One way
//		loop
		for(int i =2 ; i <= rowCount ; i++){
		
		String Val = ff.findElement(By.xpath("//div[@id='emiresults']/table/tbody/tr[" + i + "]/td[1]")).getText();
		if(Val.equals(str_mts)){
			
			String output = ff.findElement(By.xpath("//div[@id='emiresults']/table/tbody/tr[" + i + "]/td[2]")).getText();
			System.out.println(output);
			break;
			}
		}
		
//		Second Way
		String soutput = ff.findElement(By.xpath("//div[@id='emiresults']/table/tbody/tr[" + rowCount + "]/td[2]")).getText();
		System.out.println("second output is:" + soutput);	
		
		
//		thirdway
		String thirdoutput = ff.findElement(By.xpath("//div[@id='emiresults']/table/tbody//td[text()='" + mts + "']/../td[2]")).getText();
		System.out.println("third output is:" + thirdoutput);			
	
	
	
	}
}
