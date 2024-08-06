package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_page {
	
	private static WebElement element = null;
	
	
	public static WebElement textbox_firstName(WebDriver driver) {
		
		element = driver.findElement(By.id("firstName"));
	
	return element;
	}
	
	public static WebElement textbox_lastName(WebDriver driver) {
		
		element = driver.findElement(By.id("lastName"));
	
	return element;
	}
	
	public static WebElement textbox_city(WebDriver driver) {
		
		element = driver.findElement(By.id("city_76"));
	
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

}
