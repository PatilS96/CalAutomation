package Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.pageobjects;
import Resources.Baseclass;

public class VerifyDiv extends Baseclass {
	
	@Test
	public void div() throws IOException {
		
		browserlaunch();
        driver.get("https://www.calculator.net/");
		
		pageobjects pobj= new pageobjects(driver); 
		
		pobj.clickNum4().click();
		pobj.clickNum0().click();
		pobj.clickNum0().click();
		pobj.clickNum0().click();
		pobj.clickdiv().click();
		pobj.clickNum2().click();
		pobj.clickNum0().click();
		pobj.clickNum0().click();
		pobj.clickequal().click();
		
		
	}
	
	
	
	

}
