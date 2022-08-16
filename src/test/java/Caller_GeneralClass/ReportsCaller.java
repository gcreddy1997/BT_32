package Caller_GeneralClass;

import org.testng.annotations.Test;

import BatchNo30_Reports.Reports;

public class ReportsCaller {
  @Test
  public void infoMethod() throws InterruptedException {
	  Reports.startTest("Vishwanth", "Vishwanth test case is executing");
	  Reports.info("Stepno.1", "Info method is calling here");
	  Thread.sleep(2000);
	  Reports.endTest();
  }
  
  @Test
  public void passmethod() throws InterruptedException {
	  Reports.startTest("RajuGoud", "RajuGoud test case is executing");
	  Reports.info("Stepno.1", "info method is calling here");
	  Reports.pass("StepNo 2","Pass test step is executing");
	  Thread.sleep(2000);
	  Reports.endTest();
  }
  
  @Test
  public void failmethod() throws InterruptedException {
	  Reports.startTest("Vandana", "Vandana test case is executing");
	  Reports.info("Stepno.1", "Info method is calling here");
	  Reports.pass("StepNo 2","Pass test step is executing");
	  Reports.fail("StepNo 2","fail test step is executing","image.png");
	  Thread.sleep(2000);
	  Reports.endTest();
  } 
  
  @Test
  public void warnMethod() throws InterruptedException {
	  Reports.startTest("Shivani", "Shivani test case is executing");
	  Reports.info("Stepno.1", "Info method is calling here");
	  Reports.pass("StepNo 2","Pass test step is executing");
	  Reports.warn("StepNo 2","warn test step is executing");
	  Reports.endTest();
	  Thread.sleep(2000);	
  }
  
  @Test
  public void fatalMethod() throws InterruptedException {
	  Reports.startTest("divya", "divaya test case is executing");
	  Reports.info("Stepno.1", "Info method is calling here");
	  Reports.pass("StepNo 2","Pass test step is executing");
	  Reports.fatal("StepNo 2","fatal test step is executing");
	  Reports.endTest();
	  Thread.sleep(2000);
	  Reports.flush();
	 
  }
  
  
  
}
