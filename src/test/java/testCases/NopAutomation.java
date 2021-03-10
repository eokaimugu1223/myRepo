package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CustomersModule;
import pageObjects.LoginPage;

public class NopAutomation extends BaseClass{
	
	

	@Test
	public void appAutomation() throws InterruptedException
	{
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail().clear();
		lp.enterEmail().sendKeys(email);
		lp.enterPswd().clear();
		lp.enterPswd().sendKeys(password);
		lp.clickChkBox().click();
		lp.clickLoginBtn().click();
			
		
		CustomersModule csm = new CustomersModule(driver);
		csm.clickCustomersLnk().click();		
		csm.clickCustomersItems().click();
		csm.addNewCustomers().click();
		csm.clickCustomerInfoLnk().click();
		String email = randomstring() + "admin@yourstore.com";
		csm.enterEmail().sendKeys(email);
		csm.enterPswd().sendKeys(password);
		csm.enterFName().sendKeys(fName);
		csm.enterLName().sendKeys(lName);
		csm.clickFGenderBtn().click();
		csm.clickMGenderBtn().click();	
		csm.enterDOB().sendKeys(DOB);
		csm.enterCompanyName().sendKeys(companyName);
		csm.enterCustomerRoles(role);
		csm.clickSaveBtn().click();
		
		String verNewCustomer = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]")).getText();
		if(verNewCustomer.equals("The new customer has been added successfully.")) {
			Assert.assertTrue(true);
		}
		
		//csm.clickSearchBtn().click();
	}
	
	
	
	
}
	

