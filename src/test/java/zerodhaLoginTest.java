import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSignUpPage;
import pom.zerodhaForgotUserIdPage;
import utility.Parameterization;
import utility.screenShot;

public class zerodhaLoginTest 
{
  WebDriver driver;
  @BeforeMethod
  public void Browseropen()
  {
	  driver=LaunchBrowser.openBrowser();
  }
    @Test(priority=0)
    public void LoginwithcorrectCredentials() throws EncryptedDocumentException, IOException, InterruptedException
    {
	  ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
      zerodhaloginpage.EnterUserId(Parameterization.getData("credentials", 0, 1));
      zerodhaloginpage.EnterPassword(Parameterization.getData("credentials", 1, 1));
      zerodhaloginpage.ClickOnLogIn();
      zerodhaloginpage.Enterpin(driver,Parameterization.getData("credentials", 2, 1));
      zerodhaloginpage.ClickOnContinue();
	   
  }
  @Test(priority=1)
  public void SignUpForNewUser() throws InterruptedException
  {
	  ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
	  zerodhaloginpage.ClickOnSignUp();
	  zerodhaloginpage.SwitchToSignupPage(driver);
	  Thread.sleep(2000);
	  ZerodhaSignUpPage zerodhasignuppage=new ZerodhaSignUpPage(driver);
	  zerodhasignuppage.ClickOnAbout();
  }
  @Test(priority=2)
  public void ForgotId()
  {
	  ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
	  zerodhaloginpage.ClickOnForgotDetails();
	  zerodhaForgotUserIdPage zerodhaforgotuserid=new zerodhaForgotUserIdPage(driver);
	  //zerodhaforgotuserid.EnterEmail("abc@mail.com");
	  zerodhaforgotuserid.ClickOnSms();
	  zerodhaforgotuserid.ClickOnForgotUserId();
	  zerodhaforgotuserid.EnterMobileNumber("1234567890");
  }
}
