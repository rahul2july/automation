package Rahul_Test;

public class Exercise1 {
	public static void main(String[] args)
	{	
		String url = "http://www.unit-conversion.info/temperature.html";
		Celsius_to_fahrenheit cf = new Celsius_to_fahrenheit(40);
		
		cf.launchApp(url);
		System.out.println("Test case passed: "+ cf.convert());
		cf.closeApp();
	}
}
		
		
		
		



