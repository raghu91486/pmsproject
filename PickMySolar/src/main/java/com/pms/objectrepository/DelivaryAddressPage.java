package com.pms.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pms.commonutils.TestBase;

public class DelivaryAddressPage 
{

	
	public DelivaryAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
   @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
   private WebElement Fullname;
   
   
  
   
   
   @FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
   private WebElement ProceedtoBuy;
   
   @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
   private WebElement MobileNumber;
	
 
   @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
   private WebElement Pincode;

   @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
   private WebElement HouseNumber;
   
   @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
   private WebElement AreaStreet;
   
   @FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
   private WebElement Landmark;
 
   @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
   private WebElement Town;
 
   @FindBy(xpath="//span[text()='Choose a state']")
   private WebElement ChooseState;
 
   @FindBy(xpath="//span[text()='Use this address']")
   private WebElement adressbutton;
 
   @FindBy(xpath="//a[text()='KARNATAKA']")
   private WebElement Karnataka;
   
   @FindBy(xpath="(//div[text()='Please enter a valid ZIP or postal code.'])[1]")
   private WebElement InvalidpincodeError;
   
   @FindBy(xpath="//a[contains(text(),'Deliver to this address')]")
   private WebElement delivarytoAddress;
   
 
  
    public WebElement getFullNameField()
    {
    	return Fullname;
    }
    
    public WebElement getMobilenumField()
    {
    	return MobileNumber;
    }
    
    public WebElement getPincodenumField()
    {
    	return Pincode;
    }
    
    public WebElement getHousenumField()
    {
    	return HouseNumber;
    }
    
    public WebElement getAreastreet()
    {
    	return AreaStreet;
    }
    
    public WebElement getLandmark()
    {
    	return Landmark;
    }
    
    public WebElement getTown()
    {
    	return Town;
    }
    
    public WebElement getState()
    {
    	return ChooseState;
    }
       
    public WebElement getkarnataka()
    {
    	return Karnataka;
    }
    
    public WebElement getadressbutton()
    {
    	return adressbutton;
    }
    
    public WebElement getInvalidpincodeError()
    {
    	return InvalidpincodeError;
    }
    
    public WebElement getdelivaryButton()
    {
    	return delivarytoAddress;
    }
    
    
}
