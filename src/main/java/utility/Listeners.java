package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseTest implements ITestListener
{
  public void onTestFailure(ITestResult result) 
  {
	  try 
	  {
		screenShot.screenshot(driver, result.getName());
	} 
	  catch (IOException e) {
	
		e.printStackTrace();
	}
  }
  public void onTestStart(ITestResult result)
  {
	  System.out.println("Test Start: "+ result.getName());
  }
}
