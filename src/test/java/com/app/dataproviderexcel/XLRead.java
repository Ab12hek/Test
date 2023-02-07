package com.app.dataproviderexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.asynchttpclient.util.DateUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XLRead {
		
		@Test(dataProvider = "test")
		
	    public void exe(String value1,String value2) {
			System.out.println(value1);
			System.out.println(value2);
		}
		
		
		@DataProvider(name="test")
		public Object[][] exceldata(){
			Object[][] excelread = null;
			try {
				excelread = excelread("Sheet1");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return excelread;
			
		}

		public Object[][] excelread(String sheetname) throws IOException {

			String[][] data = null;
			String path = "C:\\\\Users\\\\Abishek\\\\eclipse-workspace\\\\Task_17122022\\\\src\\\\test\\\\resources\\\\Data\\\\Test Data.xlsx";
			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row row = sh.getRow(0);
			int noofrow = sh.getPhysicalNumberOfRows();
			short lastCellNum = row.getLastCellNum();
			Cell cell;
			data = new String[noofrow][lastCellNum];
			for (int i = 0; i < noofrow; i++) {
				for (int j = 0; j < lastCellNum; j++) {
					row = sh.getRow(i);
					cell = row.getCell(j);
					int cellType = cell.getCellType();
					if (cellType == 1) {
						data[i][j] = cell.getStringCellValue();
						System.out.println(data[i][j]);
					} else if (cellType == 0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							SimpleDateFormat s = new SimpleDateFormat("MM//dd//yyyy");
							data[i][j] = s.format(dateCellValue);
							System.out.println(data[i][j]);
						} else {
							double numericCellValue = cell.getNumericCellValue();
							long l = (long) numericCellValue;
							data[i][j] = String.valueOf(l);
							System.out.println(data[i][j]);

						}

					}

				}

			}
			return data;
		}
}