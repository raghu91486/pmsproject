package com.amazon.automation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pms.commonutils.BaseClass;
import com.pms.commonutils.TestBase;
import com.pms.objectrepository.Homepage;

@Listeners(com.pms.commonutils.ListenerImplemenation.class)
public class LogoutToAmazonTest extends BaseClass
{

	
	@Test
	public void logout() throws InterruptedException
	{
		 System.out.println("======Logout from Amazon application=====");
		 Homepage homepage = new Homepage(TestBase.driver);
         homepage.logoutToAmazon(TestBase.driver);
	}
	
	
}
