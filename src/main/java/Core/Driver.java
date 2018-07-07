package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	protected static InheritableThreadLocal<WebDriver> driver=new InheritableThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		if(driver.get()==null)
		{  System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			driver.set(dr);
			System.out.print("in get driver");
		}
		return driver.get();
	}

}
