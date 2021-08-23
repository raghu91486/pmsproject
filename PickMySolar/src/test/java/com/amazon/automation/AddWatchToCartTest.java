package com.amazon.automation;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;
import com.pms.commonutils.BaseClass;
import com.pms.commonutils.Fileutility;
import com.pms.commonutils.TestBase;
import com.pms.commonutils.WebDriverUtils;
import com.pms.objectrepository.Homepage;
import com.pms.objectrepository.Watchpage;



@Listeners(com.pms.commonutils.ListenerImplemenation.class)
public class AddWatchToCartTest extends BaseClass
{
	
	public Fileutility Flibrary= new Fileutility();
	
     @Test
	public void add() throws InterruptedException, IOException
	{
    	 try {
    		 Homepage homepage = new Homepage(TestBase.driver);
        	 Watchpage watchpage = new Watchpage(TestBase.driver);
        	 WebDriverUtils Wlib= new WebDriverUtils();
        	 homepage.clickSearchDropDown().sendKeys(Flibrary.getPropertyKeyValue("SEARCHCATEGORY"));
        	 homepage.clicksearchbox().sendKeys(Flibrary.getPropertyKeyValue("SEARCHTYPE"));
        	 homepage.clickSearchSubmitButton().click();
        	 Wlib.scrolldowntoElement(TestBase.driver, watchpage.getSeeMore());
        	 watchpage.getSeeMore().click();
        	 watchpage.getAppleBrand().click();
        	 Wlib.scrolldowntoElement(TestBase.driver, watchpage.getapplewatch());
        	 watchpage.getapplewatch().click();
        	 Wlib.SwitchToTab(TestBase.driver, 1);
        	 watchpage.getAddcartbutton().click();
        	 System.out.println("The Watch added to the Cart "+"\n");
        	 Thread.sleep(1000);
        	 TestBase.driver.navigate().refresh();
        	 watchpage.getMainCartIcon().click();

        	 //verifying the same watch with same amount added to cart 
        	 
        	 SoftAssert sf = new SoftAssert();
        	 String actual = Flibrary.getPropertyKeyValue("ACTUALAPPLETEXT");
        	 String expected = watchpage.getwatchtext().getText();
        	 System.out.println("\n"+expected +"   ====== verified that added watch is in the Cart"+"\n");
        	 sf.assertEquals(actual, expected);
        	 
        	 watchpage.getDelete().click();
        	 System.out.println("\n"+expected +"   ====== The watch deleted in cart"+"\n");

        	 sf.assertAll();
        	 
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
	}
}
