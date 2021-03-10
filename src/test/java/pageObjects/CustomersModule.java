package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CustomersModule {
	
	WebDriver driver;
	
	public CustomersModule(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	
	By lnkCustomers = By.xpath("//span[contains(.,'Customers')]");
	
	By lnkCustomersItems = By.xpath("//li[4]/ul/li/a/span");
	
	By btnAddNew = By.xpath("//form/div/div/a");
	 
	By lnkCustomerInfo = By.xpath("//*[@id='customer-info']/div[1]/i");
	
	By txtEmail = By.id("Email");
	
	By txtPswd = By.id("Password");
	
	By txtFName = By.id("FirstName");
	
	By txtLName = By.id("LastName");
	
	By rdBtnMGender = By.id("Gender_Male");
	
	By rdBtnFGender = By.id("Gender_Female");
	
	By txtDOB = By.id("DateOfBirth");
	
	By txtCompanyName = By.id("Company");	
	
	By selectCustomerRoles = By.xpath("//div[@role='listbox']");	
	By roleListAdmin = By.xpath("//li[contains(.,'Administrators')]");
	By roleListGuest = By.xpath("//li[contains(.,'Guests')]");
	By roleListVendors = By.xpath("//li[contains(.,'Vendors')]");
	By roleListRegistered = By.xpath("//li[contains(.,'Registered')]");
	By roleListForumModerators = By.xpath("xpath=//li[contains(.,'Forum Moderators')]");
	
	By btnSave = By.xpath("//button[@name='save']");
	
	public WebElement clickCustomersLnk() {
	return driver.findElement(lnkCustomers);
	
	}
	
	
	public WebElement clickCustomersItems() {
		return driver.findElement(lnkCustomersItems);
		
	}
	
	
	public WebElement addNewCustomers() {
		return driver.findElement(btnAddNew);
		
	}
	
	public WebElement clickCustomerInfoLnk() {
		return driver.findElement(lnkCustomerInfo);
		
	}
	
	
	public WebElement enterEmail() {
	return driver.findElement(txtEmail);
		
		}
	
	public WebElement enterPswd() {
		return driver.findElement(txtPswd);
		}	
	
	public WebElement enterFName() {
	return driver.findElement(txtFName);
	
	}	
	
	public WebElement enterLName() {
	return driver.findElement(txtLName);
		
	}
	

	public WebElement clickMGenderBtn() {
	return driver.findElement(rdBtnMGender);
	}	
	
	public WebElement clickFGenderBtn() {
	return driver.findElement(rdBtnFGender);		
		
	}	
	
	public WebElement enterCompanyName() {
	return driver.findElement(txtCompanyName);
			
	}
	
	
	public WebElement enterDOB() {
	return driver.findElement(txtDOB);
				
	}
	
	
	public void enterCustomerRoles(String role) {
		
	driver.findElement(By.xpath("//*[@id='SelectedCustomerRoleIds_taglist']/li/span[2]")).click();  //clears the txt box
	driver.findElement(selectCustomerRoles).click();
	
	WebElement listItem;
		
		switch (role)
		{		
		case "Administrators":
		listItem = driver.findElement(roleListAdmin); break;
		
		case "Guest":			
		listItem = driver.findElement(roleListGuest); break;
		
		case "Registered":
		listItem = driver.findElement(roleListRegistered); break;
					
		case "Vendors":
		listItem = driver.findElement(roleListVendors); break;
					
		case "Forum Moderator":
		listItem = driver.findElement(roleListForumModerators); break;
		
		default:
		listItem = driver.findElement(roleListGuest);
		
	}		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", listItem);
		//return driver.findElement(selectCustomerRoles);	
					
	}
	
	public WebElement clickSaveBtn() {
	return driver.findElement(btnSave);
						
	}
	
	
}
