package ideliverStaging.Pages;

import ideliverStaging.utilities.Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	 WebDriver driver;
	    public SignUpPage(WebDriver driver){
	    	this.driver=driver;
	    }
		public void enterFirstname(String Fname) throws IOException{
			driver.findElement(By.id(Utility.fetchlocatorValue("signup_firstname_id"))).sendKeys(Fname);
		}
		public void enterLastname(String Lname) throws IOException{
			driver.findElement(By.id(Utility.fetchlocatorValue("signup_lastname_id"))).sendKeys(Lname);
		}
		public void enterEmail(String signupEmail) throws IOException{
			driver.findElement(By.id(Utility.fetchlocatorValue("signup_email_id"))).sendKeys(signupEmail);
		}
}
