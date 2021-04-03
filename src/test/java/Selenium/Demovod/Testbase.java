package Selenium.Demovod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Testbase {
	
	public static WebDriver driver;
	
	Signout sign;
	@BeforeSuite
	public void startdriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		driver.get("https://Twitter.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}

	
	@AfterSuite
	public void stopdriver() {
		
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	//sign = new Signout(driver);
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//	sign.logout();
		driver.quit();
	}
}
