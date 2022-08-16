package Uipath_Uibank_TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BatchNo30_AppModule.LaunchEnv;
import BatchNo30_AppModule.LoginActions;
import BatchNo30_Reports.Log;
import BatchNo30_Reports.Reports;
import BatchNo30_Utility.Utility;



// not provided any validation...
// without validation...  
public class LoginActions_Caller extends LoginActions {
	
@BeforeMethod
public static void launchEnv_Caller() throws InterruptedException, IOException {
	
	LaunchEnv.LaunchBrowser(prop_config.getProperty("Browser"));
	LaunchEnv.launURL(prop_config.getProperty("Uipath_Uibank_URL"));
	
}
	
  @Test
  public void LoignAcrtionsCaller() {
	  Reports.startTest("LoginActions", "description");
	  Log.startTest("Login Actions");
	  LoginActions.login(prop_config.getProperty("UserName"), prop_config.getProperty("Password"));
	  Log.endTest();
	  Reports.endTest();
  }
  
  @AfterMethod
  public void closingBrowser() throws IOException {
	  Utility.closeBrowser();
	 
	  
  }
}
