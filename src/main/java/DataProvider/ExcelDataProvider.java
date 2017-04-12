package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb; 
	
	public ExcelDataProvider()
	{
		File src = new File("C:\\Users\\natal\\workspace\\LearnAutomation\\com.April12LearnAutomation.hybrid\\Application Test Data\\DataApp.xlsx");
	
		try {
			FileInputStream fis  = new FileInputStream(src);
			wb = new XSSFWorkbook(fis); 
		}
		
		catch (Exception e) 
		{
		
			e.printStackTrace();
		} 	
	}
	
	public String getData(String SheetName, int rowNummber, int CollumnNumber)
	{
		String data = wb.getSheet(SheetName).getRow(rowNummber).getCell(CollumnNumber).getStringCellValue(); 
		return data;
	}

	public String getDataBySheetIndex(int SheetNumber, int rowNummber, int CollumnNumber)
	{
		String data = wb.getSheetAt(SheetNumber).getRow(rowNummber).getCell(CollumnNumber).getStringCellValue(); 
		return data; 
	}
	
	
}
