package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

										
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
		List<WebElement> allList = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		
		System.out.println(allList.size());
		for(int i=0;i<allList.size();i++) {
			System.out.println(allList.get(i).getText());
		}
		
		driver.close();
	}

}
