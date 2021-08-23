package com.amazon.automation;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pms.commonutils.BaseClass;
import com.pms.commonutils.Fileutility;
import com.pms.commonutils.TestBase;
import com.pms.commonutils.WebDriverUtils;
import com.pms.objectrepository.DelivaryAddressPage;
import com.pms.objectrepository.Electronicspage;
import com.pms.objectrepository.Homepage;
import com.pms.objectrepository.Watchpage;

@Listeners(com.pms.commonutils.ListenerImplemenation.class)
public class NegativeScenario1Test extends BaseClass
{

	@Test
	@Parameters({"SearchCategory","SearchType"})
	public void addsolarpanel(@Optional("")String SearchCategory,String SearchType) throws IOException, InterruptedException
	{
		 
		try {
			 Fileutility Flib = new Fileutility();
			 Electronicspage electronicspage = new Electronicspage(TestBase.driver);
			 Homepage homepage = new Homepage(TestBase.driver);
			 WebDriverUtils Wlib= new WebDriverUtils();
			 DelivaryAddressPage delipage= new DelivaryAddressPage(TestBase.driver);
	    	 homepage.clickSearchDropDown().sendKeys(SearchCategory);
	    	 homepage.clicksearchbox().sendKeys(SearchType);
	    	 homepage.clickSearchSubmitButton().click();
	    	 electronicspage.getSolarBrand().click();
	   	     electronicspage.getsolarpanel().click();
	    	 Wlib.SwitchToTab(TestBase.driver, 1);
	    	 electronicspage.getAddcartbutton().click();
	    	 electronicspage.getproceedToBuyButton().click();
	    	 delipage.getFullNameField().sendKeys(Flib.getPropertyKeyValue("FIRSRNAME"));
	    	 delipage.getMobilenumField().sendKeys(Flib.getPropertyKeyValue("MOBILENUM"));
	         delipage.getPincodenumField().sendKeys(Flib.getPropertyKeyValue("PINCODE"));
	    	 delipage.getHousenumField().sendKeys(Flib.getPropertyKeyValue("FLATNUM"));
	         delipage.getAreastreet().sendKeys(Flib.getPropertyKeyValue("AREA"));
	         delipage.getLandmark().sendKeys(Flib.getPropertyKeyValue("LANDMARK"));
	         
	         delipage.getState().click();
	         delipage.getTown().sendKeys(Flib.getPropertyKeyValue("TOWN"));
	         delipage.getkarnataka().click();
	         Actions mouseActions = new Actions(TestBase.driver);
	         mouseActions.moveToElement(delipage.getadressbutton()).click().build().perform();
	         Thread.sleep(1000);
	         
	    	 if(Flib.getPropertyKeyValue("INVALIDPINCODE")!=null && Flib.getPropertyKeyValue("INVALIDPINCODE").equalsIgnoreCase("true"))
	    	 {
	    		 String expectedtext = delipage.getInvalidpincodeError().getText();
	             String Actual = "Please enter a valid ZIP or postal code.";
	             SoftAssert softassert = new SoftAssert();
	             softassert.assertEquals(Actual, expectedtext);
	             softassert.assertAll();
	             System.out.println(expectedtext +"  ==== is the expected error message");
	             System.out.println(Actual+"  ==== is the Actual error message"); 
	    	 }
	    	 Wlib.SwitchToTab(TestBase.driver, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
      
	}
	
	
}
