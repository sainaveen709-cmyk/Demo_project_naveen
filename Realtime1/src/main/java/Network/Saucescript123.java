package Network;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Saucescript123 {

	WebDriver driver;

	public Saucescript123(WebDriver driver) {
		this.driver = driver;
	}

	@Test
	public void loginvalid() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1500);

	}

	@Test
	public void verifyaddcartbutton() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(1500);
	}

	@Test
	public void verifySauceLabsBackpack_button() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).click();

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(1500);

		// a[@data-test="shopping-cart-link"]

	}

	@Test
	public void verifycark_button() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("// a[@data-test=\"shopping-cart-link\"]")).click();
		Thread.sleep(1500);
	}
	// button[text()="Checkout"]

	@Test
	public void verifycheckout_button() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.findElement(By.xpath("// a[@data-test=\"shopping-cart-link\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()=\"Checkout\"]")).click();
		Thread.sleep(1500);
	}

	@Test
	public void verifycheckoutpagedetails() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("// a[@data-test=\"shopping-cart-link\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()=\"Checkout\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("RAMNETI");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("SAI NAVEEN");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder=\"Zip/Postal Code\"]")).sendKeys("500061");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
        Thread.sleep(1500);
	}
	@Test
	public void verifyloininvaliddata() throws InterruptedException {
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(1500);



	}



}
