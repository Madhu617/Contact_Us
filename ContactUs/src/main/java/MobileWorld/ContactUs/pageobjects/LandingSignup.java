package MobileWorld.ContactUs.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingSignup {

	
	WebDriver driver;
	public LandingSignup (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(css="button[type='submit']")
	WebElement signIn;

    @FindBy(css="a[href='signup.html']")
	WebElement signup;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement date;
	
	@FindBy(xpath="//*[@id=\"myForm\"]/div[3]/div[4]/input")
	WebElement gen;
	
	@FindBy(css="input[type='number']")
	WebElement Mobnum;


    @FindBy(css="textarea[placeholder='Short Bio']")
	WebElement Shortbio;

    @FindBy(xpath="//*[@id=\"myForm\"]/div[6]/div[2]/button")
	WebElement register;

   
    public void Signup(String fname, String lname, String email, String pwd, String dob, String num, String bio) throws InterruptedException
    {
    signIn.click();
    signup.click();
    FirstName.sendKeys(fname);
    LastName.sendKeys(lname);
    Email.sendKeys(email);
    Password.sendKeys(pwd);
    date.sendKeys(dob);
    gen.click();
    Mobnum.sendKeys(num);
    Shortbio.sendKeys(bio);
    register.click();
    Thread.sleep(1000);
    driver.switchTo().alert().accept();
    driver.quit();
    
    }

    public void goTo()
    {
    	driver.get("https://mobileworld.banyanpro.com/");
    }


}
