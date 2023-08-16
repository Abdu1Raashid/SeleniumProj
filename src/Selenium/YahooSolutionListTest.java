package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSolutionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("https://echoecho.com/javascript4.htm");
			
			driver.findElement(By.xpath("//input[@name='B2']")).click();
			
			Alert al = driver.switchTo().alert();
			
			al.accept();
			//al.dismiss();
			
			Thread.sleep(1000);
			driver.close();
			
	}

}
