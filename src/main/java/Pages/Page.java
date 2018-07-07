package Pages;

import org.openqa.selenium.support.PageFactory;

import Core.Driver;

public class Page {
	
	public static CommonPage CommonPage() {
		System.out.print("in pages");
		return PageFactory.initElements(Driver.getDriver(),CommonPage.class);
		
	}
	public static BbPage BbPage() {
		System.out.print("in pages");
		return PageFactory.initElements(Driver.getDriver(),BbPage.class);
		
	}

}
