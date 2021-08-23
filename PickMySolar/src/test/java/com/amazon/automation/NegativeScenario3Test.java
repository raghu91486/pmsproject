package com.amazon.automation;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pms.commonutils.BaseClass;
import com.pms.commonutils.TestBase;
import com.pms.objectrepository.Homepage;

@Listeners(com.pms.commonutils.ListenerImplemenation.class)
public class NegativeScenario3Test extends BaseClass
{

	@Test
	@Parameters({"Emailname","Password"})
	public void adhoc1(@Optional("")String Emailname,String Password) throws IOException, InterruptedException
	{
		try {
			
			 Homepage homepage = new Homepage(TestBase.driver);
				
				homepage.Loginlink().click();
				 homepage.getEmailtextbox().sendKeys(Emailname);
				 homepage.clickcontinubutton().click();
				 if(homepage.getTextofErrormessage().isDisplayed())
				 {
					 String Expected = homepage.getTextofErrormessage().getText();
					 System.out.println(Expected + "  this is the expected Error message");
					 SoftAssert softassert = new SoftAssert();
					 softassert.assertEquals("We cannot find an account with that mobile 888number", Expected);
					 System.out.println("We cannot find an account with that mobile number  == this is actual message");
					 softassert.assertAll();
				 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
