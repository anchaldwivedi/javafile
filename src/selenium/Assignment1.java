package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1
{
   public static void main(String[] args)throws InterruptedException
	{
	   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Anshu%20PC/Desktop/dummy.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("hi");
		Thread.sleep(2000);
		driver.findElement(By.className("c2")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("c2")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.className("c3")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("c4")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("c3")).click();
	
		
	}

}


		
	