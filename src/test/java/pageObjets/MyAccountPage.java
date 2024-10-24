package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BaseClass {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement myAccount;
	
	public boolean checkMyAccountIsDisplayed() {
	try {
	return	(myAccount.isDisplayed());
	}
	catch(Exception e) {
		return false;
	}
}
	
	
	
	
	
	
	
	
	
}
