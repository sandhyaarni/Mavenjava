package test;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateLandingPageTitle extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest	
	public void initialize() throws IOException
	{
	driver = initializeDriver();
	log.info("driver is initialized");
	driver.get(getURL());
	log.info("navigated to homepage");
	}

	@Test	
	public void BasePageNavigation() throws IOException
	{
		
	LandingPage l = new LandingPage(driver);
	System.out.println(l.getTitle().getText());
	Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	log.info("Successfully validated title text");
	
	Assert.assertTrue(l.getNavBar().isDisplayed());
	System.out.println("Passed");
	
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
}
