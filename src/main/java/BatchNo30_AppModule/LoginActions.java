package BatchNo30_AppModule;

import BatchNo30_Reports.Log;
import BatchNo30_Reports.Reports;
import BatchNo30_Utility.Utility;

public class LoginActions extends Utility {

	public static boolean login(String username, String password) {
		boolean flag = false;

		try {
			Log.info("LoginActions");
			Utility.getLocator("Homepage_userName_txtBox_id").sendKeys(username);
			Utility.getLocator("HomePage_password_txtBox_name").sendKeys(password);
			Utility.getLocator("Homepage_submit_button_xpath").click();
			flag = true;
			Log.info("Login actions complted successfully");
			Reports.pass("Login Actions", "Login Actions done successfully");

		} catch (Exception e) {
			Log.info("Login actions faild due to " + e.fillInStackTrace().toString());
			Reports.fail("Login Actions", "Login Actions failed due to :" + e.toString(), "");
		}

		return flag;
	}

}
