package Network;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_demoscript {

//	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
//	WebElement userAddress;
//
	WebDriver driver;

	public Facebook_demoscript(WebDriver driver) {
		this.driver = driver;
	}

	@Test
	public void Accountcreattologin() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("RAMNETI");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SAI PRAVEEN");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//select[@id=\"day\"]")).sendKeys("15");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("sep");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1999");
		Thread.sleep(1500);
		WebElement sex = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		sex.click();
		Thread.sleep(1500);
		WebElement select = driver.findElement(By.xpath("//select[@id='preferred_pronoun']"));
		select.click();
		Thread.sleep(1500);

		WebElement pronounDropdown = driver.findElement(By.xpath("//select[contains(@name,'preferred_pronoun')]"));
		Thread.sleep(1500);
		Select select1 = new Select(pronounDropdown);
		select1.selectByVisibleText("He: \"Wish him a happy birthday!\"");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@id='custom_gender']")).sendKeys("MALE");

		driver.findElement(By.name("reg_email__")).sendKeys("ramnetisurekha55@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sonu@1999");
		Thread.sleep(1500);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1500);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1500);
//	driver.navigate().back();
//		Thread.sleep(1500);
	}

	@Test
	public void loginvaliddata() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"))
				.sendKeys("ramnetisainaveen@yahoo.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Surekha");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[name()='g' and contains(@mask,'url(#_R_9l')]//*[name()='image' and contains(@x,'0')]")).click();
	}
       @Test
public void logininvalidusername() throws InterruptedException {
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"))
			.sendKeys("ramnetisainaveen@gmail.com");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Surekha");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(1500);
}
	
	
	
	
}







