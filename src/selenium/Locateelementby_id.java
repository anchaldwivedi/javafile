package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locateelementby_id 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Anshu%20PC/Desktop/loginpage.html");
			Thread.sleep(2000);
			driver.findElement(By.id("a4")).click();
  

	}

}