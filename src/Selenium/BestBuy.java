package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BestBuy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		////li[@class='rootMenuItem_Qh9am'][1]
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.bestbuy.ca/en-ca");
		
		//Actions action = new Actions(driver);
		WebElement Shop= driver.findElement(By.xpath("//li[@data-automation='shop']"));
		//WebElement Shop = driver.findElement(By.xpath("//div[@class='rootMenu_1l1Ix']//li[1]"));
		
		Shop.click();
		
		Thread.sleep(1000);
		List<WebElement> shopList = driver.findElements(By.xpath("(//div[data-automation='menu-main-li'])[1]/a"));	
		//List<WebElement> shopList = driver.findElements(By.xpath("//div[@class='menu_3LP5u menuActive_3neTn']//a"));
		
		System.out.println(shopList.size());
		
		for(WebElement count: shopList) {
			
			System.out.println(count.getText());
			
		}
		Thread.sleep(1000);	
		driver.close();
		
				
		
		

	}

}
