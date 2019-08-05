package Listeners;

import org.testng.annotations.Test;

import Pages.GoogleSearchPage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenerDemo {
	@Test
	public void test1(){
		System.out.println("I`m inside Test 1");
	}
	@Test
	public void test2(){
		System.out.println("I`m inside Test 2");
		
			String projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
			WebDriver driver = new FirefoxDriver();
			//goto google.com
			driver.get("https://www.google.com/");

			//enter text in search textbox
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step");
			driver.findElement(By.xpath("//input[@title='ws']")).sendKeys("Automation step");

			//close browser
			driver.close();
			System.out.println("Test completed Successfully");




		}
		@Test
		public void test3(){
			System.out.println("I`m inside Test 3");
		}
	}
