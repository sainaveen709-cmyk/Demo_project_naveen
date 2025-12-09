package Network;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class sauce_demoscript {

	WebDriver driver;

	public sauce_demoscript(WebDriver driver) {// constructor
		this.driver = driver;

	}
           @Test       
	public void loginvalid() throws InterruptedException {
		// login with valid credentials
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.id("login-button")).click();
	}
           @Test
	public void logininvalidpassword() throws InterruptedException {// login with invalid password
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(1500);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1500);
	}

	
	
	
	
	
	
	
	
	
	
}
