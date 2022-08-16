package BatchNo30_BaseClass;

import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import BatchNo30_Constants.Constant;
import BatchNo30_Reports.Reports;
import BatchNo30_Utility.ExcelUtils;
import BatchNo30_Utility.Utility;



public class BaseClass {
	
	public static Properties prop_config;
	public static Properties prop_loct;
	
	@BeforeSuite
	public void intiliaseFiles()
	{		
		DOMConfigurator.configure("log4j.xml");
		prop_config = Utility.LoadProperty(Constant.config_path);
		prop_loct =   Utility.LoadProperty(Constant.locaters_path);
		ExcelUtils.invokeExcel(Constant.TestData_excel_path);	
	
	}
	
	@AfterTest
	public void FLushReports()
	{
		Reports.flush();
	}  

}
