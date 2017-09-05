package ideliverStaging.TestCases;

import ideliverStaging.Pages.LoginPage;
import ideliverStaging.Pages.SignUpPage;
import ideliverStaging.base.DriverInstance;
import ideliverStaging.datagenerators.DataGenerator;

import java.io.IOException;

import org.testng.annotations.Test;

public class TC_2_Signup extends DriverInstance {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataGenerator.class)
	public void tc_2_signup(String Fname, String Lname, String signupEmail ) throws IOException{
	SignUpPage signup=new SignUpPage(driver);
	signup.enterFirstname(Fname);
	signup.enterLastname(Lname);
	signup.enterEmail(signupEmail);
  
    }
}
