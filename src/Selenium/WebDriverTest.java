package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		
		
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
