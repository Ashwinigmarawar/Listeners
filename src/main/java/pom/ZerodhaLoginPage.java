package pom;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pojo.LaunchBrowser;

public class ZerodhaLoginPage 
{

	public ZerodhaLoginPage(WebDriver driver)
	   {
		  PageFactory.initElements(driver, this); 
	   }

	   @FindBy(xpath="//input[@id='userid']")private WebElement UserId;
	   @FindBy(xpath="//input[@id='password']")private WebElement Password; 
	   @FindBy(xpath="//button[@type='submit']")private WebElement LogIn;
	   @FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement Forgot;
	   @FindBy(xpath="//input[@id='pin']")private WebElement Pin;
	   @FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	   @FindBy(xpath="//a[@class='text-light']")private WebElement Signup;
	   @FindBy(xpath="(//input[@type='text'])[1]")private WebElement ForgotUserid;
	   public void EnterUserId(String GetData)
	   {
		   UserId.sendKeys(GetData);  
	   }
	   public void EnterPassword(String GetData)
	   {
		   Password.sendKeys(GetData);
	   }
	   public void ClickOnLogIn()
	   {
		   LogIn.click();
	   }
	   public void ClickOnForgotDetails()
	   {
		   Forgot.click();
	   }
	   public void Enterpin(WebDriver driver,String Getdata)
	   {
		   WebDriverWait webdriverwait=new WebDriverWait(driver,Duration.ofMillis(2000));
		   webdriverwait.until(ExpectedConditions.visibilityOf(Pin));
		   Pin.sendKeys(Getdata);
	   }
	   public void ClickOnContinue()
	   {
		   continueButton.click();
	   }
       public void ClickOnSignUp()
       {
    	   Signup.click();
       }
       public void SwitchToSignupPage(WebDriver driver) throws InterruptedException
       {
    	  Set<String> handles=driver.getWindowHandles();
    	  Iterator<String>i=handles.iterator();
    	  while(i.hasNext())
    	  {
    		  String a=i.next();
    		  driver.switchTo().window(a);
    		  String title=driver.getTitle();
    		  if(title.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha"))
    		  {
    			  break;
    		  }
    
    	  }
       }
       public void EnterUserIdOfForgot()
       {
    	   ForgotUserid.sendKeys("abc");
       }


}
