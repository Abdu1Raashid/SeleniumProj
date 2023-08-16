package Selenium;

//import
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		//object initialization for firefox driver
		FirefoxDriver driver = new FirefoxDriver();
		
		//URL
		driver.get("https://www.facebook.com/");
		
		//Actions
			//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sdsfsdfs");//ErrorLog:CannotUseSpacesInBetween
			//useAfterSyntaxEducation
			//driver.findElement(By.cssSelector(null)).sendKeys("sdsds");
			
			//driver.findElement(By.id("email")).sendKeys("Sandman");
			
			//only <a> can be a link
			//driver.findElement(By.linkText(null))
			
			//driver.findElement(By.name("email")).sendKeys("Spiderman");
			
		//			driver.findElement(By.linkText("")).sendKeys("dsd");
		//			driver.findElement(By.tagName(null)).sendKeys("Boom");
		//driver.findElement(By.xpath("//input[@aria-label='Email or phone number']")).sendKeys("sdsd");
		driver.findElement(By.xpath("//*[@aria-label='Email or phone number']")).sendKeys("sdfsdgsadgsafdg");
		driver.findElement(By.name("pass")).sendKeys("password");
			driver.findElement(By.tagName("login")).click();
			

				
				Thread.sleep(1000);
			driver.close();
					
					
			
		

	}

}
