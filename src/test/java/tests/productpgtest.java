package tests;

import org.testng.annotations.Test;

import pages.productpage;

public class productpgtest  extends testbase{
	productpage productobject ;
	 @Test
	 public void gotoproduct() {
		 productobject = new productpage(driver);
		 productobject.goproductpage();
	 }

}
