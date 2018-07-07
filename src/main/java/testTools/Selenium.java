package testTools;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selenium implements Itools{
	WebDriver driver = null;
	public Selenium(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loadPage(String url) {
		driver.navigate().to(url);
		
	}
	public void clickElement(String xpath) {
		WebElement element=driver.findElement(By.xpath(xpath));
		element.click();
		
	}
	public void enterValue(String xpath,String value) {
		WebElement element=driver.findElement(By.xpath(xpath));
		element.sendKeys(value);
		
	}
	public void selectValue(String xpath,String value) {
		WebElement element=driver.findElement(By.xpath(xpath));
		Select dropDown=new Select(element);
		dropDown.selectByValue(value);
		
	}
	public void waitForPageLoadToComplete()
	{	try
		{
			if(driver.getWindowHandles().size()==1)
				switchToWindow();
		}
		catch(TimeoutException e)
		{
			System.out.print("timeout exception in wait for page load");
		}
			
	}
	public void switchToWindow() {
		for (String windowHandle:driver.getWindowHandles())
		if(!windowHandle.equals(driver.getWindowHandle()))
		driver.switchTo().window(windowHandle);
	}
}
