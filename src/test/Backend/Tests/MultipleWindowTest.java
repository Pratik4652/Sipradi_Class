package test.Backend.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowTest {

    public WebDriver driver;

    @Test

    public void setup() throws InterruptedException {
        String selectAll = Keys.chord(Keys.CONTROL, "t");
        //JavascriptExecutor jse = (JavascriptExecutor)driver;
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver2.40.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idensil-devadmin.ekbana.info/");
        driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/div/input")).sendKeys("asdasd");
        driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/div/input")).sendKeys(Keys.CONTROL+"a");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/div/input")).sendKeys(Keys.CONTROL+"x");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/div/input")).sendKeys(Keys.CONTROL+"w");
        Thread.sleep(5000);
        driver.quit();
        //jse.executeScript("window.open()");




    }
}
