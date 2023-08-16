	package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutorClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		WebElement cheese = driver.findElement(By.xpath("//input[@value='Cheese']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//Scroll till y-axis is 900
		js.executeScript("window.scrollBy(0,900)");
		
	//Scroll until element is in the view
		js.executeScript("arguments[0].scrollIntoView(true);", cheese);
		
	//direct click using JavascriptExecutor class
		js.executeScript("arguments[0].click()");
		
		
		
		System.out.println(cheese.getLocation());
		
		cheese.click();
	}

}
