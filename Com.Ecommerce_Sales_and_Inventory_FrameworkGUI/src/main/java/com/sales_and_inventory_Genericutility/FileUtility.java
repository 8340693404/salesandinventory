package com.sales_and_inventory_Genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
public String getDataFromPropertiesFile(String key) throws Throwable {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\Com.Ecommerce_Sales_and_Inventory_FrameworkGUI\\ConfigAppData\\m_propertyfile.properties");
		
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		return data;
	
	}


}
