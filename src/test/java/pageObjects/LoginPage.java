package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
		
		By txtEmail = By.xpath("//*[@id='Email']");
		By txtPswd = By.xpath("//*[@id='Password']");
		By chkBoxRemMe = By.xpath("//*[@id='RememberMe']");
		By btnLogin = By.xpath("//input[@type='submit']");
		
		public WebElement enterEmail() {
		return driver.findElement(txtEmail);
			
		}
		
		
		public WebElement enterPswd() {
		return driver.findElement(txtPswd);
				
			}
		
		public WebElement clickChkBox() {
			return driver.findElement(chkBoxRemMe);
				
			}
		
		public WebElement clickLoginBtn() {
			return driver.findElement(btnLogin);
				
			}
	}

