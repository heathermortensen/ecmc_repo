package myTests;

import pages.Contact_page;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.*;
import java.time.Duration;
import java.util.List;


public class test_1 {
	
	private static WebDriver driver = null;
	

	
	//Test 1.) Submit a successful Contact Us request, and verify the message on the success page.
	
	public static void main(String[] args) {
		
		//WebDriver driver_for_firefox = new FirefoxDriver();
		//WebDriver driver_for_chrome = new ChromeDriver();
		//WebDriver driver_for_IE = new InternetExplorerDriver();
		
		System.out.print("Project location:" );
		System.out.println(" " + outputPathToProjectOnCurrentComputer());

		System.out.print("Webpage under test:" );
		//String myURL = contactPageURL.toString();
		String myURL = "https://interview-app-plum.vercel.app/contact/";
		System.out.println("" + myURL);
		
		
		URL contactPageURL;
		try {
			
			//URL contactPageURL;
			contactPageURL = new URI(myURL).toURL();
		
		} catch (MalformedURLException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("Opening " + myURL + " for testing in firefox...." );
		//openWebpageUsingFirefoxBrowser(myURL);
		
		//System.out.println("Opening " + myURL + " for testing in chrome...." );
		//openWebpageUsingChromeBrowser(myURL);
		
		
		//GET FIREFOX DRIVER
		//"https://interview-app-plum.vercel.app/contact/"
		WebDriver driver_for_firefox = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/SeleniumFramework/drivers/geckodriver/geckodriver-v0.35.0-win64/geckodriver.exe");
		driver_for_firefox.get("https://interview-app-plum.vercel.app/contact/");
		
		//find all elements
		System.out.println("");
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//		Contact_page.findAllElementsOnPage(driver_for_firefox);
	
		
		//Contact_page myPage = new Contact_page();
		
		//first name
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Contact_page.textbox_firstName(driver_for_firefox).sendKeys("h e ather");
		
		//last name
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Contact_page.textbox_lastName(driver_for_firefox).sendKeys("MMMM");
		
		
		//CheckBox
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Contact_page.checkBoxWithNoID(driver_for_firefox).click();
		
		//State drop down
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		Contact_page.textbox_state(driver_for_firefox).click();
		//WebElement option = Contact_page.textbox_state(driver_for_firefox);
		Select dropdownOption = new Select(driver_for_firefox.findElement(By.id("addressState")));
		dropdownOption.selectByVisibleText("Minnesota");
		//or dropdownOption.selectByIndex(7);
		
		//Zip
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Contact_page.textbox_zip(driver_for_firefox).sendKeys("55105");
		
		//City DOES NOT WORK because this textbox is a dynamic web element with an id that changes when the page refreshes.
		//driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Contact_page.textbox_city(driver_for_firefox).sendKeys("Anoka");

		//Message Box
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Contact_page.messagebox(driver_for_firefox).sendKeys("NA");

		//Button
		driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Contact_page.submitbutton(driver_for_firefox).click();
		
	
		
		//driver_for_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Contact_page.submitbutton(driver_for_firefox).click();
		
		try {
			
		Thread.sleep(5500);
	
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		
//      Contact_page.textbox_firstName(driver_for_firefox).sendKeys("heather");
//		Contact_page.textbox_lastName(driver_for_firefox).sendKeys("M");
		//myPage.textbox_lastName(driver_for_firefox).sendKeys("MMMM");
		//myPage.textbox_lastName(driver_for_firefox).sendKeys("MMMM     mmmmmmm    mmmmmm mmm");

		
		//contactPageRequest(driver_for_firefox);
		
		driver_for_firefox.close();
	}
	
	public static void contactPageRequest(WebDriver driver) {
	
		
		
	}

	
	public static String outputPathToProjectOnCurrentComputer() {
		
		String pathToProjectOnCurrentComputer = System.getProperty("user.dir");
		
	return pathToProjectOnCurrentComputer;	
	}
	
	public static void openWebpageUsingFirefoxBrowser(String myURL) {
		
		WebDriver driver_for_firefox = new FirefoxDriver();
		
		//GET FIREFOX DRIVER
		//Do I need to package gecko driver up in here? Probably should.
		// I only packed the windows version inside the eclipse drivers folder
		
		System.setProperty("webdriver.gecko.driver", "/SeleniumFramework/drivers/geckodriver/geckodriver-v0.35.0-win64/geckodriver.exe");
		
		driver_for_firefox.get(myURL);
		
		
		try {
			
			Thread.sleep(5500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver_for_firefox.close();
		
		try {
			
			Thread.sleep(5500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void openWebpageUsingChromeBrowser(String myURL) {
				
	//GET CHROME DRIVER
		
		WebDriver driver_for_chrome = new ChromeDriver();
		
	//I'm running Google Chrome	127.0.6533.89 (Official Build) (64-bit) (cohort: Stable)
	// Note: I'm throwing an error here. I am using chrome driver for 127.0.6533.99 from 
	// https://googlechromelabs.github.io/chrome-for-testing/
		
	//TO DO: Can I find a correct version of the driver for my browser.
		
		System.setProperty("webdriver.chrome.driver", "/SeleniumFramework/drivers/chromedriver/chromedriver-win64");
		
		//driver_for_chrome.get("https://interview-app-plum.vercel.app/contact");
		driver_for_chrome.get(myURL);
		
		try {
			
			Thread.sleep(33500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver_for_chrome.close();
			
	}
	
	
}
