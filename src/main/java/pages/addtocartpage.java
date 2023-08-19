package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addtocartpage  extends pagebase{

	public addtocartpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText = "Add to cart")
	WebElement addcart;
	@FindBy(linkText = "Cart")
	WebElement cart ;
	@FindBy(linkText = "Place Order")
	WebElement placeorder;
	public void addtocart() {
		clickbutton(addcart);
	}
	public void cartpage() {
		clickbutton(cart);
	}
	public void placeorderbtn() {
		clickbutton(placeorder);
	}
	

}
