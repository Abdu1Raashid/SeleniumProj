package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.util.internal.SystemPropertyUtil;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca");
		Thread.sleep(1000);
		
		Actions builder = new Actions(driver);
		
		
		
		WebElement list = driver.findElement(By.xpath("//ul[@class='pre-desktop-menu']//li[2]/a"));
		//different xpath='//a[@aria-label='Men']'
		//by linktext='Men'
		builder.moveToElement(list).build().perform();
		Thread.sleep(4000);
		
		
		List<WebElement> Shoes = driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']//div[2]/a"));
		
	
		
		
		
		System.out.println(Shoes.size());
		
		for(int i=0;i<Shoes.size();i++) {
			System.out.println(Shoes.get(i).getText());
		}
		driver.close();
	}

}
