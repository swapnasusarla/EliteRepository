package org.iit.hc.patientmodule.pages;

import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditProfilePage  {
	
	WebDriver driver;
	public EditProfilePage(WebDriver driver) {
		this.driver=driver;
	}
	/**
	 * Updating One field in the profile page
	 * @return hashmap with all the values
	 */	
   public HashMap<String , String > EditProfilePage1field() {
		
		HashMap<String , String > ExpHmap = new HashMap<String, String>();
		
		driver.findElement(By.id("Ebtn")).click();
		String Fname = "IITWorkForce";
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys(Fname);
		ExpHmap.put("Fname", Fname);
		driver.findElement(By.id("Sbtn")).click();
		String expalrttxt = "Your Profile has been updated.";
		Alert alrt = driver.switchTo().alert();
		String actalrttxt = alrt.getText();
		alrt.accept();
		Assert.assertTrue(actalrttxt.equalsIgnoreCase(expalrttxt), "Alert Text Match");
		ExpHmap.put("Lname", driver.findElement(By.id("lname")).getAttribute("value"));
		ExpHmap.put("Licence", driver.findElement(By.id("licn")).getAttribute("value"));
		ExpHmap.put("SSN", driver.findElement(By.id("ssn")).getAttribute("value"));
		ExpHmap.put("Address", driver.findElement(By.id("addr")).getAttribute("value"));
		ExpHmap.put("Age", driver.findElement(By.id("age")).getAttribute("value"));
		ExpHmap.put("Height", driver.findElement(By.id("height")).getAttribute("value"));
		ExpHmap.put("Weight", driver.findElement(By.id("weight")).getAttribute("value"));
		ExpHmap.put("City", driver.findElement(By.id("city")).getAttribute("value"));
		ExpHmap.put("State", driver.findElement(By.id("state")).getAttribute("value"));
		ExpHmap.put("ZipCode", driver.findElement(By.id("zip")).getAttribute("value"));
		
		return ExpHmap;
				
	}
/**
 * updating two fields in profile page
 * @return hashmap
 */

   public HashMap<String , String > EditProfilePage2fields() {
	
	HashMap<String , String > ExpHmap = new HashMap<String, String>();
	
	driver.findElement(By.id("Ebtn")).click();
	String Fname = "IITWorkForce";
	driver.findElement(By.id("fname")).clear();
	driver.findElement(By.id("fname")).sendKeys(Fname);
	ExpHmap.put("Fname", Fname);
	String City = "Bangolore";
	driver.findElement(By.id("city")).clear();
	driver.findElement(By.id("city")).sendKeys(City);
	ExpHmap.put("City", City);
	driver.findElement(By.id("Sbtn")).click();
	String expalrttxt = "Your Profile has been updated.";
	Alert alrt = driver.switchTo().alert();
	String actalrttxt = alrt.getText();
	alrt.accept();
	Assert.assertTrue(actalrttxt.equalsIgnoreCase(expalrttxt), "Alert Text Match");
	ExpHmap.put("Lname", driver.findElement(By.id("lname")).getAttribute("value"));
	ExpHmap.put("Licence", driver.findElement(By.id("licn")).getAttribute("value"));
	ExpHmap.put("SSN", driver.findElement(By.id("ssn")).getAttribute("value"));
	ExpHmap.put("Address", driver.findElement(By.id("addr")).getAttribute("value"));
	ExpHmap.put("Age", driver.findElement(By.id("age")).getAttribute("value"));
	ExpHmap.put("Height", driver.findElement(By.id("height")).getAttribute("value"));
	ExpHmap.put("Weight", driver.findElement(By.id("weight")).getAttribute("value"));
	
	ExpHmap.put("State", driver.findElement(By.id("state")).getAttribute("value"));
	ExpHmap.put("ZipCode", driver.findElement(By.id("zip")).getAttribute("value"));
	
	return ExpHmap;
			
}

/**
 * Reading all the values from the profile page
 * @return HashMap
 */

public HashMap<String , String > ReadProfilePgData(){
	
	HashMap<String,String> ActHmap = new HashMap<String,String>();
	ActHmap.put("Fname", driver.findElement(By.id("fname")).getAttribute("value"));
	ActHmap.put("Lname", driver.findElement(By.id("lname")).getAttribute("value"));
	ActHmap.put("Licence", driver.findElement(By.id("licn")).getAttribute("value"));
	ActHmap.put("SSN", driver.findElement(By.id("ssn")).getAttribute("value"));
	ActHmap.put("Address", driver.findElement(By.id("addr")).getAttribute("value"));
	ActHmap.put("Age", driver.findElement(By.id("age")).getAttribute("value"));
	ActHmap.put("Height", driver.findElement(By.id("height")).getAttribute("value"));
	ActHmap.put("Weight", driver.findElement(By.id("weight")).getAttribute("value"));
	ActHmap.put("City", driver.findElement(By.id("city")).getAttribute("value"));
	ActHmap.put("State", driver.findElement(By.id("state")).getAttribute("value"));
	ActHmap.put("ZipCode", driver.findElement(By.id("zip")).getAttribute("value"));
	
	return ActHmap;
		
	}
}
	
	


