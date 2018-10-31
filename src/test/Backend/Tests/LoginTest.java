package test.Backend.Tests;

import org.testng.annotations.Test;

import test.Backend.Elements.DashboardElements;

public class LoginTest extends SetupAndTeardown {
	
	@Test
	public void LoginPage() {
		DashboardElements dashboardObject = new DashboardElements(driver);
		
		dashboardObject.SetEmail();
		dashboardObject.SetPassword();
		dashboardObject.ClickLoginButton();
		
		System.out.println("Login test Successful");
	}
	


}
