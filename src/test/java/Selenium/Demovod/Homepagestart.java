package Selenium.Demovod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Homepagestart extends Testbase {
	
	Homepage Homeobject;
	Logintwitter twitter;
	presstweetbtn press;
	tweetlength tweeet;
	add_GIF GIFs;
	tweet_neg neg1;
	
	@Test (priority = 0)
	public void gotologinoage() {
		
		Homeobject = new Homepage(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		Homeobject.gotosignpage();
		twitter = new Logintwitter(driver);
		twitter.logininfor("2ossfsad2", "Medo#test1234567");
	}
	
	
	@Test (priority = 1, enabled = true)
	public void emptytweet() {
		// check empty tweet is not posted
		press = new presstweetbtn(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		press.tweetbtnval(false);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}

	
	
	@Test (priority = 2, enabled = true)
	public void tweets() {
		
		// sending string with 279 characters
		tweeet = new tweetlength(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		tweeet.tweetingval("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		press = new presstweetbtn(driver);
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		press.tweetbtnval(true);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		tweeet.valmsg();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}
	
	
	@Test (priority = 3, enabled = true)
	public void tweet2() {
		// sending string with 280 characters
		tweeet = new tweetlength(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		tweeet.tweetingval("ssdsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		press = new presstweetbtn(driver);
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		press.tweetbtnval(true);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		
		
	}
	
	@Test(priority = 4,  enabled = true)
	public void tweets5() {
		tweeet = new tweetlength(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		tweeet.tweetingval("https://www.soundcloud.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		tweeet.thumbnail();
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		press = new presstweetbtn(driver);
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		press.tweetbtnval(true);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}
	
	@Test (priority = 5, enabled = true)
	public void tweets4() {
		
		// sending string with 279 characters
		tweeet = new tweetlength(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		tweeet.tweetingval("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		press = new presstweetbtn(driver);
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		press.tweetbtnval(true);
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		tweeet.valmsg();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@Test(priority = 6,enabled = true)
	public void tweet3() {
		// sending string with 281 characters
		tweeet = new tweetlength(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		tweeet.tweetingval("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		press = new presstweetbtn(driver);
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		press.tweetbtnval(false);
		
		
		
	}
	

	
	

}
