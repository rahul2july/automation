package Day7;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class firsttestng {
  @Test
  public void f() {
	  System.out.println("test method 1");	
	  sums();
  } 
  @Test
  public void g() {
	  System.out.println("test method 2");
	  
  }  
  @Test
  public void h() {
	  System.out.println("test method 3");
	  sums();
  }  
   public void sums() {
	  System.out.println("20");
   } 
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

;  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }


}
