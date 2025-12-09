package com.Realtime1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Network.Facebook_demoscript;

public class Facebook_run {

	Facebook_demoscript fb;
	WebDriver driver;

	@BeforeClass
	@Test
	public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		fb = new Facebook_demoscript(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
	}

	@AfterClass
	@Test
	public void teardown() throws InterruptedException {
		Thread.sleep(1500);
		driver.quit();

	}

	@Test
	public void tc_01Accoutcreat() throws InterruptedException {
		Thread.sleep(1500);
		fb.Accountcreattologin();
	}
           @Test
	public void tc_02loginvalid() throws InterruptedException {
		Thread.sleep(1500);
		fb.loginvaliddata();

	}
                  @Test
           public void tc_03logininvalidusername() throws InterruptedException {
       		Thread.sleep(1500);
       		fb.logininvalidusername();
           }
}
