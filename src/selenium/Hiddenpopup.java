package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddenpopup {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@style='min-width: 185px;']")).click();
			Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='26'][1]")).click();
		
		
		

	}

}
