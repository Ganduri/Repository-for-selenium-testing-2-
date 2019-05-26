package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

public static void chrome() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\study\\Edureka selenium\\selenium\\Installation stuff\\exe files\\all browser drivers\\chromedriver_win32(2.46 version)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String apTitle= driver.getTitle();
		System.out.println(" the webpage title is :" +apTitle);
		if(apTitle.equalsIgnoreCase("google")) {
			System.out.println("the title is Correct ");
			
		}
		else {
			System.out.println("the title is incorrect");
		}
		
		driver.quit();
}

	public static void main(String[] args) throws InterruptedException {
		
chrome();
	}

}
