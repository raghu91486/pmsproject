package com.pms.commonutils;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils 
{
	
	
/**
	This generic method use to perfom the moushover action 
	**/
	public void moveMouseToElemnet(WebDriver driver ,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	
	/**
	This generic method use to handle the dropdown 
	**/
	public void handledrown(WebElement element,String text)
	{
		Select se = new Select(element);
		se.selectByVisibleText(text);
	}
	
	/**
	This generic method use to perfom the Scrolldown to specific Webelement action 
	**/
	public void scrolldowntoElement(WebDriver driver,WebElement element)
	{
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	/**
	This generic method use to Switch from one tab to another tab
	**/
	public void SwitchToTab(WebDriver driver,int index)
	{
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(index));	
	}
	

	
	
}
