package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage 
{
public WebDriver driver;

public LandingPage(WebDriver driver)
{
	this.driver=driver;
}

	By Login = By.xpath("//a[contains(@href,'sign_in')]");
	By Title = By.xpath("//div[@class = 'text-center']");
	//htmltag[@id='test']//td[text()='test']
	By NavBar = By.xpath("//nav[@class = 'navbar-collapse collapse']//ul[@class = 'nav navbar-nav navbar-right']");
	
public WebElement getLogin()
{
	return driver.findElement(Login);
}

public WebElement getTitle()
{
	return driver.findElement(Title);
}

public WebElement getNavBar()
{
	return driver.findElement(NavBar);
}

}
	 