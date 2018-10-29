package test.Backend.Tests;

import test.Backend.Elements.DashboardElements;

public class LoginTest extends SetupAndTeardown {
	
	public void LoginPage() {
		DashboardElements de = new DashboardElements(driver);
		
		de.SetEmail();
		de.SetPassword();
		de.ClickLoginButton();
	}

}
