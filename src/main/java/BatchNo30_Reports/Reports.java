package BatchNo30_Reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {
	
	public static ExtentReports reports = new ExtentReports("alisha.html",false);
	public static ExtentTest test;
	
	public static void startTest(String TestCaseName, String Description) {
		test = reports.startTest(TestCaseName, Description);
		test.assignAuthor("Rahul");
		test.assignCategory("Regression");
		addSystemInfo();		
	}
		
	public static void info(String StepName, String details) {
		test.log(LogStatus.INFO,StepName, details);
	}
	
	public static void pass(String StepName, String details) {
		test.log(LogStatus.PASS,StepName, details);
	}
	
	public static void fail(String StepName, String details,String Imagepath) {
		test.log(LogStatus.FAIL, StepName, "<Span style ='font-weight:bold; color: red'>"+ details+"</span"+test.addScreenCapture(Imagepath));
	}
	
	public static void warn(String stepName, String details) {
		test.log(LogStatus.WARNING, stepName, "<Span style ='font-weight:bold; color: brown'>"+ details+"</span>");		
	}
	
	public static void fatal(String stepName, String details) {
		test.log(LogStatus.FATAL, stepName, details);
	}
	
	public static void endTest() {
		reports.endTest(test);
	}
	
	public static void flush() {
		reports.flush();
		
	}
	
		
	public static void addSystemInfo() {
		Map<String, String>sysInfo = new HashMap<String,String>();// creating an object
		sysInfo.put("Selenium Version", "3.141.0");
		reports.addSystemInfo(sysInfo);
	}
	

}
