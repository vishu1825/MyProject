package Seleniumsess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {

		WebDriver driver=null;
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("/workspace/Seleniumsession3/src/main/java/Seleniumsess/config.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriverrs.exe");
			 driver =new ChromeDriver();
		}
		else if(browserName.equals("FF"))
		{
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("no browser value is given");
		}
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name(prop.getProperty("user_name"))).sendKeys(prop.getProperty("username"));		
		driver.findElement(By.name(prop.getProperty("pass_word"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("LoginBtn_Xpath"))).click();

		
		
		
		
		
		
		
		
		
		
	}

}
