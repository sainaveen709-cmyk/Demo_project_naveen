package com.Realtime1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Network.Saucescript123;

public class Saucedemo123run {

	WebDriver driver;
	Saucescript123 sd;

	@BeforeClass
	@Test
	public void setup() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		sd = new Saucescript123(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
	}

	@AfterClass
	@Test
	public void teardown() throws InterruptedException {
		driver.quit();
		Thread.sleep(1500);
	}

	@Test
	public void tc_01loginvalid() throws InterruptedException {
		Thread.sleep(1500);
		sd.loginvalid();
	}

	@Test
	public void tc_02addcartbutton() throws InterruptedException {
		Thread.sleep(1500);
		sd.verifyaddcartbutton();

	}
	@Test
	public void tc_03verifySauceLabsBackpack_button() throws InterruptedException {
		Thread.sleep(1500);
		sd. verifySauceLabsBackpack_button();
}
	@Test
	public void tc_04verifycark_button() throws InterruptedException {
		Thread.sleep(1500);
		sd. verifycark_button();
}
	@Test
	public void tc_05verifycheckout_button() throws InterruptedException {
		Thread.sleep(1500);
		sd. verifycheckout_button();
}
	@Test
	public void tc_06verifycheckoutpagedetails() throws InterruptedException {
		Thread.sleep(1500);
		sd. verifycheckoutpagedetails();

	}
	@Test
	public void tc_07verifylogininvaliddata() throws InterruptedException {
		Thread.sleep(1500);
		sd. verifyloininvaliddata();
}
}