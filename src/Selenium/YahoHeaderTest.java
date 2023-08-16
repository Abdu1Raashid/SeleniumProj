package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahoHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?guccounter=1&guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8&guce_referrer_sig=AQAAAKyDfIb6bEmXnzwt3hhYNXROxzWjCn84RH-tRmyw5W4qBmCPyMKtrRNoi8sWfzIfyiphOu6iQegMR104LyReIXLbXcBQL60B5wAtoHSWv6PVrl_NuVGjAQHKg8xNe5ohM0MFsMPj7ToIUqiYQSS9XU0i2MBztNNCcnr00IebK8Ga");
		
		
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
		
		for(int i=0;i<allList.size();i++) {
			System.out.println(allList.get(i).getText());
		}
		
		driver.close();

	}

}
