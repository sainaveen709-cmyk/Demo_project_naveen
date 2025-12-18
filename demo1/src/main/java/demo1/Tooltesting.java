package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {
			js.executeScript("window.scrollBy(0, 500)");
		}
		driver.findElement(By.id("firstName")).sendKeys("RAMNETI");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("SAI NAVEEN");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("sainaveen709@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userNumber")).sendKeys("8919134873");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("15 JAN 1998");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[text()='Reading']")).click();
		// Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("HYDERABAD");
		// input[@id='uploadPicture']
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		for (int i1 = 0; i1 < 5; i1++) {

			js1.executeScript("window.scrollTo(0,0)");
		}

	}

}
