package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

public static void chrome() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	  WebElement checkbox=  driver.findElement(By.id("sex-0"));
	boolean result=  checkbox.isDisplayed();
    System.out.println("the result is:"+result);
   
    driver.findElement(By.id("sex-0")).click();
	boolean result1=  checkbox.isSelected();
	 System.out.println("the result is:"+result1);	
		
		Thread.sleep(1000);
		driver.quit();
		
		
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
chrome();

	}

}
