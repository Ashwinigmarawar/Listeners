import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.ZerodhaLoginPage;
import pom.waitPractice;
import utility.Parameterization;

public class waitTest 
{
  WebDriver driver;
  
  @BeforeMethod
  public void openBrowser()
  {
	  driver=pojo.wait.openBrowser();
  }
  @Test
  public void LoginwithcorrectCredentials() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  waitPractice waitpractice=new waitPractice(driver);
      //String id=Parameterization.getData("credentials", 0, 1);
	  waitpractice.EnterUserId(Parameterization.getData("credentials", 0, 1),driver);
	  //String pass=Parameterization.getData("credentials", 1, 1);
	  waitpractice.EnterPassword(Parameterization.getData("credentials", 1, 1));
}}
