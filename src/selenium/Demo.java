package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo
{
 public static void main(String[] args)
 {
	String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		
			
			System.setProperty(key, value);
	FirefoxDriver ffd=new FirefoxDriver();
	String key1 ="webdriver.chrome.driver";
	String value2="./softwares/chromedriver.exe";
	
		
		System.setProperty(key1, value2);
ChromeDriver  cdd=new ChromeDriver();
}
}
 