package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorValidations {
public static void chrome() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
	
		driver.findElement(By.xpath("//*[@id=\"eLoginNew\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pLogin\"]")).click();
		String error= driver.findElement(By.id("eLoginNew_err")).getText();
		System.out.println("the output is:"+error);
		boolean result=error.equals("Please enter your Email ID / Username");
		System.out.println(" printing the result:"+result);
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
chrome();

	}

}
