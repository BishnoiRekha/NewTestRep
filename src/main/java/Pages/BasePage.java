package Pages;

import org.openqa.selenium.WebDriver;

import testTools.Wrapper;

public class BasePage {
	public final Wrapper  wrapper;
	public BasePage(WebDriver driver)
	{
		wrapper=new Wrapper(driver);
	}
	
}
