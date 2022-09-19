package MobileWorld.ContactUs.pageobjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="/html/body/nav/div/ul/li[4]/a")
	WebElement support;
	
	@FindBy(linkText="Contact Us")
	WebElement contactus;
	
	 @FindBy(css="input[placeholder='Username']")
	 WebElement Username;
	 
	 @FindBy(xpath="//*[@placeholder='Email']")
	 WebElement Email;
	 
	 @FindBy(xpath="//*[@placeholder='Phone']")
     WebElement Phoneno;
	 
	 @FindBy(xpath="//*[@placeholder='Message']")
	 WebElement Message;
	 
	 @FindBy(xpath="//*[@type='submit']")
	 WebElement submit;
	 

	public void Contact(String username, String email, String Phone, String message)
	 {
		support.click();
		contactus.click();
		String parenthandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if(!handle.equals(parenthandle)) {
                driver.switchTo().window(handle);
        Username.sendKeys(username);
		Email.sendKeys(email);
	    Phoneno.sendKeys(Phone);
		Message.sendKeys(message);
		submit.click();
            }
        }
		}
	   public void goTo()
	     {
	        driver.get("https://mobileworld.banyanpro.com");
	
	     }

	  
}
