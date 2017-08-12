package Day4_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShyamBing implements Searchinter {

	FirefoxDriver fd;
	
	public void openApp(String Url) {
		// TODO Auto-generated method stub
		fd = new FirefoxDriver();
		fd.get(Url);
		fd.manage().window().maximize();
	}

	public String extractresult(String search) {
		// TODO Auto-generated method stub
		fd.findElement(By.id("sb_form_q")).sendKeys(search);
		fd.findElement(By.id("sb_form_go")).click();
		
		return fd.findElement(By.className("sb_count")).getText();	
	}

	public void Close() {
		// TODO Auto-generated method stub
		fd.close();
	}
	
	public void gettitle(){
		System.out.println(fd.getTitle());
		
	}
	
}
