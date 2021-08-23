package com.pms.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pms.commonutils.TestBase;

public class Electronicspage 
{

	
	public Electronicspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@aria-label='See more, Brand']")
	private WebElement expandbrand;
	
	
	@FindBy(xpath="//span[text()='Luminous']")
	private WebElement Luminousbrand;
	
	
	@FindBy(xpath="(//span[text()='Luminous BIS Certified Mono PERC 380 Watt Solar Panel'])[1]")
	private WebElement LuminousPanel;
	
   @FindBy(xpath="//input[@id='add-to-cart-button']")
   private WebElement Addcartbutton;
   
   @FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
   private WebElement CloseSideSheet;
   
   @FindBy(xpath="//a[@id='nav-cart']")
   private WebElement Carticon;

   @FindBy(xpath="(//span[text()='Luminous BIS Certified Mono PERC 380 Watt Solar Panel'])[1]/ancestor::span[1]")
   private WebElement SolarpanelText;
  
   @FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
   private WebElement ProceedtoBuy;
	
   @FindBy(xpath="//input[@value='Delete']")
   private WebElement DeleteItem;
   
	public WebElement getSeeMore()
    {
    	return expandbrand;	
    }
    
    public WebElement getSolarBrand()
    {
    	return Luminousbrand;	
    }
    
    public WebElement getsolarpanel()
    {
    	return LuminousPanel;	
    }
	
    public WebElement getAddcartbutton()
    {
    	return Addcartbutton;
    }
	
    public WebElement getsidesheet()
    {
    	return CloseSideSheet;
    }
    
    public WebElement getMainCartIcon()
    {
    	return Carticon;
    }
	
    public WebElement getproceedToBuyButton()
    {
    	return ProceedtoBuy;
    }
    
    public WebElement getsolarpanelText()
    {
    	return SolarpanelText;
    }
    
    
    public WebElement getdelete()
    {
    	return DeleteItem;
    }
    
}
