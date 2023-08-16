package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bd']/div[1]//a"));
		
		System.out.println(allLinks.size());
		
		
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}
		
		Thread.sleep(1000);
		driver.close();
	
		
	}

}
