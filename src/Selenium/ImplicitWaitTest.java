package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		//Actions
		driver.findElement(By.linkText("Create new account")).click();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		driver.findElement(By.name("firstname")).sendKeys("Bruce");
			
		driver.findElement(By.name("lastname")).sendKeys("Lee");
		
		driver.findElement(By.name("reg_email__")).sendKeys("989823112");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Pass");
		
		driver.findElement(By.name("websubmit")).click();
		
		//driver.findElement(By.linkText("Sign Up")).click();
		

		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(Month);
		
		WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(Date);
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select(Year);
		
		m.selectByIndex(6);
		d.selectByIndex(9);
		y.selectByValue("2020");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.name("wesubmit")).click();
		
		
	//	Thread.sleep(1000);
			
			
		driver.close();
		
		
		
	}

}
