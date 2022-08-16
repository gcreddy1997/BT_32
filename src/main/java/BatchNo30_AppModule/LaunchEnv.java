package BatchNo30_AppModule;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BatchNo30_BaseClass.BaseClass;
import BatchNo30_Constants.Constant;
import BatchNo30_Reports.Log;
import BatchNo30_Reports.Reports;
import BatchNo30_Utility.Utility;

	public class LaunchEnv extends BaseClass  {
		
	public static WebDriver driver;
	public static boolean flag;

	public static boolean LaunchBrowser(String Browser) throws InterruptedException {
		      flag = false;
		try {
			Browser = "chrome";
			Log.info("Launching browser " + Browser);
			Reports.info("Launching Browser","Launching browser : chrome");
			if (Browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", Constant.chromepath);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				Utility.waitImplicit();				
			}			
			flag = true;
			Reports.pass("LAunching browser chrome", "Successfully LAunched");
		} catch (Exception e) {
			Log.info("failing launching Browser");
				e.printStackTrace();
		}
		
		
		return flag;
	}	
	
//   ---------------------------------------------------------------------------		
		
	public static boolean launURL(String URL) throws InterruptedException {
		flag = false;
		try {
			driver.get(URL);
			Thread.sleep(1000);
			Log.info("Navigating to URL " + URL);
			Reports.pass("abc","abd");
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			driver.close();
		}
		
		return flag;
	}
	
	
	public static void closeSession() {
		Log.info("Closing session");
	Reports.info("Session closed","Session Successfully closed");
		driver.close();
	}
}
