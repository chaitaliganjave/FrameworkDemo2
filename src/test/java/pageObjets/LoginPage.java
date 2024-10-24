package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BaseClass{

	//Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Locators
	@FindBy(id = "input-email")
	WebElement txt_Login;
	
	@FindBy(id = "input-password")
	WebElement txt_Password;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement btn_Login;
	
	
	//Actions
	public void setEmail(String email) {
		txt_Login.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txt_Password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btn_Login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
