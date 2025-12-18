package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		// driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		// driver.findElement(By.xpath("//input[@id='login-button']")).click();
		// driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		driver.findElement(By.linkText("Already have an account?")).click();

	}

}
