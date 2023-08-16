package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://echoecho.com/htmlforms10.htm");
			
			List<WebElement> radio = driver.findElements(By.xpath("//input[@name='group1']	"));
			
			//List<WebElement> radio = driver.findElements(By.name("group1"));
			
			System.out.println(radio.size());
			for(WebElement selected: radio) {
				System.out.println(selected.getAttribute("value")+"====="+selected.isSelected());
				
			}
			Thread.sleep(4000);
			
			//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
			radio.get(2).click();
			
			Thread.sleep(1000);
			driver.close();

	}

}
