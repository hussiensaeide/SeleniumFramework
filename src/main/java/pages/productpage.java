package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productpage extends pagebase {

	public productpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Samsung galaxy s6")
	WebElement product;
	public void goproductpage() {
		
	clickbutton(product);
	}

}
