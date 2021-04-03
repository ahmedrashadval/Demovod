package Selenium.Demovod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class add_GIF extends Pagebase {

	public add_GIF(WebDriver driver) {
		super(driver);
		
	}
@FindBy(css="input.file-input")
WebElement gifmain;

//@FindBy(xpath="//span[text()='Agree']")
//WebElement gifgroup1;

//@FindBy(xpath="//div[@class='css-1dbjc4n r-1mlwlqe r-smjest r-1udh08x r-1xy5wl5 r-417010']//div[@class='css-1dbjc4n r-1niwhzg r-vvn4in r-u6sd8q r-4gszlv r-1p0dtai r-1pi2tsx r-1d2f490 r-u8s1d r-zchlnj r-ipm5af r-13qz1uu r-1wyyakw']")
//WebElement gif;
	
	public void adding_GIF() {
		
		gifmain.click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
//		gifgroup1.click();
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
//		gif.click();
	}
}
