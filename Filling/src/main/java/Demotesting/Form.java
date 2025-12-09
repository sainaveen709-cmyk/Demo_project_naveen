package Demotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("RAMNETI");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//label[text()='Last Name']/following::input[1]")).sendKeys("SAI NAVEEN");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//label[text()='Email']/following::input[1]")).sendKeys("SAINAVEEN709@GMAIL.COM");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Naveen@9515");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following::input[1]")).sendKeys("Naveen@9515");
		Thread.sleep(1500);
       
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
        Thread.sleep(1500);
		
        
        
	}

}
