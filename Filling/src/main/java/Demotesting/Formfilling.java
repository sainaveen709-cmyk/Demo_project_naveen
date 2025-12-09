package Demotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formfilling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.roboform.com/filling-test-all-fields");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"01___title\"]")).sendKeys("FORMFILLING");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"02frstname\"]")).sendKeys("RAMNETI");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"03middle_i\"]")).sendKeys("SAI");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"04lastname\"]")).sendKeys("NAVEEN");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"04fullname\"]")).sendKeys("RAMNETI SAI NAVEEN");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"05_company\"]")).sendKeys("GENPACT");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"06position\"]")).sendKeys("TEST ENGINEER");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"10address1\"]"))
				.sendKeys("H.NO:5-9-278/1,LA BELLE ARCADE,SHAILI GARDEN");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"11address2\"]")).sendKeys("SAINIKPURI,SECUNDERABAD");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"13adr_city\"]")).sendKeys("HYDERABAD");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"14adrstate\"]")).sendKeys("TELANGANA");

		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");

		driver.findElement(By.xpath("//input[@name=\"15_country\"]")).sendKeys("INDIA");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"16addr_zip\"]")).sendKeys("500087");

		Thread.sleep(1500);

		driver.findElement(By.xpath("")).sendKeys("");
		Thread.sleep(1500);

		driver.findElement(By.xpath("30_user_id")).sendKeys("naveen@9515");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name=\"20homephon\"]")).sendKeys("9346852212");
		Thread.sleep(1500);
	}

}
