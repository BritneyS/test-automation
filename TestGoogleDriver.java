package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogleDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		WebElement searchBox;
		searchBox = driver.findElement(By.id("gbqfq"));
		searchBox.sendKeys("software");
		searchBox.submit();
		Thread.sleep(10000);
		
		driver.quit();
		
		

	}

}
