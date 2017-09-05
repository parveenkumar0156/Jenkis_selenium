package ideliverStaging.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import ideliverStaging.utilities.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverInstance {
    public WebDriver driver;
    @BeforeMethod
	public void initiateDriver() throws IOException{
		if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("IE")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else{
			System.setProperty("webdriver.ie.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get(Utility.fetchProperty("applicationURL").toString());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	} 
    
    @AfterMethod
    public void closeDriver(){
		driver.quit();
	}
}
