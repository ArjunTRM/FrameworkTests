package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver =null;
	
	By textbox_search =By.xpath("//input[@title='Search']");
	By button_search= By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']");
	
//create a constructor for keeping driver 
	public GoogleSearchPageObject(WebDriver driver){
		this.driver =driver;
	}
	
	public void setTextInSearchBox(String Text){
		driver.findElement(textbox_search).sendKeys(Text);
	}
	
	public void clickSearchButton(){
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
	}

}
