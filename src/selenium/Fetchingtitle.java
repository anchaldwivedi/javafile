package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetchingtitle 
{
	public static void main(String[] args)throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.com");
		Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
}
}
