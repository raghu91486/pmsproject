package com.amazon.automation;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pms.commonutils.BaseClass;
import com.pms.commonutils.TestBase;
import com.pms.objectrepository.Homepage;

@Listeners(com.pms.commonutils.ListenerImplemenation.class)
public class NegativeScenario4Test extends BaseClass
{
	@Test
	@Parameters({"Emailname","Password"})
	public void adhoc2(@Optional("")String Emailname,String Password) throws IOException, InterruptedException
	{
		 try {
			 Homepage homepage = new Homepage(TestBase.driver);
			 homepage.Loginlink().click();
			 homepage.getEmailtextbox().sendKeys(Emailname);
			 homepage.clickcontinubutton().click();
			 homepage.getpasswordfield().sendKeys(Password);
			 homepage.clicksigninButton().click();
			 if(homepage.getTextofPasswordErrormessage().isDisplayed())
			 {
				 String Expected = homepage.getTextofPasswordErrormessage().getText();
				 System.out.println(Expected + "  this is the expected error message");
				 SoftAssert softassert = new SoftAssert();
				 
				 softassert.assertEquals("We cannot find an account with that mobile number", Expected);
				 System.out.println("We cannot find an account with that mobile number  ==== this is the actual message");
				 softassert.assertAll(); 
			 }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
