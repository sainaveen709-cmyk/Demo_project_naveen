package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.5movierulz.condos/");
		Thread.sleep(1000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Bollywood']"))).perform();
		Thread.sleep(1000);

		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Bollywood Movie 2021']"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Bollywood Movie 2021']")).click();
		Thread.sleep(1000);
		// a[text()='Bollywood Movie 2021']

	}

}
