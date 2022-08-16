package Caller_GeneralClass;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Credential_Passing {
  @Test
  public void Login() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.navigate().to("https://uibank.uipath.com/");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Properties prop = new Properties();
		prop.load(Credential_Passing.class.getClassLoader().getResourceAsStream("Credential.properties"));
		String uName = prop.getProperty("un");
		String pword = prop.getProperty("pw");
		System.out.println("user name is ==> "+uName);
		System.out.println("Password is -==> "+pword);
		
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(uName);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(pword);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		
		
	  
	  
  }
}
