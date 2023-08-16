package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.ebay.ca/");
//		
//		List<WebElement> allLinks = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
//		System.out.println(allLinks.size());
//
//			for(int i=0; i<allLinks.size();i++) {
//					System.out.println(allLinks.get(i).getText());
//
//			}	
			//System.out.println(allLinks.get(i).getText());
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
				Thread.sleep(10000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
					
					System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size(); i++) {
			
				if(allOptions.get(i).isSelected()) {
						System.out.println(allOptions.get(i).getText()+"-----"+allOptions.get(i).isSelected());
				}
		}
		
		WebElement DropDown = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(DropDown);
		
			s.selectByIndex(1);
		
		
		
				Thread.sleep(2000);
		
			s.selectByValue("6000");
					
				Thread.sleep(1000);
		
			s.selectByVisibleText("Books");
		
		
		System.out.println("Afet++++++++++++++");
		
		for(int i=0; i<allOptions.size(); i++) {
			
			if(allOptions.get(i).isSelected()) {
				System.out.println(allOptions.get(i).getText()+"-----"+allOptions.get(i).isSelected());
			}
		}

				Thread.sleep(1000);
driver.close();
	}

}
