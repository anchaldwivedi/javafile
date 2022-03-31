package selenium;


import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown5
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Anshu%20PC/Desktop/leela.html");
	WebElement ele=driver.findElement(By.xpath("//select[@id='leela palace']"));
	Select sel =new Select(ele);
     TreeSet<String> tree =new TreeSet<String>(Collections.reverseOrder());
	List<WebElement> options=sel.getOptions();
	for(WebElement texts:options)
	{
		String text=texts.getText();
		tree.add(text);
		System.out.println(text);
	}
	for (String option:tree)
	{
		System.out.println(option);
	}
	
	}
}
	

	


