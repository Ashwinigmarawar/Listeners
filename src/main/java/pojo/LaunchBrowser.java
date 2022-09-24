package pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
  public static WebDriver openBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHWINI\\Chrome\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.navigate().to("https://kite.zerodha.com");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
      return driver;
  }
}
