package testCases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;

public class BaseClass {

	ReadConfig rconf = new ReadConfig();
	public String baseURL = rconf.getApplicationURL();
	public String userName = rconf.getUserName();
	public String password = rconf.getPassword();
	public String email = rconf.getEmail();
	public String companyName = rconf.getCompanyName();
	public String ipAddress = rconf.getIpAddress();
	public String fName = rconf.getFirstName();
	public String lName = rconf.getLastName();
	public String DOB = rconf.getDateOfBirth();
	public String role = rconf.getCustomerRole();
	public static WebDriver driver;

	public static Logger logger;

	@SuppressWarnings("deprecation")
	@BeforeClass
	@Parameters("browser")
	public void openURL(String browser) {

		logger = Logger.getLogger("nopCommerce");
		PropertyConfigurator.configure("Log4j.properties");

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", rconf.getChromePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", rconf.getFirefoxPath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		} else if (browser.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", rconf.getIEPath());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		}
		
	}

	
	public static String randomstring() {
	String generatedString = RandomStringUtils.randomAlphabetic(5);
	return(generatedString);
	
	}
		

	/*public static String randomstring1() {
	String generatedString1 = RandomStringUtils.randomNumeric(8);
	return(generatedString1);
	
	}
	
	
	 @AfterClass public void tearDown() {
	 
	 driver.quit(); }*/	 

}
