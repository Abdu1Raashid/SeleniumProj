package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		
		driver.findElement(By.id("gh-ac")).sendKeys("sdsd");
		
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
		
		System.out.println(p);
		
	//	String s = driver.findElement(By.xpath("//div[@id='gh-ac-box2']")).getText();
		
	//   String s = 	driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).getText();
		
	  // String s = driver.findElement(By.name("_nkw")).getText();
	//	String s = driver.findElement(By.xpath(//input[@placeholder=
	//			'Search for anything']))
		System.out.print(s);
		
		Thread.sleep(1000);
		//System.out.println(s);
		
		driver.close();

	}

}
