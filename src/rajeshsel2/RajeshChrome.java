package rajeshsel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class RajeshChrome {

	 static WebDriver driver;
	  
	  public static void launching() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.youtube.com/watch?v=VQTx4eswiFY");
		Thread.sleep(6000);
		 driver.quit();
	  }
	  
	  public static void launching1() {
			 System.setProperty("webdriver.gecko.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			driver.manage().window().maximize();
			 driver.get("https://www.youtube.com/watch?v=VQTx4eswiFY");
			 System.out.println("the title of the webpage is:"+driver.getTitle());
			 driver.quit();
			 
		  }
	  
	  public static void launching2() throws InterruptedException {
			 System.setProperty("webdriver.ie.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\all browser driver files\\IEDriverServer.exe");
			WebDriver driver =new InternetExplorerDriver();
			driver.manage().window().maximize();
			 driver.get("https://www.youtube.com/watch?v=VQTx4eswiFY");
			 Thread.sleep(6000);
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.quit();
		  }
	  
	  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launching();
		//launching1();
		launching2();
	}

}
