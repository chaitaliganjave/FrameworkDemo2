package pageObjets;

import java.security.KeyStore.TrustedCertificateEntry;
import java.time.Duration;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BaseClass {
	//Constructor
	public  AccountRegistrationPage(WebDriver driver) {
		super(driver);
		}
	
	//Locators
	@FindBy(id = "input-firstname") WebElement txt_FirstName;
	
	@FindBy( id = "input-lastname") WebElement txt_LastName;
	
	@FindBy(id = "input-email") WebElement txt_Email;
	
	@FindBy(id= "input-telephone") WebElement txt_TelePhone;
	
	@FindBy(id = "input-password") WebElement txt_Password;
	
	@FindBy(id = "input-confirm") WebElement txt_PasswordConfirm;
	
	@FindBy(xpath = "//input[@name='agree']") WebElement radiobtn_PolicyConfirm;
	
	@FindBy(xpath = "//input[@value='Continue']") WebElement btn_Continue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']") WebElement msg_confirmation;
	//Actions
	
	public void setFirstname(String firstname) {
		txt_FirstName.sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		txt_LastName.sendKeys(lastname);
	}
	
	public void setEmail(String email) {
		txt_Email.sendKeys(email);
	}
	
	public void setTelePhone(String telephone) {
		txt_TelePhone.sendKeys(telephone);
	}
	
	public void setPassword(String password) {
		txt_Password.sendKeys(password);
	}
	
	public void setConfirmpassword(String password) {
		txt_PasswordConfirm.sendKeys(password);
	}
	
	public void setPolicy() {
		radiobtn_PolicyConfirm.click();
	}
	
	public void clickContinue() {
		//sol 1
		btn_Continue.click();
		
		/*
		  //sol 2 btn_Continue.submit();
		  
		  //sol 3 btn_Continue.sendKeys(Keys.RETURN);
		  
		  //sol 4 Actions a1= new Actions(driver);
		  a1.moveToElement(btn_Continue).click().perform();
		  
		  //sol 5 WebDriverWait mywait = new WebDriverWait(driver,
		  Duration.ofSeconds(10));
		  mywait.until(ExpectedConditions.elementToBeClickable(btn_Continue));
		  
		 */
	}
	
	public String checkConfiramation() {
		try{
			return(msg_confirmation.getText());
			}
		catch(Exception e) {
			return(e.getMessage());
			}
	}





}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

