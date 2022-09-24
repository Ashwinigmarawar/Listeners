import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pojo.LaunchBrowser;
import pom.ZerodhaLoginPage;
import pom.zerodhaHomePage;
import utility.Parameterization;

public class zerodhaHomeTest 
{
WebDriver driver;
@BeforeMethod
public void LaunchbrowserandEnterCredentials() throws EncryptedDocumentException, IOException, InterruptedException
{
	driver=LaunchBrowser.openBrowser();
	ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
	zerodhaloginpage.EnterUserId(Parameterization.getData("credentials", 0, 1));
	zerodhaloginpage.EnterPassword(Parameterization.getData("credentials", 1, 1));
    zerodhaloginpage.ClickOnLogIn();
    zerodhaloginpage.Enterpin(driver, Parameterization.getData("credentials", 2, 1));
    zerodhaloginpage.ClickOnContinue();
    Thread.sleep(3000);
}
 @Test
 public void SearchShareAndClickOnBuy()
 {
	    zerodhaHomePage zerodhahomepage=new zerodhaHomePage(driver);
	    zerodhahomepage.tosearchshare();
	    zerodhahomepage.MoveToShare(driver);
	    zerodhahomepage.ClickOnsharebuy();
 }
 @Test
 public void deleteFromWatchList() throws InterruptedException
 {
	 zerodhaHomePage zerodhahomepage=new zerodhaHomePage(driver);
	
	 
	 zerodhahomepage.FindWatchListElement(driver);
	 //Thread.sleep(2000);
	 zerodhahomepage.deleteFromWatchList();
 }


}
