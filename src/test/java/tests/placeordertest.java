package tests;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.placeorderpage;
import pages.userRegister;

public class placeordertest extends testbase {
	
	
	Homepage homeobject;
	userRegister signupobject;
	placeorderpage placeorderobject,placebtnobject;
	@Test(priority = 2)
	public void usercansighnup() {
		homeobject = new Homepage(driver);	
	    homeobject.opensignuppage();
		signupobject = new userRegister(driver);
		signupobject.userSignUp("HussienSaeid", "P@ssword123");
		
	}

	@Test(priority = 1)
	public void gotocart() {
		placeorderobject = new placeorderpage(driver);
		placeorderobject.gotocartpage();
	
	}
	@Test(priority = 3)
	public void placeorder() {
		placebtnobject = new placeorderpage(driver);
		placebtnobject.placeorderbtn();
	}

}
