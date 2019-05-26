package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {
	
	public static void main(String[] args) throws InterruptedException {
  
	 // Initializing the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
	
		// WebDriver is an interface used to call the ChromeDriver 	
		
		WebDriver driver= new ChromeDriver();// Hey webdriver open up the chrome driver and do this 
		
		driver.get("https://www.facebook.com/");
		
		// using getAttribute() method to retrieve the data entered in the text box and gettin
		WebElement name= driver.findElement(By.name("firstname"));
		name.sendKeys("rajesh");
	    WebElement name1= driver.findElement(By.name("firstname"));
	    System.out.println(name1.getAttribute("value"));
	    // getting other than the value attribute
	   // System.out.println(name1.getAttribute("name"));
	    
	     
	  
	   
	    
		driver.close();
		
		
		
  
	}

}
