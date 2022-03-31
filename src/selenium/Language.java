package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Language {

	public static void main(String[] args) 
	{


		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//a[.='हिन्दी']"));
		String tip=ele.getAttribute("title");
		System.out.println(tip);
		Point loc=ele.getLocation();
		System.out.println(loc);
		int x=loc.getX();
		System.out.println(x);
		int y=loc.getY();
		System.out.println(y);

	}

}
