package testTools;

import org.openqa.selenium.WebDriver;

public class Wrapper implements Itools {
	
	private final Itools _tool;
	public Wrapper(WebDriver driver)
	{
		_tool=new Selenium(driver);
		}
	
	public void loadPage(String url) {
		_tool.loadPage(url);
		
	}
	public void clickElement(String xpath) {
		_tool.clickElement(xpath);
	}

}
