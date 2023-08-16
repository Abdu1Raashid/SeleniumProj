package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking");
		
		
		
		List<WebElement> footer = driver.findElements(By.xpath("//ul[@class='cmp-footer__links']/li"));
		
		for(int i=0; i<footer.size(); i++) {
			System.out.println(footer.get(i).getText());
			
		}
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
