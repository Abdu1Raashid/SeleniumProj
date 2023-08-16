package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Object instantiation: Firefox	
		FirefoxDriver driver = new FirefoxDriver();
		
		//URL
		driver.get("https://www.google.com/");
		
		//Actions Performed
		
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		
//		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		String ExpectedOP = "Google - About Google, Our Culture & Company News";
		String ActualOP = driver.getTitle();
		System.out.println(ActualOP);
		
		wait.until(ExpectedConditions.urlToBe("https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header"));
		String ExpectedURL = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String ActualURL = driver.getCurrentUrl();
		
		//Validating Current Page
		
		//wait.until(ExpectedConditions.attributeContains(null, ExpectedURL, ActualURL))
			if(ExpectedOP.equals(ActualOP) & ExpectedURL.equals(ActualURL)) {
				System.out.println("Success");
			}
			else {
				System.out.println("Failure");
			}
		
		
		
			Thread.sleep(1000);
			
		//driver.close();
			
	}

}
