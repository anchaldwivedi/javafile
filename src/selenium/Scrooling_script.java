package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrooling_script
{
	public static void main(String args) throws InterruptedException

{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
     driver.get("https://www.amazon.com");
     Thread.sleep(1000);
     JavascriptExecutor jse= (JavascriptExecutor)driver;
     jse.executeScript("window.scrollBy(0,300)");
     Thread.sleep(1000);
      jse.executeScript("window.scrollBy(0,-300)");


}
	
}
