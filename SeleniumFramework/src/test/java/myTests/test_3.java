package myTests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Waiting_page;

public class test_3 {
	
	//Test 3.) On the Waiting page, please wait for the page to load, 
	//         and then follow the instructions to verify the two alerts.
	
	//private static WebDriver driver = null;
	private static WebDriver driver_for_firefox = null;
	
public static void main(String[] args) { 
	
	System.out.print("Project location:" );
	System.out.print("---------------------" );
	System.out.println(" " + outputPathToProjectOnCurrentComputer());

	System.out.print("Webpage under test:" );
	System.out.print("---------------------" );
	String myURL = "https://interview-app-plum.vercel.app/waiting";
	System.out.println("" + myURL);
	
	//GET FIREFOX DRIVER
	WebDriver driver_for_firefox = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "/SeleniumFramework/drivers/geckodriver/geckodriver-v0.35.0-win64/geckodriver.exe");
	driver_for_firefox.get("https://interview-app-plum.vercel.app/waiting");
	
	
	System.out.println("");
	
	// Get the webpage
	Waiting_page wait_page = new Waiting_page();
	
	// wait for the page to load
	driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	//Click the "Enable Show Alert" button via the wait_page object. Verify it is enabled first.
	
	wait_page.enableShowAlertButton(driver_for_firefox).click();
	
	driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	//Click the "Show Alert" button
	wait_page.showAlertButton(driver_for_firefox).click();
	
	//ERROR: Element <button class="btn btn-secondary" type="button"> is not clickable at point (548,329) because another element <div> obscures it
	// Verify the output in the alert: https://www.browserstack.com/guide/alerts-and-popups-in-selenium
	//System.out.println("ExpectedConditions.alertIsPresent() = " + ExpectedConditions.alertIsPresent());

	
	String actualAlertMessage = new String();
	
	try 
	{ 
		driver_for_firefox.switchTo().alert(); 
	    System.out.println(" Alert Present");
	    driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		actualAlertMessage = driver_for_firefox.switchTo().alert().getText(); // capture alert message
		System.out.println("Alert message = " + actualAlertMessage); // Print Alert Message
		driver_for_firefox.switchTo().alert().accept(); //Click the "OK" button inside the alert
	}  
	catch (NoAlertPresentException e) 
	{ 
	    System.out.println("No Alert Present");
	} 
	
	// Validate message output from alert. Expected text output = False alarm!
	
    String expectedOutput = "False alarm!";
      
    //identify actual error/output message
    String actualOutput = actualAlertMessage;
   
    
    //verify error message with Assertion - I don't have the libraries
    //Assert.assertEquals(actualOutput_1st_name, expectedOutputFromFirstNameField);   
    
    System.out.println("" + outputTestHeader());
    
    String output1 = new String();
    output1 = "Passing test results exist when all results are true.";
    System.out.println("" + output1);
    System.out.println("");
    
  //Display test #3a results
    
    String testResult_3a = new String();
    testResult_3a = " Result #3a. ";
    
      //assertEquals(expectedOutputFromFirstNameField, actualOutput_1st_name);
    System.out.print("" + testResult_3a + TwoStringsAreEqual(expectedOutput, actualOutput));
   
    System.out.println("\n      Test #3a Details: " + actualOutput  + " equals " +  expectedOutput);
    
    
    //Close the driver
    driver_for_firefox.close();
	
}
		public static String outputPathToProjectOnCurrentComputer() {
			
			String pathToProjectOnCurrentComputer = System.getProperty("user.dir");
			
		return pathToProjectOnCurrentComputer;	
	}
	
	public static Boolean TwoStringsAreEqual(String s1, String s2) {
		
		boolean testResult;
		
		testResult = s1.equals(s2);
				
	return testResult;		
	}
	
	public static String outputTestHeader() {
		
		String header = new String();
		header = "========================\n" + "    TEST RESULTS  \n" + "========================\n";
		
	return header;		
	}
}
