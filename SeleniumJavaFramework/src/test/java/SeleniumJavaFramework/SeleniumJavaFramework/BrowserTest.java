package SeleniumJavaFramework.SeleniumJavaFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
 public static void main(String[] args) {
String projectPath=System.getProperty("user.dir");
System.out.println(projectPath);
System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	
	WebElement Textbox=driver.findElement(By.xpath("//input[@title='Search']"));
	Textbox.sendKeys("Auto");
	List <WebElement> Inputs=driver.findElements(By.xpath("//input"));
	System.out.println(	Inputs.size());
}
}
