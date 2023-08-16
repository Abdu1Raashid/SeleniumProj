	package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//FirefoxDriver driver = new FirefoxDriver();
		
		//URL
		//driver.get("https://www.facebook.com/");
		
		// WebElement footer = driver.findElement(By.id("pageFooterChildren"));
//		
//		WebElement footer = driver.findElement(By.xpath("//div[@id='pageFooterChildren']"));
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//WebElement footerBox = driver.findElement(By.id("pageFooterChildren"));
		//List<WebElement> allLinks = footerBox.findElements(By.tagName("li"));
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
			//System.out.println(allLinks.get(i).getText());

		Thread.sleep(1000);
driver.close();

	}

}
