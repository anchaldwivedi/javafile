package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathlognfb {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("weatrdyfugug");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("erdygvuh1");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

	}

	}


