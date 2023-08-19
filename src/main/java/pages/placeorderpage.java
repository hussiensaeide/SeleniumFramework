package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class placeorderpage  extends pagebase{

	public placeorderpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Log in")
	WebElement loginlink;
		public void opensignuppage() {
	     clickbutton(loginlink);	
	     }
		@FindBy(id = "loginusername")
		 WebElement username;
			@FindBy(id ="loginpassword")
			WebElement password ;
			@FindBy(xpath =   "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
			WebElement loginbtn;
			

			public void userSignUp(String name , String pass) {
				username.sendKeys(name);
				password.sendKeys(pass);
				clickbutton(loginbtn);
		
			}
			@FindBy(id  = "cartur")
			WebElement cartpage;
			public void gotocartpage() {
				clickbutton(cartpage);
			}
			@FindBy(xpath =  "//*[@id=\"page-wrapper\"]/div/div[2]/button")
			WebElement place;
			public void placeorderbtn() {
				clickbutton(place);
			}

}
