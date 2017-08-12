package Rahul_Test;

import org.openqa.selenium.By;

public class GoogleSearch extends Generics {
	
public void SearchandExtract (String searchString){
		ff.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(searchString);
//		ff.findElement(By.id("twotabsearchtextbox")).sendKeys(searchString);
		ff.findElement(By.className("nav-input")).click();
		
		
	}

		
	
}
