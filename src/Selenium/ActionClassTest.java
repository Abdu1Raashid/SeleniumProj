package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		Thread.sleep(2000);
		
		
		WebElement elec = driver.findElement(By.linkText("Electronics"));
		
		Thread.sleep(4000);
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(elec).build().perform();
		
		Thread.sleep(1000);
		
		List<WebElement> elecList = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[5]/li"));
		System.out.println(elecList.size());
		
//			for(int i=0;i<elecList.size();i++) {
//					System.out.println(elecList.get(i).getText());
//		}
		
		for(WebElement all: elecList) {
			System.out.println(all.getText());
		}
		
	
		driver.close();
	}

}
