package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	static WebDriver driver =null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	public static void googlesearch(){
	String projectPath=System.getProperty("user.dir");
	System.out.println(projectPath);
	System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
	 driver = new FirefoxDriver();
	//goto google.com
	driver.get("https://www.google.com/");
	
	//enter text in search textbox
	//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step");
	GoogleSearchPage.textbox_search(driver).sendKeys("Automation");
	
	//Click on the Search
	//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
	GoogleSearchPage.button_Search(driver).click();
	
	//close browser
	driver.close();
	System.out.println("Test completed Successfully");
	
}
}
