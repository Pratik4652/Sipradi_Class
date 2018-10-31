package test.Backend.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPageElement {
	
	WebDriver dvr;
    public BookingPageElement(WebDriver paramdvr) 
    {
        PageFactory.initElements(paramdvr, this);
        this.dvr = paramdvr;
    }
    
    @FindBy(xpath="//a[@href='/booking/emailconfig/new']")
    WebElement AddBtnElement;
    public void AddBtnClick() {
    	AddBtnElement.click();
    }
    
    @FindBy(xpath="//input[@id='Name']")
    WebElement NameFieldElement;
    
    public void Entername() {
    	NameFieldElement.sendKeys("Pratik");
    }
    
    @FindBy(xpath="//input[@name='Email']")
    WebElement EmailFieldElement;
    public void EnterEmail() {
    	EmailFieldElement.sendKeys("pratikt@ekbana.com");
    }
    
    
    @FindBy(xpath="//select[@id='Status']")
    WebElement StatusDrpdnElement;
    public void StatusDrpDnClick() {
    	StatusDrpdnElement.click();
    }
    
    @FindBy(xpath="//select[@id='Status']/option[@value='1']")
    WebElement ActiveSelectElement;
    public void ActiveSelect() {
    	ActiveSelectElement.click();
    }
    
    @FindBy(xpath="//button[@type='submit' and @class='btn btn-success']")
    WebElement SaveBtnElement;
    public void SaveBtnClick() {
    	SaveBtnElement.click();
    }

}
