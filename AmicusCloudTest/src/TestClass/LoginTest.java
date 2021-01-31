/**
 * 
 */
package TestClass;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import base.TestBase;

/**
 * @author Admin
 *
 */
public class LoginTest extends TestBase {
	LoginPage login;
	HomePage home;
	
	
	@BeforeClass
	public void setup()
	{
		launchbrowser();		
		login=new LoginPage();
		home=new HomePage ();		
	}
	
	
	@Test
	public void VerifyLogin() {		
		login.VerifyLogin();		
		Assert.assertEquals(login.verifytitle(), "Amicus Cloud - Home");
	}
	
	@Test
	public void VerifyLogout() {		
		home.logout();
		Assert.assertEquals(home.verifytitle(), "Amicus Cloud");		
	}
	

}
