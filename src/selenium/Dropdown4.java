package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown4
{

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anshu%20PC/Desktop/leela.html");
		WebElement ele=driver.findElement(By.xpath("//select[@id='leela palace']"));
		Select sel=new Select(ele);
		ArrayList<String> array=new ArrayList<String>();
		List<WebElement> options=sel.getOptions();
		for(WebElement texts:options)
		{
			String text=texts.getText();
			array.add(text);
		}
          Collections.sort(array,Collections.reverseOrder());
          for(String option:array)
          {
        	  System.out.println(option);
          }
	}

}
