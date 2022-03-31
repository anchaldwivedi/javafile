package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verificationbyurl 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
			Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		if (url.equals("http://localhost/login.do"))
		{
			System.out.println("test case passs");
		}
		else
		{
			System.out.println("test case fail");
		}
	}
		
	}


