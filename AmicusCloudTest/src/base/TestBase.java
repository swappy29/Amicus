package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://cloud.amicusattorney.com/Registration/HTML/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
}
