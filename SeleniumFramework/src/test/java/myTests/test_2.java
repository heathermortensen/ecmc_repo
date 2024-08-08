package myTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static org.junit.Assert.*;
//import org.junit.Assert;
//import org.testng.Assert;
//import org.testng.*;
//import org.testng.Assert;

import pages.Contact_page;

public class test_2 {
	
	/*
	 * Test 2a.) Fill out the Contact Us form's First and Last name fields, then click Submit button. 
		   2b.) Verify the validation message for First name. 
	       2c.) Verify the error message under the Terms and Conditions checkbox
	 */
	
		private static WebDriver driver = null;
	
	public static void main(String[] args) { 
		
		System.out.print("Project location:" );
		System.out.print("---------------------" );
		System.out.println(" " + outputPathToProjectOnCurrentComputer());

		System.out.print("Webpage under test:" );
		System.out.print("---------------------" );
		String myURL = "https://interview-app-plum.vercel.app/contact/";
		System.out.println("" + myURL);
		
		//GET FIREFOX DRIVER
		WebDriver driver_for_firefox = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/SeleniumFramework/drivers/geckodriver/geckodriver-v0.35.0-win64/geckodriver.exe");
		driver_for_firefox.get("https://interview-app-plum.vercel.app/contact/");
		
		
		System.out.println("");
		
		
		//Fill out the Contact forms first and last name fields, then click submit.
		
		Contact_page contact_form = new Contact_page();
		
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		//Fill in the first name on the form
		String key_input_for_first_name = new String();
		key_input_for_first_name = "HEATHER";
		contact_form.textbox_firstName(driver_for_firefox).sendKeys(key_input_for_first_name);
		contact_form.set_firstName(key_input_for_first_name);
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		//Fill in the last name on the form
		
		contact_form.textbox_lastName(driver_for_firefox).sendKeys("MORTENSEN");
		contact_form.set_lastName("MORTENSEN");
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		// Click the submit button on the form
		
		contact_form.submitbutton(driver_for_firefox).click();
		
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		// Validate message output from firstName field. Expected text output = Looks good! <div class="valid-feedback">Looks good!</div>
		
	    String expectedOutputFromFirstNameField = "Looks good!";
	      
	    //identify actual error/output message
	    
	    WebElement e_1st_name = driver_for_firefox.findElement(By.className("valid-feedback"));
	      
	    String actualOutput_1st_name = e_1st_name.getText();
	   
	    
	      //verify error message with Assertion - I don't have the libraries
	      //Assert.assertEquals(actualOutput_1st_name, expectedOutputFromFirstNameField);   
	    
	    System.out.println("" + outputTestHeader());
	    
	    String output1 = new String();
	    output1 = "Passing test results exist when all results are true.";
	    System.out.println("" + output1);
	    System.out.println("");
	    
	  //Display test #2a results
	    
	    String testResult_2a = new String();
	    testResult_2a = " Result #2a. ";
	    
	      //assertEquals(expectedOutputFromFirstNameField, actualOutput_1st_name);
	    System.out.print("" + testResult_2a + TwoStringsAreEqual(expectedOutputFromFirstNameField, actualOutput_1st_name));
	   
	    System.out.println("\n      Test #2a Details: " + actualOutput_1st_name  + " equals " +  expectedOutputFromFirstNameField);
	    
	    
	    
	    
	    
		
		
		//Close the firefox driver
		
		driver_for_firefox.close();
		
	}
	
	
	public static String outputPathToProjectOnCurrentComputer() {
		
		String pathToProjectOnCurrentComputer = System.getProperty("user.dir");
		
	return pathToProjectOnCurrentComputer;	
	}
	
	public static String outputTestHeader() {
		
		String header = new String();
		header = "========================\n" + "    TEST RESULTS  \n" + "========================\n";
		
	return header;		
	}
	
	public static Boolean TwoStringsAreEqual(String s1, String s2) {
		
		boolean testResult;
		
		testResult = s1.equals(s2);
				
	return testResult;		
	}

}
