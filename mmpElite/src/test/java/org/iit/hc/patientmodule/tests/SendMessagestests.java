package org.iit.hc.patientmodule.tests;

import java.util.HashMap;

import org.iit.hc.base.TestBase;
import org.iit.hc.mmp.HelperClass;
import org.iit.hc.patientmodule.pages.SendMsgsPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class SendMessagestests extends TestBase {
	
	HashMap<String ,String> Hmap = new HashMap<String,String>();
	HelperClass helperobj;
	
	@Test
	public void ValidateSendmsgs() {
		 
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.manage().window().maximize();
		helperobj = new HelperClass(driver);
		helperobj.login("ria1","Ria12345");
		helperobj.navigateToAModule("Messages");
		SendMsgsPage SMPobj = new SendMsgsPage(driver);
		SMPobj.sendMessagespage("Flu Shot" , "Need app for the Flu shot");
	    //navigateToAModule("Logout");
        helperobj.Adminpage("Ben@123","Frank@123");
        helperobj.navigateToAModule("Messages");
	    //AdminModuleMsgpg();
        SMPobj.RecentMsgDetails();
        SMPobj.validateMessageFromAdminModule(Hmap, "IITWorkForce","Flu Shot","Need app for the Flu shot");
	    
	    driver.quit();
		
	}	

}
