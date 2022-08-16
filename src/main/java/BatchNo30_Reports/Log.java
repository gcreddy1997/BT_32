package BatchNo30_Reports;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {
	
	public static Logger logger = Logger.getLogger(Log.class.getName());
	
	public static int x =10;
	public static String y="Gcreddy";
	

	public static void startTest(String testCaseName) {
		DOMConfigurator.configure("log4j.xml");		
		logger.info(" ******************** "+   testCaseName   +"    *********************");
		logger.info(" ********************************************************************");	
	}
	
	public static void info(String message) {
		logger.info(message);
	}
	
	public static void pass(String message) {
		logger.info(message);
	}
	
	public static void error(String message) {
		logger.info(message);
	}
	
	public static void warn(String message) {
		logger.info(message);
	}
	
	public static void fatal(String message) {
		logger.info(message);
	}
	
	public static void endTest() {
		
	}

	
		// TODO Auto-generated method stub
		
	}
	
	


