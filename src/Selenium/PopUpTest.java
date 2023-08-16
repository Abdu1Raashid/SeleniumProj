package Selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(2000);
	
															//css:img[class='close-btn']
		List<WebElement> popup = driver.findElements(By.xpath("//img[@class='close-btn']"));
		
		if(popup.size()>0) {
			popup.get(0).click();
		}
		
		Thread.sleep(1000);
		List<WebElement> popup1 = driver.findElements(By.className("_24EHh"));
		
		if(popup1.size()>0) {
			popup1.get(0).click();
			
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='search-key-box']/input")).sendKeys("Canada");
		
		Thread.sleep(2000);
		
		driver.close();
		
		}

}
