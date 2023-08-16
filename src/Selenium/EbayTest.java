package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca");
		
		Thread.sleep(10000);
		
		List<WebElement> headerList = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li/a"));
		System.out.println(headerList.size());
		
		for(int i=0;i<headerList.size();i++) {
			System.out.println(headerList.get(i).getText());
		}
		
		driver.close();
	}

}
