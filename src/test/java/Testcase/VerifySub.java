package Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.pageobjects;
import Resources.Baseclass;

public class VerifySub extends Baseclass {
	@Test
	public void sub() throws IOException {
		
		browserlaunch();
        driver.get("https://www.calculator.net/");
		
		pageobjects pobj= new pageobjects(driver);
		
		pobj.clickNum2().click();
		pobj.clickNum3().click();
		pobj.clickNum4().click();
		pobj.clickNum8().click();
		pobj.clickNum2().click();
		pobj.clickNum3().click();
		pobj.clicksub().click();
		pobj.clicksub().click();
		pobj.clickNum2().click();
		pobj.clickNum3().click();
		pobj.clickNum0().click();
		pobj.clickNum9().click();
		pobj.clickNum4().click();
		pobj.clickNum8().click();
		pobj.clickNum2().click();
		pobj.clickNum3().click();
		pobj.clickequal().click();
	}

}
