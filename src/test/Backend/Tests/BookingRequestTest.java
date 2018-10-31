package test.Backend.Tests;

import org.testng.annotations.Test;

import test.Backend.Elements.DashboardElements;

public class BookingRequestTest extends SetupAndTeardown {
	
	@Test
	public void bookingRequest() throws InterruptedException {
		DashboardElements DashboardObj = new DashboardElements(driver);
		

		DashboardObj.BookingDropdnClick();
		Thread.sleep(2000);
		DashboardObj.BookingRequestBtnClick();
		
		
		
	}

}
