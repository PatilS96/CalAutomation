package Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.pageobjects;
import Resources.Baseclass;

public class VerifyMul extends Baseclass {
	@Test
	public void mul() throws IOException, InterruptedException {
		
		browserlaunch();
		driver.get("https://www.calculator.net/");
		
		pageobjects pobj= new pageobjects(driver);
		
		pobj.clickNum4().click();
		pobj.clickNum2().click();
		pobj.clickNum3().click();
		pobj.clickmul().click();
		pobj.clickNum5().click();
		pobj.clickNum2().click();
		pobj.clickNum5().click();
		pobj.clickequal().click();
		
		
	}

}
