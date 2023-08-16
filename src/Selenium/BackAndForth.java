package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
	}

}
