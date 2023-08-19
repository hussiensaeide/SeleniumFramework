package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends pagebase
{

	public Homepage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Log in")
WebElement loginlink;
	public void opensignuppage() {
     clickbutton(loginlink);	
     }

}
