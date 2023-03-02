package Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.pageobjects;
import Resources.Baseclass;

public class VerifyAdd extends Baseclass {
	@Test
	public void add() throws IOException {
		
		browserlaunch();
        driver.get("https://www.calculator.net/");
		
		pageobjects pobj= new pageobjects(driver);
		
		pobj.clicksub().click();
		pobj.clickNum2().click();
		pobj.clickNum3().click();
		pobj.clickNum4().click();
		pobj.clickNum2().click();
		pobj.clickNum3().click();
		pobj.clickNum4().click();
		pobj.clickadd().click();
		pobj.clickNum3().click();
		pobj.clickNum4().click();
		pobj.clickNum5().click();
		pobj.clickNum3().click();
		pobj.clickNum4().click();
		pobj.clickNum5().click();
		pobj.clickequal().click();
	}

}
