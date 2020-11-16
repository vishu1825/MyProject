package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void LoginTitle()
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriverrs.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, expected);
	
	}
}
