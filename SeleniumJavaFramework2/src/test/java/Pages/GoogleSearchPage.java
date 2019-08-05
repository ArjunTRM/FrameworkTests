package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	private static WebElement element=null;
public static WebElement textbox_search(WebDriver driver){
	 element=driver.findElement(By.xpath("//input[@title='Search']"));
	 return element;
	}
	public static WebElement button_Search(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
		return element;
	}
	public static WebElement orangeuserName(WebDriver driver){
		element=driver.findElement(By.id("txtUsername"));
		return element;
		
	}
	public static WebElement orangePassword(WebDriver driver){
		element=driver.findElement(By.id("txtPassword"));
		return element;
		
	}
	
}
