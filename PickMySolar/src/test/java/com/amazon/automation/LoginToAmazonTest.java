package com.amazon.automation;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pms.commonutils.BaseClass;
import com.pms.commonutils.TestBase;
import com.pms.objectrepository.Homepage;

@Listeners(com.pms.commonutils.ListenerImplemenation.class)
public class LoginToAmazonTest extends BaseClass
{

	@Test
	@Parameters({"Emailname","Password"})
	public void login(@Optional("")String Emailname,String Password) throws IOException
	{
		try {
			 Homepage homepage = new Homepage(TestBase.driver);
			 homepage.loginToAmazon(Emailname,Password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
