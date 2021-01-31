package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.TestBase;

public class LoginPage extends TestBase {
	
	
	


	
	@FindBy(id="tbEmail")
	WebElement username;
	@FindBy(id="tbPwd")
	WebElement password;
	
	@FindBy(id="btLogin")
	WebElement loginbtn;
	@FindBy(id="cbRememberMe")
	WebElement Checkbox1_remember;
	@FindBy(id="cbTimeToLive")
	WebElement Checkbox2_keepme;
	@FindBy(id="ddTimeToLive")
	WebElement TimeDropdown;
	@FindBy(xpath="(//div[@class='ui-dialog-buttonset'])/button[1]")
	WebElement dialog_continue;
	@FindBy(xpath="(//div[@class='ui-dialog-buttonset'])/button")
	List<WebElement> dialog;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void VerifyLogin( ) {
		
		username.sendKeys("jdee@ggqaj1.1law.pro");
		password.sendKeys("Password123$");
		Checkbox1_remember.click();
		Checkbox2_keepme.click();
		Select s=new Select((TimeDropdown));		 
		s.selectByVisibleText("2 days");
		loginbtn.click();
		
		if(dialog.size()>0) {
			dialog_continue.click();
		}
		
		
    }
	public String verifytitle() {
		System.out.print(driver.getTitle());
		return driver.getTitle();
		
	}
	
	
	
}
