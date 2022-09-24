package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitPractice 
{
	   
	public waitPractice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	   @FindBy(xpath="")private WebElement UserId;
	   @FindBy(xpath="//input[@id='password']")private WebElement Password; 
	   @FindBy(xpath="//button[@type='submit']")private WebElement LogIn;
	   @FindBy(xpath="//input[@id='pin']")private WebElement Pin;
	   @FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
       
	   public void EnterUserId(String GetData,WebDriver driver)
	   {
		   UserId.sendKeys(GetData); 
		   WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(2000));
	       w.until(ExpectedConditions.visibilityOf(UserId));
	   }
	   public void EnterPassword(String GetData)
	   {
		   Password.sendKeys(GetData);
	   }
	   public void ClickOnLogIn()
	   {
		   LogIn.click();
	   }
	   public void Enterpin(String pin)
	   {
		   Pin.sendKeys(pin);
	   }
	   public void ClickOnContinue()
	   {
		   continueButton.click();
	   }



}
