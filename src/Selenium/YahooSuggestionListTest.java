package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.name("p")).sendKeys("Canada");
		
		Thread.sleep(1000);
		
		List<WebElement> yahooSearch = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		Thread.sleep(2000);
		
		System.out.println(yahooSearch.size());
		
		
		
		for(int i=0; i<yahooSearch.size(); i++) {
			
				System.out.println(yahooSearch.get(i).getText());
			
		}
		
		
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
