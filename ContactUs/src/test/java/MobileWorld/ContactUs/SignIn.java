package MobileWorld.ContactUs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import MobileWorld.ContactUs.pageobjects.LandingSignin;

public class SignIn {
	

@Test(dataProvider = "signin")
  public void signin(String username,String password) throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu.patil\\Downloads\\chromedriver_win32//chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    LandingSignin Siin = new LandingSignin(driver);
    Siin.goTo();
    Siin.Signin(username, password);
}
    @DataProvider
   public Object[][] signin(){
    	Object[][] data = new Object[2][2];
    	
    	data[0][0]="Madhu";
    	data[0][1]="madhu617";
    	
    	data[1][0]="12344";
    	data[1][1]="@#$$%%";
    	return data;
    }
   
}   