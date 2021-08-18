package org.iit.hc.patientmodule.tests;

import org.iit.hc.mmp.HelperClass;
import org.iit.hc.patientmodule.pages.ScheduleAppointmentPage;
import org.iit.hc.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleAppointmentTests extends TestBase{
	
	
	@Test
	public void validateScheduleAppointment()
	{
		HelperClass helperobj = new HelperClass(driver);
		
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		
		helperobj.login(pro.getProperty("UName"),pro.getProperty("UPwd"));
		helperobj.navigateToAModule("Schedule Appointment");
		ScheduleAppointmentPage SAPage = new ScheduleAppointmentPage(driver);
		boolean result = SAPage.scheduleAppointment("Becky",10,"10Am","Cold & Fever");
		Assert.assertTrue(result);
 
	}
	
	
}