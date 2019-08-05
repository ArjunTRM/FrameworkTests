package SeleniumJavaFramework.SeleniumJavaFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		//this capability only works in internet explorer
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		
		
		System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver(caps);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("abcd");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
	
	}

}
