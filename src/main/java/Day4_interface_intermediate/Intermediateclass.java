package Day4_interface_intermediate;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Intermediateclass implements Searchinter{
	FirefoxDriver fd;
	
	public void openApp(String Url) {
		// TODO Auto-generated method stub
		fd = new FirefoxDriver();
		fd.get(Url);
		fd.manage().window().maximize();
	}

	public String extractresult(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	public void Close() {
		// TODO Auto-generated method stub
		fd.close();
	}
	
	
	
	
	
	
	

}
