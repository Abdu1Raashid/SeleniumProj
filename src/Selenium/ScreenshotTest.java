package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.mississauga.ca/");
		
		File ScreenshotAttempt = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenshotAttempt, new File("/Users/raashidshaikh/Desktop/QA/Screenshot.png"));
	
	}

}
