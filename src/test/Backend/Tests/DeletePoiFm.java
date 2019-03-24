package test.Backend.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeletePoiFm {

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
    public void deletePoi(){

        for(int r=1; r<=20; r++) {
            driver.findElement(By.xpath("//a[@href='https://fmdelivery.koklass.com/system/point-of-interest']")).click();

            driver.findElement(By.xpath("//*[@id='page-content']/div[5]/div/div[1]/div/table/tbody/tr[1]/td[4]/form/button")).click();

            driver.findElement(By.xpath("//*[@id='delete-btn']")).click();

            System.out.println(r);
        }
        }

}
