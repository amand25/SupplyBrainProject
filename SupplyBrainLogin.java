package SupplyBrain;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SupplyBrainLogin {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://api-demo.supplybrain.io/login");
		
		driver.findElement(By.id("email")).sendKeys("njdemo@njtest.com");
		driver.findElement(By.id("password")).sendKeys("njdemo1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
