package ideliverStaging.Assertions;

import org.openqa.selenium.WebDriver;

public class Compare {
	
	public static boolean verifyPageURL(WebDriver driver, String expURL){
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL)){
			flag=true;
		}
		return flag;
	}
	public static boolean verifyPageTitle(WebDriver driver, String expTitle){
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase(expTitle)){
			flag=true;
		}
		return flag;
	}

}
