package org.iit.hc.mmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperClass {
	
	WebDriver driver;
	public HelperClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String uname,String pword)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.name("submit")).click();
	}
	
	public void navigateToAModule(String tabName)
	{
		driver.findElement(By.xpath("//span[contains(normalize-space(),'"+tabName+"')]")).click();
		
	}
	
public void Adminpage(String Uname, String Pswd) {
		
		driver.get("http://96.84.175.78/MMP-Release2-Admin-Build.2.1.000/login.php");
		
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(Pswd);
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
	}

}

