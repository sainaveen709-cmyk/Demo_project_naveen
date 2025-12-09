package Demotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selfcare.actcorp.in/home");

		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("9515358995");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@class=\"btn p-2 mt-2\"]")).click();
		Thread.sleep(1500);

	}

}
