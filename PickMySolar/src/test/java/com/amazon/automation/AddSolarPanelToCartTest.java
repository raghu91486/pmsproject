package com.amazon.automation;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pms.commonutils.BaseClass;
import com.pms.commonutils.Fileutility;
import com.pms.commonutils.TestBase;
import com.pms.commonutils.WebDriverUtils;
import com.pms.objectrepository.Electronicspage;
import com.pms.objectrepository.Homepage;
import com.pms.objectrepository.Watchpage;


@Listeners(com.pms.commonutils.ListenerImplemenation.class)
public class AddSolarPanelToCartTest extends BaseClass
{

	@Test
	@Parameters({"SearchCategory","SearchType"})
	public void addsolarpanel(@Optional("")String SearchCategory,String SearchType) throws IOException, InterruptedException
	{
		
   	     WebDriverUtils Wlib= new WebDriverUtils();

		 Electronicspage electronicspage = new Electronicspage(TestBase.driver);
		 Homepage homepage = new Homepage(TestBase.driver);
    	 try {
    		 homepage.clickSearchDropDown().sendKeys(SearchCategory);
        	 homepage.clicksearchbox().sendKeys(SearchType);
        	 homepage.clickSearchSubmitButton().click();
        	 electronicspage.getSolarBrand().click();
        	 electronicspage.getsolarpanel().click();
        	 Wlib.SwitchToTab(TestBase.driver, 1);
        	 electronicspage.getAddcartbutton().click();
        	 System.out.println("");
        	 electronicspage.getMainCartIcon().click();
        	 Thread.sleep(1000);
        	 //verify the solar panel Added to cart 
        	 SoftAssert sf = new SoftAssert();
        	 String actual = Flibrary.getPropertyKeyValue("ACTUALPANELTEXT");
        	 String expected = electronicspage.getsolarpanelText().getText();
        	 System.out.println("\n"+expected +"   ====== verified that added Solar panel is in the Cart"+"\n");
        	 sf.assertEquals(actual, expected);
        	 electronicspage.getdelete().click();
        	 System.out.println("\n"+expected +"   ====== The Solar panel deleted in cart"+"\n");
        	 sf.assertAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
