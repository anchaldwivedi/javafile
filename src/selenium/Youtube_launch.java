package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_launch
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("paramsundari");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();
	}
	}