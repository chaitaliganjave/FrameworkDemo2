package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	//Locators
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement linkMyAccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")	
	WebElement linkRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Login']") WebElement linkLogin;
	
	
	//Actions
	
	public void clickOnMyAccount() {
		linkMyAccount.click();
	}
	
	public void clickOnRegister() {
		linkRegister.click();
	}
	
	public void clickOnLogin() {
		linkLogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
