package demo1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.5movierulz.condos/");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 5; i++) {

			js.executeScript("window.scrollBy(00,500)");
			Thread.sleep(1000);

			
			JavascriptExecutor js1 = (JavascriptExecutor)driver;
			
			for (int i1=0;i1<5;i1++) {
			
			js1.executeScript("window.scrollTo(0,0)");
			}
			
			
		}
	}
}
