package test.Backend.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardElements {

	WebDriver dvr;
    public DashboardElements(WebDriver paramdvr) 
    {
        PageFactory.initElements(paramdvr, this);
        this.dvr = paramdvr;
    }
    
    //***************************Login Page *****************************
    @FindBy(xpath="//input[@id='Email']")
    WebElement EmailFieldElement;
    
    @FindBy(xpath="//input[@id='Password']")
    WebElement PasswordFieldElement;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement LoginButtonElement;
    
    public void SetEmail() {
    	EmailFieldElement.sendKeys("admin@ekbana.com");
    }
    
    public void SetPassword() {
    	PasswordFieldElement.sendKeys("Admin@123");
    }
    
    public void ClickLoginButton() {
    	LoginButtonElement.click();
    }
    
}
