package MobileWorld.ContactUs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import MobileWorld.ContactUs.pageobjects.LandingSignup;

public class SignUp {

		
		@Test(dataProvider="signup")
		public void signup(String Firstname, String Lastname, String Email, String Password, String date, String Mobnum, String Shortbio) throws InterruptedException
		{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu.patil\\Downloads\\chromedriver_win32//chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();  
	    LandingSignup Siup = new LandingSignup(driver);
	    Siup.goTo();
	    Siup.Signup(Firstname, Lastname, Email, date, Mobnum, Mobnum, Shortbio);
	    Thread.sleep(1000);
	}
	    
	@DataProvider
	   public Object[][] signup(){
	    	Object[][] data = new Object[1][7];
	    	
	    	data[0][0]="Madhu";
	    	data[0][1]="Patil";
	    	data[0][2]="madhu@gmail.com";
	    	data[0][3]="abc@123";
	    	data[0][4]="09/09/2000";
	        data[0][5]="878946657";
	    	data[0][6]="this is text";
	    	return data;
		
	
	   
	}
}
