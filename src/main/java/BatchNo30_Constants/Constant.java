package BatchNo30_Constants;

import BatchNo30_Utility.Utility;

public class Constant {
	
	public static final String TestData_excel_path = System.getProperty("user.dir")+"\\src\\test\\resources\\Test Data\\Project_Text_Data.xls.xlsx";
	
	public static final String locaters_path = System.getProperty("user.dir")+"\\src\\test\\resources\\Object Repository\\Locator.properties";
	
	public static final String config_path = System.getProperty("user.dir")+"\\src\\test\\resources\\Object Repository\\Config.properties";
	
	public static final String chromepath = System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe";
	
	public static final String log4jpath = System.getProperty("user.dir")+"\\log4j.xml";
	
	public static final String ReportsPath = System.getProperty("user.dir")+"\\Execution Reports\\"+Utility.getDate()+"\\"+Utility.getDatetime()+".html";
	

}
