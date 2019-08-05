package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook Workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath,String SheeName){
		//Constructor
		try {
			Workbook= new XSSFWorkbook(excelPath);
			sheet= Workbook.getSheet(SheeName);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	public static int getRowCount(){
		int rowCount =0;
		try {
			rowCount= sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+rowCount);

		} catch (Exception e) {
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return rowCount;
	}
	public static String getCellDataString(int rowNum, int colNum){
		String cellData=null;
		try {

			cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//	System.out.println("String Value: "+cellData);
		} catch (Exception e) {
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return cellData;
	}
	
	public static void getCellDataNum(int rowNum, int colNum){

		try {
			double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Numerical Value: "+cellData);
		} catch (Exception e) {
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static int getColCount(){
		int colCount =0;
		try {
			colCount =sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Column: "+ colCount);
		} catch (Exception e) {
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return colCount;
	}
}