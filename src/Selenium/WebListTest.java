package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");
		
		
		
		//	WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		
		//	WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		
			//		List<>driver.findElements(By.tagName(a));
		
			//WebElement first = driver.findElement(By.tagName("a")); //First WebElement
			
				List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
				System.out.println(allLinks.size());
		
					for(int i=0; i<allLinks.size();i++) {
							System.out.println(allLinks.get(i).getText());
		
					}	
					//System.out.println(allLinks.get(i).getText());

				Thread.sleep(1000);
		driver.close();

	}

}
