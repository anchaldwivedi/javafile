package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdpwn3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anshu%20PC/Desktop/leela.html");
		WebElement ele=driver.findElement(By.xpath("//select[@id='leela palace']"));
		Select sel=new Select(ele);
		ArrayList<String> array =new ArrayList<String>();
		List<WebElement>  option=sel.getOptions();
		int count=option.size();
		System.out.println(count);
		for(WebElement text:option)
		{
			String altext=text.getText();
			
			array.add(altext);
		}
		Collections.sort(array);
		for( String sorted :array)
		{
			System.out.println(sorted);
		}

	}

}
