package Selenium.Demovod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class tweetlength extends Pagebase {

	public tweetlength(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(css = "br[data-text='true']")
	WebElement tweeting;
	
	//@FindBy(xpath = "//div[contains(text(),'Something went wrong, but don’t fret — let’s give it another shot.')]")
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div")
	WebElement valmsg;
	
	@FindBy(css = "div[data-testid='tweetButtonInline']")
	WebElement thumbnailassert;
	
	//@FindBy(xpath="//div[@aria-label='Tweet text']")
	//WebElement none;
	
	public void tweetingval(String t) {
	//	none.click();
		tweeting.sendKeys(t);
		
	}
	public void valmsg() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		boolean q = valmsg.isDisplayed();
		Assert.assertEquals(q, true);
		
	}
	
	public void thumbnail() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		boolean q = thumbnailassert.isDisplayed();
		Assert.assertEquals(q, true);
		
		
	}
	
}
