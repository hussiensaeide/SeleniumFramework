package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase {
	public static WebDriver driver ;
	

	@BeforeSuite
	public void startdriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.navigate().to("https://www.demoblaze.com/index.html");
		

	}

	@AfterSuite
	public void stopdriver() {
		driver.quit();
	}

	public boolean apply(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}
}
