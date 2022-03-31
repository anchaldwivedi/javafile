package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_tick 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Anshu%20PC/Desktop/checkbox.html");
		List< WebElement > ele=driver.findElements(By.xpath("//input"));
		for(WebElement cbox:ele)
		{
			cbox.click();
			Thread.sleep(1000);
			
		}
				

	}
}


