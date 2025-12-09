package Demotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.roboform.com/filling-test-all-fields");
		Thread.sleep(1500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name=\"20homephon\"]")).sendKeys("9515358995");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name='21workphon']")).sendKeys("9346852212");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name='22faxphone']")).sendKeys("040-27174266");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name='23cellphon']")).sendKeys("8919134873");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name='24emailadr']")).sendKeys("sainaveen709@gmail.com");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name='25web_site']")).sendKeys("www.facebook.com");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@value='Reset']")).click();

		Thread.sleep(1500);

	}

}
