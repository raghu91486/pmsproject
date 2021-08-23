package com.pms.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pms.commonutils.TestBase;

public class Watchpage 
{

	
	public Watchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@aria-label='See more, Brand']")
	private WebElement expandbrand;
	
	
	@FindBy(xpath="//span[text()='Apple']")
	private WebElement Applebrand;
	
	
	@FindBy(xpath="//span[text()='New Apple Watch Series 6 (GPS + Cellular, 40mm) - Silver Stainless Steel Case with Silver Milanese Loop']")
	private WebElement AppleWatch;
	
   @FindBy(xpath="//input[@id='add-to-cart-button']")
   private WebElement Addcartbutton;
   
   @FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
   private WebElement CloseSideSheet;
   
   @FindBy(xpath="//a[@id='nav-cart']")
   private WebElement Carticon;
   
   @FindBy(xpath="(//span[contains(text(),'New Apple Watch Series 6 (GPS + Cellular, 40mm) - Silver Stainless Steel Case with Silver Milanese')])[1]/ancestor::span[1]")
   private WebElement Applewatchtext;
   
   @FindBy(xpath="//input[@value='Delete']")
   private WebElement DeleteItem;
 
	
	public WebElement getSeeMore()
    {
    	return expandbrand;	
    }
    
    public WebElement getAppleBrand()
    {
    	return Applebrand;	
    }
    
    public WebElement getapplewatch()
    {
    	return AppleWatch;	
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
	
    public WebElement getwatchtext()
    {
    	return Applewatchtext;
    }
    
    public WebElement getDelete()
    {
    	return DeleteItem;
    }
}
