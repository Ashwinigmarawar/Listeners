package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.LaunchBrowser;

public class screenShot 
{
    
	public static void screenshot(WebDriver driver,String name) throws IOException
	{
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\ASHWINI\\eclipse-workspace\\KiteZerodha\\ScreenShot\\"+name+".jpg");
	    FileHandler.copy(source, destination);
	}
}
