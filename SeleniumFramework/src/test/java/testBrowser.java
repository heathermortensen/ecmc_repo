import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBrowser {
	
	//type "main" + CTL + SpaceBar to auto fill
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://interview-app-plum.vercel.app/");
		
	}

}
