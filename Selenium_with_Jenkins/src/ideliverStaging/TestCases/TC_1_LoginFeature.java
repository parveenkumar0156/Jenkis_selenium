package ideliverStaging.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ideliverStaging.Pages.LoginPage;
import ideliverStaging.base.DriverInstance;
import ideliverStaging.datagenerators.DataGenerator;

public class TC_1_LoginFeature extends DriverInstance {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataGenerator.class)
	public void tc_1_login(String userEmail, String UserPassword) throws IOException{
    LoginPage login=new LoginPage(driver);
    login.enterusername(userEmail);
    login.enterPassword(UserPassword);
    login.clickSignIn();
    System.out.println("Login success");
    }
	
	
}
	

