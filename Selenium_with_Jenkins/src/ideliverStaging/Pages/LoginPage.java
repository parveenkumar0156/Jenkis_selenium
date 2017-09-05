package ideliverStaging.Pages;

import java.io.IOException;

import ideliverStaging.utilities.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
    	this.driver=driver;
    }
	public void enterusername(String uname) throws IOException{
		driver.findElement(By.id(Utility.fetchlocatorValue("login_email_id"))).sendKeys(uname);
	}
	
	public void enterPassword(String upass) throws IOException{
		driver.findElement(By.id(Utility.fetchlocatorValue("login_password_id"))).sendKeys(upass);
	}
	
	public void clickSignIn() throws IOException{
		driver.findElement(By.xpath(Utility.fetchlocatorValue("signbtn_xpath"))).click();
	}
}
