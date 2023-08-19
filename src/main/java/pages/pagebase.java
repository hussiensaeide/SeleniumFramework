package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pagebase {
	protected WebDriver driver;
//create constructor 
	public pagebase(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	protected static void clickbutton(WebElement button) {
		button.click();
	}
}
