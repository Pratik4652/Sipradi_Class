package test.Backend.Tests.MultiWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowTest {

    public WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver2.40.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/windows");

        String firstWindow = driver.getWindowHandle();

        driver.findElement(By.cssSelector(".example a")).click();


        Assert.assertEquals(driver.getTitle(),"The Internet");
        Thread.sleep(5000);
        driver.switchTo().window(firstWindow);
        Assert.assertEquals(driver.getTitle(),"New Window")  ;




    }

    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
