package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {

public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
			Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vivekanand.dwivedi@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("vnd@2021");
    Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[name='login']")).click();

		}

	

	

	}



