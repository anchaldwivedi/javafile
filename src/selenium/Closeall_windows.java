package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closeall_windows 
{

	public static void main(String[] args) throws InterruptedException
		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.naukri.com/");
			Thread.sleep(2000);
			 String pid=driver.getWindowHandle();
			 System.out.print(pid);
			 Thread.sleep(1000);
			 Set<String> alid=driver.getWindowHandles();
			 for( String childid:alid)
			 {
				 driver.switchTo().window(childid);
				 System.out.println(childid);
				 String tit =driver.getTitle();
				 System.out.println(tit);
				 driver.close();
				 
				 
				 
			 }
			 

	}

}
