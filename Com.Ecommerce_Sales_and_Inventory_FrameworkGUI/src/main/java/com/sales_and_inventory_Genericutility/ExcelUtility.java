package com.sales_and_inventory_Genericutility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	//read the data from excel
	
	public String getDataFromExcel(String sheetname,int rownum,int celnum) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\Com.Ecommerce_Sales_and_Inventory_FrameworkGUI\\AppCommonData\\Framework.xlsx");
		
		
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetname).getRow(rownum).getCell(celnum).getStringCellValue();
		wb.close();
		return data;
		 
		
	}
	
}
