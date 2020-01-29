package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class Home extends Base{
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		System.out.println("testing push to GitHub");
		
	}

	@Test(dataProvider = "getData")	
	public void BasePageNavigation(String uname, String Pwd) throws IOException
	{
	driver.get(getURL());
	LandingPage l = new LandingPage(driver);
	l.getLogin().click();
	
	LoginPage lp = new LoginPage(driver);
	lp.getEmail().sendKeys(uname);
	lp.getPassword().sendKeys(Pwd);
	lp.hitSubmit().click();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "test1";
		data[0][1] = "11";
		data[1][0] = "test2";
		data[1][1] = "12";
		data[2][0] = "test3";
	    data[2][1] = "13";
		return data;
		
}


}
