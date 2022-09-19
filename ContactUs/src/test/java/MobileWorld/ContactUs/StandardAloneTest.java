package MobileWorld.ContactUs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import MobileWorld.ContactUs.pageobjects.LandingPage;
public class StandardAloneTest {
    @Test(dataProvider="contactus")
	public void contactus(String Username, String Email, String Phoneno, String Message ) throws InterruptedException {
		
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu.patil\\Downloads\\chromedriver_win32//chromedriver.exe");
    	
	    WebDriver driver=new ChromeDriver();
		LandingPage Contact = new LandingPage(driver);
        Contact.goTo();
        Contact.Contact(Username, Email, Phoneno, Message);
		}  

    @DataProvider
    public Object[][] contactus()
    {
        Object[][]data=new Object[2][4];
        
        data[0][0]="Madhu";
        data[0][1]="madhu@gmail.com";
        data[0][2]="877789333";
        data[0][3]="this is message";
        
        data[1][0]="Madhu";
        data[1][1]="madhu@gmail.com";
        data[1][2]="8798899900007789333";
        data[1][3]="this is message";
        return data;
        
    }
    
 }

