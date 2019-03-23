package test.Backend.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Backend.Data.DataForEmails;

public class AddPoiFM {

    public WebDriver driver;
    @BeforeMethod

    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver2.40.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fmdelivery.koklass.com/system/login");
        driver.findElement(By.xpath("//input[@placeholder='Enter Your Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Enter your Password']")).sendKeys("123admin@");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Test
    public void EnterPoi() throws Exception {
        driver.findElement(By.xpath("//a[@href='https://fmdelivery.koklass.com/system/point-of-interest']")).click();
        Thread.sleep(2000);


        Object[][] data = DataForEmails.PoiData();

        for(int i=0;i<data.length;i++)
        {
            driver.findElement(By.xpath("//a[@href='https://fmdelivery.koklass.com/system/point-of-interest/create']")).click();
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='pTitle']")).sendKeys((CharSequence) data[i][0]);
           // Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter latitude']")).sendKeys((CharSequence) data[i][1]);
           // Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter longitude']")).sendKeys((CharSequence) data[i][2]);
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();


        }
    }
}
