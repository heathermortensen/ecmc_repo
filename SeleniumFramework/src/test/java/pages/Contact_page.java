package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Contact_page {
	
	String firstName = new String();
	String lastName = new String();
	
	
	private static WebElement element = null;
	
	
	public String get_firstName() {
	
	return this.firstName;
	}
	
	public String get_lastName() {
		
	return this.lastName;
	}
	
	public void set_firstName(String myFirstName) {
		
			this.firstName = myFirstName;
	}
	
	public void set_lastName(String myLastName) {
		
			this.lastName = myLastName;
	}
	
	public static WebElement textbox_firstName(WebDriver driver) {
		
		element = driver.findElement(By.id("firstName"));
	
	return element;
	}
	
	public static WebElement textbox_lastName(WebDriver driver) {
		
		element = driver.findElement(By.id("lastName"));
	
	return element;
	}
	
	public static WebElement textbox_city(WebDriver driver) {
		
		//This element's id seems to be changing, so lets find it using xpath. See video: https://www.youtube.com/watch?v=rF577DJH7E8
		//https://sqa.stackexchange.com/questions/18342/how-to-handle-dynamic-changing-ids-in-xpath
		
		// xpath is //*[@id="city_*"]
		
		//element = driver.findElement(By.id("city_76"));
		//element = driver.findElement(By.id("city_32"));
		//element = driver.findElement(By.id("city_3"));
		
		// We have a dynamic web element here.
		
		//Actually dynamic IDs appearing on pages are a code smell that you should be querying. 
		//Particularly addressing the question, 'is it leaking information about the internals of the system?' 
		//In general dynamic ID should be avoided. Further more, if automated testing is non-functional requirement of the project, 
		//suitable ID should be provided as per a proper locator strategy.
		//https://sqa.stackexchange.com/questions/18342/how-to-handle-dynamic-changing-ids-in-xpath
		
		//It doesn't like this syntax because of the underscore.
		element = driver.findElement(By.xpath("//*[contains(@id=,'city_']"));
		
				
	return element;
	}
	
	public static WebElement textbox_state(WebDriver driver) {
		
		element = driver.findElement(By.id("addressState"));
	
	return element;
	}
	
	public static WebElement textbox_zip(WebDriver driver) {
		
		element = driver.findElement(By.id("addressZip"));
	
	return element;
	}
	
	public static WebElement messagebox(WebDriver driver) {
		
		element = driver.findElement(By.id("messageBox"));
	
	return element;
	}
	
	// This is the checkbox with no name or id. 
	// I'm gonna identify it by class, but I don't like it.
	//<input required="" class="form-check-input" type="checkbox">
	
	public static WebElement checkBoxWithNoID(WebDriver driver) {
		
		element = driver.findElement(By.className("form-check-input"));
	
	return element;
	}
	

	public static WebElement submitbutton(WebDriver driver) {
		
		//This element has no id or name, so we need to locate it using the xpath. See video: https://www.youtube.com/watch?v=rF577DJH7E8
		// xpath is /html/body/div[2]/main/form/button
		element = driver.findElement(By.xpath("/html/body/div[2]/main/form/button"));
	
	return element;
	}
	
	public static WebElement findAllElementsOnPage(WebDriver driver) {
		
		//To count the total number of web elements in the web page using Selenium for Java, 
		//find elements using XPath with expression to match any web element. driver.findElements(By.xpath("//*"))
		
		//A list of all web elements on our page
		List<WebElement> list_all_elements = new ArrayList<WebElement>();
		
		//A list of all web elements with an id that contains "city"
		List<WebElement> city_list = new ArrayList<WebElement>();
		
		//list_all_elements = driver.findElements(By.xpath("//*"));
		
		System.out.println(" There are " + list_all_elements.size() + " elements that exist on this page: ");
		System.out.println("------------------------------------ List all elements -----------------------------------------");
		
	     for (WebElement e : list_all_elements ) {
	    	    
	         System.out.println(e.getText() );
	     }
	     
			
	     
	     //Make a text file
//	     try {
//	         File myObj = new File("filename.txt");
//	         if (myObj.createNewFile()) {
//	           System.out.println("File created: " + myObj.getName());
//	         } else {
//	           System.out.println("File already exists.");
//	         }
//	       } catch (IOException e) {
//	         System.out.println("An error occurred.");
//	         e.printStackTrace();
//	       }
//	     }
	     
	     // Get element with tag name 'div'
		 List<WebElement> div_elements = driver.findElements(By.tagName("div"));
	
		 System.out.println("-------------------------------" + div_elements.size() + " div elements ----------------------------------------------");
			 for (WebElement e : div_elements) {
	    	 
	    	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	    	
	    		 if (div_elements.indexOf(e) % 6 != 0 )
	    		 {
	    			 System.out.print(e.getText() + " " + e.getAccessibleName() + " " + e.getTagName() + " " + e.getLocation() + "  *  ");
	    		 }
	    		 else
	    		 {
	    			 System.out.print(e.getText() + " " + e.getAccessibleName() + " " + e.getTagName() + " " + e.getLocation() + "  *  ");
	    			 System.out.println("");
	    		 }
	    	 }
	     
//        
//        // Get all the elements available with tag name 'p'
////        List<WebElement> p_elements = element.findElements(By.tagName("p"));
////        for (WebElement e : p_elements) {
////            System.out.println(e.getText());
////        }
//         
//		
		//city_list = driver.findElements(By.xpath("//*[contains(@id, 'city')])"));
	     
	   //city_list = driver.findElements(By.xpath("//*[contains(text(), city)])"));
	   
	   city_list = driver.findElements(By.xpath("city"));
		
		int sizeOfList = city_list.size();
		
		System.out.println("");
		System.out.println("size of city list = " + sizeOfList);
		System.out.println("========================");
		
		for (WebElement e4 : city_list)
		{
			WebElement first = city_list.getFirst();
			System.out.print("first web element type = " + first.getText() + " ");
			
			WebElement last = city_list.getLast();
			System.out.print("last web element type = " + last.getText() + " ");
			
		}
	
	return element;	
	}
	

}
