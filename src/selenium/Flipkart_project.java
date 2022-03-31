package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_project
{
  public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9960842141");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("cts@2010");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		

	}


}


