package test.Backend.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFromDrpdn {

    public WebDriver driver;
    @Test
    public void SelectItemFromDrpdn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver2.40.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");

        Select selectList = new Select(driver.findElement(By.id("dropdown")));

        selectList.selectByVisibleText("Option 2");

        Thread.sleep(5000);
        driver.quit();
    }

}