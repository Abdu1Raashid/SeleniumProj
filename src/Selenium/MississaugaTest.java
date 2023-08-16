package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.mississauga.ca/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
	
		Thread.sleep(1000);
		List<WebElement> ourOrganization = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']//a"));
	//different xpath=//ul[@class='main-nav-links']/li[3]//lin
		
		System.out.println(ourOrganization.size());
		for(WebElement count: ourOrganization) {
			System.out.println(count.getText());
		}
		
		Thread.sleep(1000);
		
		driver.close();
	}

}
