package tests;

import org.testng.annotations.Test;

import pages.addtocartpage;
import pages.productpage;

public class addtocarttest extends testbase {

 addtocartpage addcartobject,cartobject,orderobject;
 productpage productobject ;
 @Test (priority = 1)
 public void gotoproduct() {
	 productobject = new productpage(driver);
	 productobject.goproductpage();
 }
 @Test(priority = 2)
  public void addcart() {
	  addcartobject = new addtocartpage(driver);
	 addcartobject.addtocart();
 }
 @Test(priority = 3)
 public void gotocartpage() {
	 cartobject = new addtocartpage(driver);
	 cartobject.cartpage();
 }
 @Test(priority = 4)
 public void order() {
	 orderobject=new addtocartpage(driver);
	 orderobject.placeorderbtn();
 }
}
