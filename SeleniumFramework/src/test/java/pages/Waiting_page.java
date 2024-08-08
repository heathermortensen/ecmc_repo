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

public class Waiting_page {
	
		
		private static WebElement element = null;
		
		
		//  METHODS
		
		//<button type="button" data-testid="enableShowAlertButton" class="btn btn-primary">Enable Show Alert Button</button>

		public static WebElement enableShowAlertButton(WebDriver driver) {
			
			//This element has no id or name, so we need to locate it usign the xpath. See video: https://www.youtube.com/watch?v=rF577DJH7E8
			//https://stackoverflow.com/questions/57101417/find-an-element-where-data-tb-test-id-attribute-is-present-instead-of-id-using-s
			// /html/body/div[2]/main/div[2]/div/div/button[1]
			
			//element = driver.findElement(By.className("btn-primary"));
			while(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/button[1]")).isEnabled()!=true)
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				System.out.println("enableShowAlertButton button is not enabled. Waiting 2 seconds...");
			}
			
			element = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/button[1]"));
		
		return element;
		}
		
		//<button type="button" data-testid="ShowAlertButton" class="btn btn-success">Show Alert</button>
		// Absolute XPath for the button is /html/body/div[2]/main/div[2]/div/div/button[2]
		public static WebElement showAlertButton(WebDriver driver) {
			
			//This element has no id or name, so we need to locate it usign the xpath. See video: https://www.youtube.com/watch?v=rF577DJH7E8
			
			while(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/button[2]")).isEnabled()!=true)
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				System.out.println("showAlertButton button is not enabled. Waiting 2 seconds...");
			}
			
			element = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/button[2]"));
			
		return element;
		}
		
		// <input required="" placeholder="" id="accordion1Text" class="form-control" type="text">
		
		public static WebElement accordion1TextInput(WebDriver driver) {
			
			element = driver.findElement(By.id("accordion1Text"));
		
		return element;
		}
		
		// <input required="" placeholder="" id="accordion2Text" class="form-control" type="text">
		
		public static WebElement accordion2TextInput(WebDriver driver) {
			
			element = driver.findElement(By.id("accordion2Text"));
		
		return element;
		}
		
		// <button type="button" name="accordionMessageButton" class="btn btn-success">Show Accordion Message</button>
		
		public static WebElement accordionMessageButtont(WebDriver driver) {
			
			element = driver.findElement(By.name("accordionMessageButton"));
		
		return element;
		}
}
