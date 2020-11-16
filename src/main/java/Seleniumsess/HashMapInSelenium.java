package Seleniumsess;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriverrs.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crmpro.com/");
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("customer"));
		String customerCredential = getCredentialsMap().get("customer");
		driver.findElement(By.name("username")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getPassword("customer"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	public static HashMap<String,String> getCredentialsMap()
	{
		HashMap<String, String> userMap=new HashMap<String ,String>();
	    userMap.put("customer","vj1825:Vishu@1825");
		userMap.put("admin",    "vj2518:Vishu@1825");
		userMap.put("Distributor", "vj1825:Vishu@1825");
		userMap.put("Seller ", "vj1825:Vishu@1825");
		return userMap;

	}
	
	public static String getUserName(String role)
	{
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[0];
	}
	public static String getPassword(String role)
	{
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[1];
	}
}