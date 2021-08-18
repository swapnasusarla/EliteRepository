package org.iit.hc.patientmodule.pages;

import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendMsgsPage {
	
	WebDriver driver;
	
	public SendMsgsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	/**
	 * send messages page 
	 * @param Sub --Contact reason in the messages page
	 * @param Msg --actual massage to be sent
	 * @return true or false
	 */
	public boolean sendMessagespage(String Sub, String Msg) {
		
		driver.findElement(By.id("subject")).clear();
		driver.findElement(By.id("subject")).sendKeys(Sub);
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys(Msg);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String Expalrttxt = "Messages Successfully sent.";
		Alert alrt = driver.switchTo().alert();
		String Actalrttxt = alrt.getText();
		alrt.accept();
		//Assert.assertTrue(Actalrttxt.equalsIgnoreCase(Expalrttxt), "Alert message not matched");
		if (Actalrttxt.equalsIgnoreCase(Expalrttxt)) {
			System.out.println("alert messages matched");
			return true;
		}else {
			System.out.println("Alert message not matched");
			return false;
		}
		
	}
	
	/**
	 * Admin page login 
	 * @param Uname
	 * @param Pswd
	 */
	
	
	//public void AdminModuleMsgpg() {
		
	//	driver.findElement(By.xpath("//span[contains(text(),'Messages')]")).click();	
		
	//}
	
	public HashMap<String,String> RecentMsgDetails() {
		
		HashMap<String ,String> Hmap = new HashMap<String,String>();
		
		By Patientname = By.xpath("//table[@class='table']//tbody//tr[1]//td[1]");
		By Reason = By.xpath("//table[@class='table']//tbody//tr[1]//td[2]");
		By descriptionMsg = By.xpath("//table[@class='table']//tr[3]/td[2]");
		
		String Name = driver.findElement(Patientname).getText();
		String Subject = driver.findElement(Reason).getText();
		String Description = driver.findElement(descriptionMsg).getText();
		
		//HashMap<String ,String> Hmap = new HashMap<String,String>();
		Hmap.put("Name", Name);
		Hmap.put("Subject", Subject);
		Hmap.put("Description", Description);
		
		return Hmap;
		
	}
	
	public boolean validateMessageFromAdminModule(HashMap<String, String> hMap, String name, String Reason, String description){

		boolean result = false;
		if(hMap.get("Subject").equals(Reason) && hMap.get("Description").equals(description) &&hMap.get("Name").equals(name)){

			System.out.println("Passed");
			result = true;

		}
		return result;
	}
	

}

