package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		//Do not use webelement to check if the element is present
//		if(driver.findElement(By.linkText("Abput")).isDisplayed()) {
//			System.out.println("Element Present");
//		}
//		else {
//			System.out.println("Element not present");
//		}
//		
		
		//Always use list to verify if an element is present
		
		List<WebElement> present = driver.findElements(By.linkText("About"));
		
		if(present.size()>0) {
			System.out.println("element present");
		}
		else {
			System.out.println("element absent");
		}
		
		

	}

}
