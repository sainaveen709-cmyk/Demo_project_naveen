package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("demoqa.com")) {
			
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
