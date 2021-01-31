/**
 * 
 */
package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

/**
 * @author Admin
 *
 */
public class HomePage extends TestBase {
	
	@FindBy(xpath="//i[contains(text(),'exit_to_app')]")
	WebElement logoutbtn;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void logout () {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbtn);		
	}
	public String verifytitle() {
		System.out.print(driver.getTitle());
		return driver.getTitle();
		
	}
	}
	


