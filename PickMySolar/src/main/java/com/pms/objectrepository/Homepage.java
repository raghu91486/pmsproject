package com.pms.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pms.commonutils.TestBase;
import com.pms.commonutils.WebDriverUtils;

public class Homepage 
{

	//initialize the webElement by using pagefactory
		public Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	//decalre all the WebElements in private & provide public getters methods to provide read access to test scripts 
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement Emailtextbox;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Continuebutton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement passwordfield;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement Signinbutton;
    
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement Loginlink;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement Logoutlink;
	
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	private WebElement searchdropdown;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchSubmit;
	
	@FindBy(xpath="//div[@id='auth-error-message-box']//span[1]")
	private WebElement Errormessage;
	
	@FindBy(xpath="//div[@id='auth-error-message-box']//span[1]")
	private WebElement PasswordErrormessage;
	
	
	
	//utilization 
	public WebElement getEmailtextbox()
	{
		return Emailtextbox;
	}
	public WebElement clickcontinubutton()
	{
		return Continuebutton;
	}
	
	public WebElement getpasswordfield()
	{
		return passwordfield;
	}
	
    public WebElement clicksigninButton()
    {
    	return Signinbutton;
    }
    
    public WebElement Loginlink()
    {
    	return Loginlink;
    }
    
    public WebElement Logoutlink()
    {
    	return Logoutlink;
    }
   
    public WebElement clickSearchDropDown()
    {
    	return searchdropdown;
    }
   
    public WebElement clicksearchbox()
	{
		return searchbox;
	}
	
    public WebElement clickSearchSubmitButton()
    {
    	return searchSubmit;
    }
    
    public WebElement getTextofErrormessage()
    {
    	return Errormessage;
    }
    
    public WebElement getTextofPasswordErrormessage()
    {
    	return PasswordErrormessage;
    }
    
   
    
    public void loginToAmazon(String emailname,String password)
    {
    	Loginlink.click();
    	Emailtextbox.sendKeys(emailname);
    	Continuebutton.click();
    	passwordfield.sendKeys(password);
    	Signinbutton.click();
    }
	
    public void logoutToAmazon(WebDriver driver) throws InterruptedException
    {
    	   WebDriverUtils WebLib = new WebDriverUtils();
    	   System.out.println("======logout from amazon=====");
		   WebLib.moveMouseToElemnet(driver, Loginlink);
		   //Thread.sleep(500);
		   Logoutlink().click();

    }
	
    
    
}
