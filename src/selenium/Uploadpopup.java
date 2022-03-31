package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadpopup {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Anshu%20PC/Desktop/form.html");
		Thread.sleep(1000);
		 WebElement ele=driver.findElement(By.xpath("//input[@id='upload file']"));
		 ele.sendKeys("C:\\Users\\Anshu PC\\Desktop\\GoToWebinar 013.png");
		

	}

}
