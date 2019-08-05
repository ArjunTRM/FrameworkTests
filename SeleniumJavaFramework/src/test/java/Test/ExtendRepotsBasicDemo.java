package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendRepotsBasicDemo {
	private static WebDriver driver =null;

	public static void main(String[] args) {
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test2 = extent.createTest("Google Search Test Two","This is a test to validate the google search functionality");


		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
		driver = new FirefoxDriver();

		// log(Status, details)
		test2.log(Status.INFO, "Starting Test Case");

		driver.get("https://www.google.com/");
		test2.pass("Naviagted to Google");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Auto");
		test2.pass("Entered text in searchbox");

		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
		test2.fail("Press Keyboard enter key");

		driver.close();
		test2.pass("Close the Browser");
		test2.info("Test completed");

		// calling flush writes everything to the log file
		extent.flush();
	}

}
