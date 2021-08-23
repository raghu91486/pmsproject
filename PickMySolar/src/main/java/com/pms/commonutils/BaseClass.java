package com.pms.commonutils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pms.objectrepository.Homepage;



public class BaseClass 

{
  public Fileutility Flibrary= new Fileutility();
  public WebDriverUtils WebLib = new WebDriverUtils();	
  
  //public static WebDriver driver;
	
		@BeforeSuite
		public void ConfigBeforeClass() throws IOException
		{
			TestBase.initialize();
		}

	   
	   @AfterSuite
	   public void configAfterClass()
	   {
		    System.out.println("=========close the browser==============");
			TestBase.driver.quit();  
	   }
	   
	 
	}
	
	


