package pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait 
{
	 public static WebDriver openBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHWINI\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	      driver.navigate().to("https://kite.zerodha.com");
	      return driver;
	  }
}
