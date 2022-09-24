package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhaForgotUserIdPage 
{
      public zerodhaForgotUserIdPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
   
      @FindBy(xpath="//input[@placeholder='User ID']")private WebElement userId; 
      @FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
      @FindBy(xpath="(//label[@class='su-radio-label'])[4]")private WebElement sms;
      @FindBy(xpath="(//label[@class='su-radio-label'])[2]")private WebElement forgotUserId;
      @FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement email;
      @FindBy(xpath="//input[@placeholder='Mobile number (as on account)']")private WebElement MobileNumber;
      public void EnteruserIdForForgotAccount(String user)
      {
    	  userId.sendKeys(user);
      }
      public void EnterPanNumber(String pannumber)
      {
    	  pan.sendKeys(pannumber);
      }
      public void ClickOnSms()
      {
    	  sms.click();
      }
      public void ClickOnForgotUserId()
      {
    	  forgotUserId.click();
      }
      public void EnterEmail(String mail)
      {
    	  email.sendKeys(mail);
      }
      public void EnterMobileNumber(String number)
      {
    	  MobileNumber.sendKeys(number);
      }
      
}
