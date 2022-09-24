package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage 
{
     public ZerodhaSignUpPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(xpath="(//a[text()='About'])[1]")private WebElement about;
     @FindBy(xpath="(//a[text()='Signup'])[1]")private WebElement Insignup;
     @FindBy(xpath="(//a[text()='Products'])[1]")private WebElement products;
     @FindBy(xpath="(//a[text()='Pricing'])[1]")private WebElement pricing;
     @FindBy(xpath="(//a[text()='Support'])[1]")private WebElement support;
     @FindBy(xpath="//div[@id='menu_btn']")private WebElement menubutton;
     @FindBy(xpath="//input[@id='user_mobile']")private WebElement usermobileno;
     public void ClickOnAbout()
     {
    	 about.click();
     }
     public void ClickOnIsignup()
     {
    	 Insignup.click();
     }
     public void ClickOnproducts()
     {
    	 products.click();
     }
     public void ClickOnpricing()
     {
    	 pricing.click();
     }
     public void ClickOnsupport()
     {
    	 support.click();
     }
     public void ClickOntogglemenu()
     {
    	 usermobileno.click();
     }
}
