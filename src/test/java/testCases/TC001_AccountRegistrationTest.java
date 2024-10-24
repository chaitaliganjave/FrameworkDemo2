package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjets.AccountRegistrationPage;
import pageObjets.HomePage;
import testBase.BaseTestClass;

public class TC001_AccountRegistrationTest extends BaseTestClass{

/* This should be the part of BaseTestclass
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
*/	
	@Test
	public void verify_account_registration() {
		
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickOnRegister();
		
		AccountRegistrationPage ac = new AccountRegistrationPage(driver);
		ac.setFirstname(randomString().toUpperCase());
		ac.setLastName(randomString().toUpperCase());
		ac.setEmail(randomString()+"@gmail.com");
		ac.setTelePhone(randomNumber());
		
		
		String pwd= randomAlphaNumeric();
		ac.setPassword(pwd);
		ac.setConfirmpassword(pwd);
		ac.setPolicy();
		ac.clickContinue();
		String confiramationmsg= ac.checkConfiramation();
		
		Assert.assertEquals(confiramationmsg, "Your Account Has Been Created!");
		
	}
	
/* this should be the part of BaseTestclass	
  

	public String randomString() {
		String generatedString = new RandomStringUtils().randomAlphabetic(7);
		return generatedString;
		
	}
	
	public String randomNumber() {
		String generatedNumber = new RandomStringUtils().randomAlphanumeric(10);
		return generatedNumber;
		
	}
	
	public String randomAlphaNumeric() {
		String generatedNumber = new RandomStringUtils().randomAlphanumeric(3);
		String generatedString = new RandomStringUtils().randomAlphabetic(5);
		return (generatedNumber+"@"+generatedString);
		
	}
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
