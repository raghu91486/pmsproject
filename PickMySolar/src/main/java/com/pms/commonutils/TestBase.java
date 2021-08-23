package com.pms.commonutils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{

	public static WebDriver driver = null;
	
	public static Fileutility Flibrary= new Fileutility();
	 
    
    public static void initialize() throws IOException
    {
    	
       String browser = Flibrary.getPropertyKeyValue("BROWSER");
  	   String url = Flibrary.getPropertyKeyValue("URL");
    	if(driver==null)
    	{
    	  
    	   
    		if(browser.equalsIgnoreCase("chrome"))
    		{
    			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
    			driver = new ChromeDriver();
    		}
    		else if(browser.equalsIgnoreCase("firefox"))
    		{
    			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver");
    			driver = new ChromeDriver();
    		}
    	}
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get(url);
    }
	
	
	
}
