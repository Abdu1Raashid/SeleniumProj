package Selenium;

import java.util.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S654900408%3A1689612610599114&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AeDOFXjNyLKdxpCtvItA5q0TZcew-n3CHo70se0_2QLdXyhBOmZ7QLIUWfhwq5A9skM2-15QQLONdw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	
		
		
		
		driver.findElement(By.xpath("//ul[@class='kJOS4']/li[1]/a")).click();
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin.size());
		
		Iterator<String> iter = allWin.iterator();
		
		String parentWin = iter.next();
		String childWin = iter.next();
		System.out.println(parentWin);
		System.out.println(childWin);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(childWin);
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(parentWin);
		System.out.println(driver.getTitle());
		
		
		
		//System.out.println(driver.getTitle());
		
		
		
		
		
		//System.out.println(allWin.size());
		
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}
