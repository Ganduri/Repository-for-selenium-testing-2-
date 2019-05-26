package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewDemoTours {

public static void chrome() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		driver.get("http://www.newtours.demoaut.com/");
		
		// User name entering through selenium
		
		driver.findElement(By.name("userName")).sendKeys("Rajesh");
		
		// Password field
		driver.findElement(By.name("password")).sendKeys("rajesh@3286");
		
		// clicking on the log in button
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("userName")).sendKeys("Rajesh");
		driver.findElement(By.name("password")).sendKeys("rajesh@3286");
		driver.findElement(By.name("login")).click();
		*/
		
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Rajesh");
		driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input")).sendKeys("Ganduri");		
		driver.findElement(By.name("phone")).sendKeys("9100234412");
		driver.findElement(By.id("userName")).sendKeys("rajeshganduri7@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(12) > td:nth-child(2) > select > option:nth-child(30)")).click();
		
		
		driver.quit();
		
		
		
}
	public static void main(String[] args) throws InterruptedException {
		chrome();
		

	}

}
