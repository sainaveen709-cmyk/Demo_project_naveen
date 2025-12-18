package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver ();
driver.manage().window().maximize();
driver.get("https://amazon.com/");
String url=driver.getCurrentUrl();
System.out.println(url);
String Pgsrc= driver.getPageSource();
System.out.println(Pgsrc);
String title = driver.getTitle();
System.out.println(title);

if(title.equals("amazon")) {
	System.out.println("amzon page is displayed,test step PASSED");
	
}
else {
	System.out.println("amazon page is not displayed,test step FAILED");
}
		
		
		
		
		
		
	}

}
