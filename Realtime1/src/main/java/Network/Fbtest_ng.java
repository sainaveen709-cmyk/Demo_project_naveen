package Network;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fbtest_ng {
	@BeforeClass
	@Test(priority = 1)
	public void loginpage() {
		System.out.println("this is from loginpage");
	}

	@Test(priority = 2)
	public void Accountcreat_button() {
		System.out.println("this is from Account creat button");

	}

	@Test(priority = 3)
	public void Firstname() {
		System.out.println("this is from Firstname");
	}

	@Test(priority = 4)
	public void Lastname() {
		System.out.println("this is from Lastname");
	}

	@Test(priority = 5)
	public void Date() {
		System.out.println("this is from Date");
	}

	@Test(priority = 6)
	public void Month() {
		System.out.println("this is from month");
	}

	@Test(priority = 7)
	public void Year() {
		System.out.println("this is from year");
	}

	@Test(priority = 8)
	public void Sex() {
		System.out.println("this is from sex");
	}

	@Test(priority = 9)
	public void Email() {
		System.out.println("this is from Emali");
	}

	@Test(priority = 10)
	public void Newpassword() {
		System.out.println("this is from Newpassword");

	}

	@Test(priority = 11)
	public void Submit_button() {
		System.out.println("this is from Submit_button");
	}

	@Test(priority = 12)
	public void Username() {
		System.out.println("this is from username");

	}
	@Test(priority = 13)
	public void Password() {
		System.out.println("this is from password");
	}
	@Test(priority = 14)
	public void login_button() {
		System.out.println("this is from login_button");
}
	
	
	
	
}