package firstAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	static WebDriver driver;
	  
	  public static void launching() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.edureka.co/");
		 Thread.sleep(1000);
		 driver.findElement(By.id("search-inp")).click();
		 driver.findElement(By.id("search-inp")).sendKeys("selenium");
		 
		 driver.findElement(By.id("autosearchload_top")).click();
		 Thread.sleep(2000);
		 
		 driver.quit();
	  }
	public static void main(String[] args) throws InterruptedException {
		launching();

	}

}
