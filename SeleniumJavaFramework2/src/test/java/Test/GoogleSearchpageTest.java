package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.GoogleSearchPageObject;

public class GoogleSearchpageTest {
private static	WebDriver driver=null;
	
public static void main(String[] args) {
	googleSearchTest();
	}

public static void googleSearchTest(){
	String projectPath=System.getProperty("user.dir");
	System.out.println(projectPath);
	System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
	 driver = new FirefoxDriver();
	//Create Object for page class
		GoogleSearchPageObject searchPageObj= new GoogleSearchPageObject(driver);
	//Refer Action methods
		driver.get("https://www.google.com/");
		searchPageObj.setTextInSearchBox("Automation");
		searchPageObj.clickSearchButton();
		driver.close();
	 }


}
