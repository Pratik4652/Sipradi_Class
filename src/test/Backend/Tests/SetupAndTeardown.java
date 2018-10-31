package test.Backend.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import test.Backend.Elements.DashboardElements;

public class SetupAndTeardown {
	public WebDriver driver;
	@BeforeMethod
	
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver2.40.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://sipradiadmin.ekbana.info");
		
		DashboardElements de = new DashboardElements(driver);
		
		de.SetEmail();
		de.SetPassword();
		Thread.sleep(2000);
		de.ClickLoginButton();
		
		System.out.println("Login test Successful");
		
	}
	
	
	@AfterMethod
	public void QuitBrowser() {
		driver.quit();
	}
	

}
