package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown1 {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anshu%20PC/Desktop/leela.html");
		WebElement ele=driver.findElement(By.xpath("//select[@id='leela palace']"));
		Select sel=new Select(ele);
		sel.selectByIndex(3);
		Thread.sleep(1000);
		sel.selectByValue("B");
	    Thread.sleep(1000);
	    sel.selectByVisibleText("jeera rice");
	    Thread.sleep(1000);
	    sel.deselectAll();
	}

}

