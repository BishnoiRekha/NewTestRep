package Pages;

import org.openqa.selenium.WebDriver;

import testTools.Wrapper;

public class BbPage extends BasePage{
	public BbPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void click_personalLoan()
	{
		wrapper.clickElement("//a[@title='Personal Loan']");
	}
	public void click_customQuote()
	{
		wrapper.clickElement("//a[@title='Custom quote']");
	}

}
