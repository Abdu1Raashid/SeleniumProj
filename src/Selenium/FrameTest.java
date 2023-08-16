package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> checker = driver.findElements(By.xpath("m"));
		////a[contains(text(),'Sortable')]
		//String s = checker.get(0).getText();
		if(checker.size()>0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		List<WebElement> boxPresent = driver.findElements(By.xpath("//div[@id='draggable']/p"));
		 
		if(boxPresent.size()>0) {
			
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}
		
		driver.switchTo().frame(0);
		
		

		 checker = driver.findElements(By.xpath("(//div[@role='complementary']/aside/ul)[1]/li[5]"));
		
		
		if( checker.size()>0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		boxPresent = driver.findElements(By.xpath("//div[@id='draggable']/p"));
		 
		if(boxPresent.size()>0) {
			
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}

		
		driver.switchTo().defaultContent();
		
		

		 checker = driver.findElements(By.xpath("(//div[@role='complementary']/aside/ul)[1]/li[5]"));
		
		
		if(checker.size()>0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		boxPresent = driver.findElements(By.xpath("//div[@id='draggable']/p"));
		 
		if(boxPresent.size()>0) {
			
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}

		
		Thread.sleep(1000);
		driver.close();
	}

}
