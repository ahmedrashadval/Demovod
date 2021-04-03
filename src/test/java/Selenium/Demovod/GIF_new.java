package Selenium.Demovod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class GIF_new extends Testbase {

	@Test (priority = 0)
	public void gotologinoage() {
		
		Homepage Homeobject = new Homepage(driver);
		Homeobject.gotosignpage();
		Logintwitter twitter = new Logintwitter(driver);
		twitter.logininfor("2ossfsad2", "Medo#test1234567");
	}
//	@Test(enabled = true)
//	public void gifpos() {
//		add_GIF GIFs = new add_GIF(driver);
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
//		GIFs.adding_GIF();
//	}
	
	
}
