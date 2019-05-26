package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	 static WebDriver driver;
	  
	  public static void launching() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 //  XPath 
		
		 driver.findElement(By.xpath("//*[@class='inputtext' and @name='email']")).sendKeys("rajesh");
		 
		 // Contains() Method
		 driver.findElement(By.xpath("//*[contains(@name,'pass')]")).sendKeys("rajesh@5078");
         
		 // Starts-with() Method
		 driver.findElement(By.xpath("//*[starts-with(@name,'firstname')]")).sendKeys("Ganduri");
		 Thread.sleep(2000);
		 driver.quit();
	  }

	public static void main(String[] args) throws InterruptedException {
		launching();
		

	}

}
