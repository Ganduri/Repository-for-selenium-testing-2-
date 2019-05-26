package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	
	public static void chrome() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		// open AUT- Application under test
		driver.get("https://www.facebook.com/");
		
		
		// id locator
		
		driver.findElement(By.id("u_0_j")).sendKeys("rajesh");
				
		// name locator
		driver.findElement(By.name("lastname")).sendKeys("ganduri");
		
		//class name
		driver.findElement(By.className("inputtext")).sendKeys("9100234412");
		
		// link Text
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		// partial text
		//driver.findElement(By.partialLinkText("acc")).click();
		
		// navigating driver back
		
	//driver.navigate().back();
	
		
		// css selector
	    driver.findElement(By.cssSelector("#u_0_a")).click();
	    Thread.sleep(1000);
	    
	    List<WebElement> num= driver.findElements(By.tagName("a"));
	    System.out.println(num.size());
	    
	
				
		 
		driver.quit();
	}
	
	public static void firefox() throws InterruptedException {
		
		 System.setProperty("webdriver.gecko.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			// id locator
			
			driver.findElement(By.id("u_0_j")).sendKeys("rajesh");
		
			// name locator
			driver.findElement(By.name("lastname")).sendKeys("ganduri");
			 
			// class name
			driver.findElement(By.className("inputtext")).sendKeys("9100234412");
			
			// link Text
			//driver.findElement(By.linkText("Forgotten account?")).click();
			
			// partial text
			//driver.findElement(By.partialLinkText("acc")).click();
			
		

			
		// css selector
	    driver.findElement(By.cssSelector("#u_0_a")).click();
					
			 
			driver.quit();
		
	}


	public static void main(String[] args) throws InterruptedException {
		
	chrome();
	//firefox();
	
		
		
		
		
				
		

	}

}
