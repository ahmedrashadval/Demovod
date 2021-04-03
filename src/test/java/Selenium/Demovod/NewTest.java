package Selenium.Demovod;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	ChromeDriver driver = null;
	
  @Test
  public void f() throws InterruptedException {
	 
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(80);
		
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
