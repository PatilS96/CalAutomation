package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
		
	    public WebDriver driver;
	
		public WebDriver browserlaunch() throws IOException {
			
			 FileInputStream fis=new FileInputStream("C:\\Users\\Shubham\\eclipse-workspace\\Cal_Automation\\src\\main\\java\\Resources\\data.properties");
			 Properties prop=new Properties();
			 prop.load(fis);
			 
			 String browserName =prop.getProperty("browser");
			
			 if(browserName.equalsIgnoreCase("chrome") ) {
				 
				 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Desktop\\Chrome Driver");
				 WebDriverManager.chromedriver().setup();
			     driver = new ChromeDriver();
			 }
			 else if(browserName.equalsIgnoreCase("firefox")) {
				   
				   //FireFox code
				  }
			 else if(browserName.equalsIgnoreCase("Edge")) {
				   
				   //edge code
				  }
			else {
				   System.out.println("please select valid browser");
				  }
			      return driver;
			
		}
		

}


