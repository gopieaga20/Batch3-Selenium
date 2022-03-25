package org.test.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	 public  static WebDriver driver;

	 public String read_data(String sheetName, int rowNo, int cellNo) throws IOException {
		 File file = new File("D:\\BasicJava\\SeleniumProject\\Excel\\TestData.xlsx");
		 FileInputStream fs = new FileInputStream(file);
		 Workbook wb = new XSSFWorkbook(fs);
		 Sheet getSheet = wb.getSheet(sheetName);
		 Row row = getSheet.getRow(rowNo);
		 Cell cell = row.getCell(cellNo);
		 CellType cellType = cell.getCellType();
			String data=null;
			switch (cellType) {
			case STRING:
				data = cell.getStringCellValue();
				System.out.println(data);
				
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cell)) {
					
				Date d = cell.getDateCellValue();
				SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MMM-yy");
				data =dateFormat.format(d);
					
				double numericcellvalue = cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(numericcellvalue);
				data = b.toString();
				System.out.println(data);
			}
			break;
			default:
			break;
	}
			FileOutputStream stream2 = new FileOutputStream(file);
			wb.write(stream2);
			return data;
	 }
}
