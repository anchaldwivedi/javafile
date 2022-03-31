package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginpageinstagram {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hello");


driver.findElement(By.cssSelector("input[type='password']")).sendKeys("h1255667");

driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
