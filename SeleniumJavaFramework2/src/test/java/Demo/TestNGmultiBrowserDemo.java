package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGmultiBrowserDemo {
	WebDriver driver=null;
	String driverPath=System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName){
		System.out.println("Browser name is :"+browserName);
		System.out.println("Thread id:"+Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",driverPath+"/Driver/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.out.println("Selected chrome driver");
		}
		else if(browserName.equalsIgnoreCase("ie")){
			System.out.println("Selected IE driver");
		}
	}
	@Test
	public void test1() throws InterruptedException{

		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}
	@AfterTest
	public void tearDown(){

		driver.close();
		System.out.println("Test completed successfully");
	}
}
