package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iPhone");
		driver.findElement(By.id("gh-ac")).sendKeys("iPhone"); 		
		Thread.sleep(1000);
		
		
		
		//List<WebElement> allSelect = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		List<WebElement> allSelect = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(allSelect.size());
		
		
		for(int i=0; i<allSelect.size(); i++) {
			System.out.println(allSelect.get(i).getText());
			
		}
		
		
		
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
