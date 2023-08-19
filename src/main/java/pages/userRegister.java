package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userRegister extends pagebase
{

	public userRegister(WebDriver driver) {
		super(driver);
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
	
}
