package Utils;

public class ExcelUtilsDemo {
	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		ExcelUtils excel =new ExcelUtils(projectPath+"/Excel/WorkBook.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(1,0);
		excel.getCellDataNum(1, 1);
		
	
	}
}
