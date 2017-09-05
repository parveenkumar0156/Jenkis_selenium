package ideliverStaging.datagenerators;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	@DataProvider(name="LoginData")
	public static Object[][] testDataGenerator(Method mymthod) throws IOException{
		if(mymthod.getName().equalsIgnoreCase("tc_1_login")){
		FileInputStream file=new FileInputStream("./TestData/LoginData.xls");
	    HSSFWorkbook workbook=new HSSFWorkbook(file);
	    HSSFSheet loginsheet=workbook.getSheet("Login");
	    int numberofData=loginsheet.getPhysicalNumberOfRows();
	    Object[][] testData=new Object[numberofData][2];
	    for(int i=0;i<numberofData;i++)
	    {
	    	HSSFRow row=loginsheet.getRow(i);
	    	HSSFCell userEmail=row.getCell(0);
	    	HSSFCell UserPassword=row.getCell(1);
	    	testData[i][0]=userEmail.getStringCellValue();
	    	testData[i][1]=UserPassword.getStringCellValue();
	    }
		return testData;
		}
		
	else if(mymthod.getName().equalsIgnoreCase("tc_2_signup")){
		FileInputStream file=new FileInputStream("./TestData/LoginData.xls");
	    HSSFWorkbook workbook=new HSSFWorkbook(file);
	    HSSFSheet loginsheet=workbook.getSheet("Signup");
	    int numberofData=loginsheet.getPhysicalNumberOfRows();
	    Object[][] testData=new Object[numberofData][3];
	    for(int i=0;i<numberofData;i++)
	    {
	    	HSSFRow row=loginsheet.getRow(i);
	    	HSSFCell userFName=row.getCell(0);
	    	HSSFCell userLName=row.getCell(1);
	    	HSSFCell userSignupEmail=row.getCell(2);
	    	testData[i][0]=userFName.getStringCellValue();
	    	testData[i][1]=userLName.getStringCellValue();
	    	testData[i][2]=userSignupEmail.getStringCellValue();
	    }
		return testData;
		
	}
	else{
		Object[][] testData=new Object[2][3];
		return testData;
	}
	}
}
