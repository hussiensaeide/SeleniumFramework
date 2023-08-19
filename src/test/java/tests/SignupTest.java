package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.userRegister;

public class SignupTest extends testbase {
	Homepage homeobject;
	userRegister signupobject;
	@Test
	public void usercansighnup() {
		homeobject = new Homepage(driver);	
	    homeobject.opensignuppage();
		signupobject = new userRegister(driver);
		signupobject.userSignUp("HussienSaeid", "P@ssword123");
		
	}
	

}
