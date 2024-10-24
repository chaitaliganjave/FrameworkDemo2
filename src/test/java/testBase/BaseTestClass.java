package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTestClass {

	public WebDriver driver;
	public Properties p;
	
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setUp(String os, String br) throws IOException {
		
	
		FileReader file = new FileReader("./src//test//resources/config.properties");
		p = new Properties();
		p.load(file);
		
		
		
		
		switch (br.toLowerCase()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox" :
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Browser");
			return;
		}
		
		
		// driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.get("https://tutorialsninja.com/demo/");
		//loading url from config.properties file
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

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
		return (generatedNumber + "@" + generatedString);

	}

}
