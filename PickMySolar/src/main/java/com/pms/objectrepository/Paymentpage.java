package com.pms.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pms.commonutils.TestBase;

public class Paymentpage 
{

	
	public Paymentpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
   @FindBy(xpath="/html/body/div[5]/div/div[2]/div[2]/div/div[2]/div[1]/form/div[1]/div/div/div[2]/div[4]/div/div/div/div/div[1]/div/label/input")
   private WebElement upi;
   
   @FindBy(xpath="(//div[@class='a-section a-spacing-none pmts-inline-field-block']/input[1])[1]")
   private WebElement UPIidField;
   
   @FindBy(xpath="//span[text()='Verify']")
   private WebElement UPIverify;
   
   @FindBy(xpath="//span[text()='Verify']/ancestor::div[2]/following-sibling::div[3]/div/div[1]")
   private WebElement invalidUPIerrormess;
   
 
   
  
   
   
  
   
 
  
    public WebElement getupioption()
    {
    	return upi;
    }
    
    public WebElement getUPIfield()
    {
    	return UPIidField;
    }
    
    public WebElement getVerifyButton()
    {
    	return UPIverify;
    }
    
    public WebElement getupierrormess()
    {
    	return invalidUPIerrormess;
    }
    
  
    
    
}
