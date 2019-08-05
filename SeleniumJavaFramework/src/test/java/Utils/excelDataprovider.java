package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.GoogleSearchPage;

public class excelDataprovider {
	WebDriver driver=null;
	@Test(dataProvider= "test1Data")
	public void test1(String Username,String Password){
		System.out.println(Username+"|"+Password);
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver");
		 driver = new FirefoxDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 GoogleSearchPage.orangeuserName(driver).sendKeys(Username);
		 GoogleSearchPage.orangePassword(driver).sendKeys(Password);
		driver.close();
	}



	@DataProvider(name ="test1Data")
	public Object[][] getData(){
		String excelPath ="/home/i-exceed.com/arjun.tr/workspace/SeleniumJavaFramework/Excel/WorkBook.xlsx";
		Object data[][]=testData(excelPath,"Sheet1");

		return data;
	}



	public static Object[][] testData(String excelPath,String SheeName){
		ExcelUtils excel =new ExcelUtils(excelPath, SheeName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		//for removing hearders we are using -1
		Object data[][] = new Object[rowCount-1][colCount];
		for (int i=1;i<rowCount;i++){
			for (int j=0;j<colCount;j++){
				String cellData=excel.getCellDataString(i,j);
				//System.out.print(cellData + "|");
				data[i-1][j]=cellData;


			}
		}
		return data;
	}
}
