package Pages;

import org.openqa.selenium.WebDriver;

import testTools.Selenium;
import testTools.Wrapper;


public class CommonPage extends BasePage{
	public CommonPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void loadPage(String url)
	{
		wrapper.loadPage(url);
	}

}
