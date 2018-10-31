package test.Backend.Tests;



import org.testng.annotations.Test;

import test.Backend.Elements.BookingPageElement;
import test.Backend.Elements.DashboardElements;

public class BookingEmailConfigTest extends SetupAndTeardown {
	
	@Test
	public void BookingEmailConfig() throws InterruptedException {
		
		DashboardElements DashboardObj = new DashboardElements(driver);
		BookingPageElement BookingObj = new BookingPageElement(driver);
		

		DashboardObj.BookingDropdnClick();
		Thread.sleep(2000);
		DashboardObj.BookingEmailConfigBtnClick();
		
		BookingObj.AddBtnClick();
		BookingObj.Entername();
		BookingObj.EnterEmail();
		BookingObj.StatusDrpDnClick();
		BookingObj.ActiveSelect();
		BookingObj.SaveBtnClick();
		
	}

}
