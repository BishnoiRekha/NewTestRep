package LearnAutomation.AutomationTest;


import org.testng.annotations.Test;

import Pages.Page;



public class MyTest {
  

@Test
  public void firstCase() {
	  Page.CommonPage().loadPage("https://www.bankbazaar.com");
	  Page.BbPage().click_personalLoan();
	  Page.BbPage().click_customQuote();
  }

@Test
public void secondCase() {
	  Page.CommonPage().loadPage("https://www.bankbazaar.com");
	  Page.BbPage().click_personalLoan();
	  Page.BbPage().click_customQuote();
}
}
