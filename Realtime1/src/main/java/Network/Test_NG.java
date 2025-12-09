package Network;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_NG {

	@BeforeClass
	@Test(priority = 1)
	public void loginpage() {
		System.out.println("this is from loginpage");
	}

	@Test(priority = 2)
	public void username() {
		System.out.println("this is from username");
	}

	@Test(priority = 3)
	public void password() {
		System.out.println("this is from password");
	}

	@Test(priority = 4)
	public void loginbutton() {
		System.out.println("this is from login button");

	}

	@Test(priority = 5)
	public void homepage() {
		System.out.println("this is from homepage");
	}

	@AfterClass
	@Test(priority = 6)
	public void logingpage() {
		System.out.println("this is from logingpage");

	}

	@Test(priority = 7)
	public void username1() {
		System.out.println("this is from username");
	}

	@Test(priority = 8)
	public void password1() {
		System.out.println("this is from wrong password");
	}

	@Test(priority = 9)
	public void loginbutton1() {
		System.out.println("this is from loginbutton");

	}

}
