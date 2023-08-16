
package Selenium;

//import statements
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClassTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//Creation of object for firefox driver.
		FirefoxDriver driver = new FirefoxDriver();
		
		//Opening the expected URL
		driver.get("https://www.facebook.com");
		
		//Actions
		driver.findElement(By.id("email")).sendKeys("Name");
		driver.findElement(By.id("pass")).sendKeys("ss");
		driver.findElement(By.className("login")).click();
		

		
//		Thread.sleep(1000);
//		driver.close();
	}
}
