package com.Realtime1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Network.sauce_demoscript;

public class Test_execution {
	WebDriver driver;
	sauce_demoscript sd;

	@BeforeClass
	@Test
	public void setup() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		sd = new sauce_demoscript(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
	}

	@AfterClass
	@Test
	public void tearDown() throws InterruptedException {
		Thread.sleep(1500);
		driver.quit();

	}

	@Test
	public void tc1_loginvalid() throws InterruptedException {
		Thread.sleep(1500);
		sd.loginvalid();

	}

	@Test
	public void tc2_logininvalid() throws InterruptedException {
		Thread.sleep(1500);
		sd.logininvalidpassword();

	}

}
