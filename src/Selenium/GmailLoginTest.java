package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S956521556%3A1688239262984064&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AeDOFXgVDut-Q7TGDDvcnN-igEv_yCReXrS0QO1Uogf8zEWNR7rH6WP186rKr0xPGyystMHaPsxNrA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		
		driver.findElement(By.id("identifierId")).sendKeys("sddsfddsdasdasdfdfdfdfsfsdfsfsdfsfsdfdfdfdfdfsdfsdfsdfsdsd");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		
		
		String ExpectedErr = "Couldn’t find your Google Account";
		String actualErr = driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']")).getText();
		
		if(ExpectedErr==actualErr) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		Thread.sleep(1000);
		driver.close(); 	
	}

}
       	