package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageobjects {
	
	public WebDriver driver;
	
	private By Num1= By.xpath("//span[@onclick='r(1)']");
	private By Num2= By.xpath("//span[@onclick='r(2)']");
	private By Num3= By.xpath("//span[@onclick='r(3)']");
	private By Num4= By.xpath("//span[@onclick='r(4)']");
	private By Num5= By.xpath("//span[@onclick='r(5)']");
	private By Num6= By.xpath("//span[@onclick='r(6)']");
	private By Num7= By.xpath("//span[@onclick='r(7)']");
	private By Num8= By.xpath("//span[@onclick='r(8)']");
	private By Num9= By.xpath("//span[@onclick='r(9)']");
	private By Num0= By.xpath("//span[@onclick='r(0)']");
	private By Mul= By.xpath("//span[contains(text(),'×')]");
	private By Div= By.xpath("(//span[contains(text(),'/')])[2]");
	private By Add= By.xpath("(//span[contains(text(),'+')])[1]");
	private By Sub= By.xpath("//span[contains(text(),'–')]");
	private By Equal= By.xpath("//span[contains(text(),'=')]");
	
	public pageobjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement clickNum1() {
		
		return driver.findElement(Num1);
	}
	
public WebElement clickNum2() {
		
		return driver.findElement(Num2);
	}

public WebElement clickNum3() {
	
	return driver.findElement(Num3);
}

public WebElement clickNum4() {
	
	return driver.findElement(Num4);
}

public WebElement clickNum5() {
	
	return driver.findElement(Num5);
}

public WebElement clickNum6() {
	
	return driver.findElement(Num6);
}

public WebElement clickNum7() {
	
	return driver.findElement(Num7);
}

public WebElement clickNum8() {
	
	return driver.findElement(Num8);
}

public WebElement clickNum9() {
	
	return driver.findElement(Num9);
}

public WebElement clickNum0() {
	
	return driver.findElement(Num0);
}

public WebElement clickmul() {
	
	return driver.findElement(Mul);
}

public WebElement clickdiv() {
	
	return driver.findElement(Div);
}

public WebElement clickadd() {
	
	return driver.findElement(Add);
}

public WebElement clicksub() {
	
	return driver.findElement(Sub);
}
public WebElement clickequal() {
	
	return driver.findElement(Equal);
}

}
