package org.iit.hc.patientmodule.tests;

import java.util.HashMap;

import org.iit.hc.base.TestBase;
import org.iit.hc.mmp.HelperClass;
import org.iit.hc.patientmodule.pages.EditProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditUpdateProfileTests extends TestBase {
	
	
	
    @Test
	public void Validateprofile() {
    	
    	
		HelperClass helperobj = new HelperClass(driver);
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.manage().window().maximize();
		helperobj.login(pro.getProperty("UName"),pro.getProperty("UPwd"));
		helperobj.navigateToAModule("Profile");
		EditProfilePage editupdateobj = new EditProfilePage(driver);
		HashMap<String, String> expHMap =editupdateobj.EditProfilePage1field();
		HashMap<String, String> actHMap = editupdateobj.ReadProfilePgData();
		Assert.assertTrue(expHMap.equals(actHMap));
		HashMap<String, String> exp2HMap =editupdateobj.EditProfilePage2fields();
		HashMap<String, String> act2HMap = editupdateobj.ReadProfilePgData();
		Assert.assertTrue(exp2HMap.equals(act2HMap));
		
		
		
	}

}
	
	


