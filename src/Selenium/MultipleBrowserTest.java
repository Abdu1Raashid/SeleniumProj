package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream file = new FileInputStream("/Users/raashidshaikh/Desktop/QA/SeleniumWorkSpace/SeleniumProject/src/prop.properties");

		Properties prop = new Properties();
		
		prop.load(file);
		
		String browser = prop.getProperty("Browser2");
		WebDriver driver;
		
		
		if(browser.equals("Firefox")){
			 driver = new FirefoxDriver();
			
		}
		else if(browser.equals("Chrome")) {
			 driver = new ChromeDriver();
		}
		else {
			 driver = new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
		
	}
		

}
