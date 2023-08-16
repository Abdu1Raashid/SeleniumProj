package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Spiderman");
	
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("password");;
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		driver.close();

	}

}
