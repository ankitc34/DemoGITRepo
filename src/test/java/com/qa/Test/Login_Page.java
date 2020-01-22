package com.qa.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Page {

	@BeforeMethod
	public void beforeTest() {
		System.out.println("Initialization");
	}

	@Test
	public void myTest() {
		System.out.println("Login & Home Page Test");
	}

	@AfterMethod
	public void afterTest() {
		System.out.println("retaliation");
	}

}
