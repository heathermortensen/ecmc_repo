package myTests;

import pages.Contact_page;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class test_1 {
	
	
	//Test 1.) Submit a successful Contact Us request, and verify the message on the success page.
	
	public static void main(String[] args) {
	
			WebDriver driver = new FirefoxDriver();
	
			//Do I need to package gecko driver up in here? Probably should.
			driver.get("https://interview-app-plum.vercel.app/contact");
	
	
	//driver.get("https://interview-app-plum.vercel.app/contact");
	}
	
}
