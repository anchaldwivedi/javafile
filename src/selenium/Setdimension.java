package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setdimension {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Dimension d = new Dimension(300,300 );
		driver.manage().window().setSize(d);

		
		
		
		
		
		
		

	}

}
