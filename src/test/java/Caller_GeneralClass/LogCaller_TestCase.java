package Caller_GeneralClass;

import org.testng.annotations.Test;

import BatchNo30_Reports.Log;


public class LogCaller_TestCase {
  @Test
  public void LogCaller() {
	  Log.startTest("Senior citizen 2 years 2 laksh");
	  Log.pass("Broswer invokes sucdessfully");
	  Log.pass("Banking application is invoked successfully");
	  Log.warn("The data which you are providng may not correct pls provide valid data");
	  Log.info("Fixed deposit button clicked ");
	  Log.info(" senior citizen button clicked" );
	  Log.info("Interest caluculation done for 2 years 2 laksh and total interest is 1200");
	  Log.info("Expected calucualated is 1200 and in application is also displaying 1200, hence test case is passed");
	  Log.info("Test case passed");
	  Log.endTest();
  }
}
