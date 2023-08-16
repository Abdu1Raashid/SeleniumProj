package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
		
		
	WebElement list = driver.findElement(By.xpath("//div[@id='nav-tools']//a[2]"));
	
	Thread.sleep(1000);
	
	Actions builder = new Actions(driver);
	
	builder.moveToElement(list).build().perform();
	
	Thread.sleep(1000);
	
	List<WebElement> listDrop = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//a"));
	System.out.println(listDrop.size());
	
	
	for(WebElement count: listDrop) {
		System.out.println(count.getText());
	}
	
	driver.close();
	}
	
	
	
	

}
