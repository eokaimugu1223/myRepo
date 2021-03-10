package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig()  {
		
	try {
		FileInputStream fis = new FileInputStream("./Configuration\\config.properties");
		prop = new Properties();
		prop.load(fis);
		
	} catch (Exception e) {
		 
		System.out.println("Exception is "+ e.getMessage());
	}
	
	}
	
	//For every variable in the config.properties file you have to create an action method
	
	public String getApplicationURL()
	{
	String url = prop.getProperty("baseURL");
	return url;
	}
	
	public String getUserName()
	{
	String userName = prop.getProperty("userName");
	return userName;
	}
	
	public String getEmail()
	{
	String email = prop.getProperty("email");
	return email;
	}
	
	public String getPassword()
	{
	String pswd = prop.getProperty("password");
	return pswd;
	
	}
	
	public String getCompanyName()
	{
	String address = prop.getProperty("companyName");
	return address;
	}
	
	public String getIpAddress() {
	String address = prop.getProperty("ipAddress");
	return address;
	}
	
	public String getFirstName()
	{
	String firstName = prop.getProperty("fName");
	return firstName;
	}	
			
	public String getLastName()
	{
	String lastName = prop.getProperty("lName");
	return lastName;
	}
	
	public String getDateOfBirth()
	{
	String DOB = prop.getProperty("DateOfBirth");
	return DOB;
	}
	
	public String getCustomerRole()
	{
	String role = prop.getProperty("customerRole");
	return role;
	}
	
	public String getChromePath()
	{
	String chrome = prop.getProperty("chromePath");
	return chrome;
	}
	
	
	public String getIEPath()
	{
	String IE = prop.getProperty("iePath");
	return IE;
	}
	
	
	public String getFirefoxPath()
	{
	String firefox = prop.getProperty("firefoxPath");
	return firefox;
	}
}
