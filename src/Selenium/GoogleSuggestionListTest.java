package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		//a4bIc
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Canada");
		
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='a4bIc']")).sendKeys("Canada");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']/li"), 10));
		List<WebElement> count = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		
		
		System.out.println(count.size());
		
		
		
		for(int i=0;i<count.size();i++) {
			
			System.out.println(count.get(i).getText());
		}
		
		
		Thread.sleep(1000);
		driver.close();
		

	}

}
