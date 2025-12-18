package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Fashion']"))).perform();
		Thread.sleep(1000);

		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Kids']"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Boys & Girls Tshirts']")).click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {
			js.executeScript("window.scrollBy(0,500)");
		}
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {
			js1.executeScript("window.scrollBy({top: 500, behavior: 'smooth'});");

		}
	}

}
