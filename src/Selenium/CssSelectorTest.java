package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

FirefoxDriver driver = new FirefoxDriver();
		
		//URL
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("sdfsdgsadgsafdg");
		driver.findElement(By.cssSelector("#pass")).sendKeys("password");
			driver.findElement(By.cssSelector("button[class^='_42']")).click();
			
			
			Thread.sleep(1000);
			
			driver.close();
	}

}
