package test.Backend.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Backend.Data.DataForEmails;

public class AddEkInNameFM {

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
    public void AddEk() throws Exception {

        driver.findElement(By.xpath("//a[@href='https://fmdelivery.koklass.com/system/driverDetail']")).click();
    Object[][] dataforuser = DataForEmails.Username();

        for(int i=0;i<dataforuser.length;i++) {

            driver.findElement(By.xpath("//input[@type='text']")).sendKeys((CharSequence) dataforuser[i][0].toString());

            driver.findElement(By.xpath("//*[@id='page-content']/div[5]/div/form/div/div[3]/div/span/button")).click();

            driver.findElement(By.xpath("//*[@id='page-content']/div[5]/div/div[1]/div/table/tbody/tr/td[8]/a[1]/i")).click();

            driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("(EK)");

            driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();

            driver.findElement(By.xpath("//*[@id='page-content']/div[5]/p/a")).click();

            Thread.sleep(1000);

            System.out.println(i);

        }


    }

}
