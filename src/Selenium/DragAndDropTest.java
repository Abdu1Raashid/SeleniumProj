package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		System.out.println(drop.getText());
		
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).build().perform();
		
		wait.until(ExpectedConditions.textToBePresentInElement(drop, "Dropped"));
		
		System.out.println(drop.getText());
		
		
		if(drop.getText().equals("Dropped!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
