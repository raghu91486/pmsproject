package com.amazon.automation;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import com.pms.objectrepository.Paymentpage;
import com.pms.objectrepository.Watchpage;

@Listeners(com.pms.commonutils.ListenerImplemenation.class)
public class NegativeScenario2Test extends BaseClass
{

	@Test
	@Parameters({"SearchCategory","SearchType"})
	public void addsolarpanel(@Optional("")String SearchCategory,String SearchType) throws IOException, InterruptedException
	{
		 
		 Fileutility Flib = new Fileutility();
		 Electronicspage electronicspage = new Electronicspage(TestBase.driver);
		 Homepage homepage = new Homepage(TestBase.driver);
		 Paymentpage payment = new Paymentpage(TestBase.driver);
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
    	 delipage.getdelivaryButton().click();
    	 Thread.sleep(3000);
    	 payment.getupioption().click();
    	 //TestBase.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/div[2]/div[1]/form/div[1]/div/div/div[2]/div[4]/div/div/div/div/div[1]/div/label/input")).click();
    	 
    	 
    	 payment.getUPIfield().sendKeys(Flib.getPropertyKeyValue("UPIID") +Keys.ENTER);
 
    	 String Actual = "Please enter a valid UPI ID";
    	 String Expected = payment.getupierrormess().getText();
    	
    	 SoftAssert softassert = new SoftAssert();
         softassert.assertEquals(Actual, Expected);
         softassert.assertAll();
         System.out.println(Expected +"  ==== is the expected error message");
         System.out.println(Actual+"  ==== is the Actual error message"); 
         Thread.sleep(1000);
    	 Wlib.SwitchToTab(TestBase.driver, 0);
    	
      
	}
	
	
}
