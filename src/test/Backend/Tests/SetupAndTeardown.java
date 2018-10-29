package test.Backend.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetupAndTeardown {
	public WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/webdriver/chromedriver2.40.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://sipradiadmin.ekbana.info");
		
	}
	
	
	@AfterMethod
	public void QuitBrowser() {
		driver.quit();
	}
	

}
