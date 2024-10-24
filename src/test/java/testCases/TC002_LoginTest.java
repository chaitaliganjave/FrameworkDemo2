package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjets.HomePage;
import pageObjets.LoginPage;
import pageObjets.MyAccountPage;
import testBase.BaseTestClass;

public class TC002_LoginTest extends BaseTestClass {

	@Test
	
	public void verify_LoginDetails() {
	
		try {
	
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickOnLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickOnLogin();
		
		MyAccountPage myacc= new MyAccountPage(driver);
	boolean status=	myacc.checkMyAccountIsDisplayed();
	
	Assert.assertTrue(status);
		}
	catch(Exception e)
		{
		Assert.fail();
		}
	
	}
	
}
