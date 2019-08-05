package Test;

import org.testng.annotations.Test;

import Config.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Pages.GoogleSearchPageObject;

public class TestNGDemo {
	WebDriver driver=null;
	public static String browserName=null;

	@BeforeTest

	public void LaunchBrowser(){
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("Chrome")){
			String projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){

			String projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}

	}

	@Test
	public void googleSearchTest(){
		//Create Object for page class
		GoogleSearchPageObject searchPageObj= new GoogleSearchPageObject(driver);
		//Refer Action methods
		driver.get("https://www.google.com/");
		searchPageObj.setTextInSearchBox("Automation");
		searchPageObj.clickSearchButton();
	}
	@AfterTest
	public void tearDownTest(){

		driver.close();
		//driver.quit();
		System.out.println("Tested successfully");
		PropertiesFile.setProperties();
	}

}
