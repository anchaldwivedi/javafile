package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1
{

	public static void main(String[] args)throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
		Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	
	if (title.equals("actiTIME - Login"))
	{
		System.out.println("title matches");
	}
	else
	{
		System.out.println("title mismatches");
	}
}	
}

