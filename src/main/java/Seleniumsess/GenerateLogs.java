package Seleniumsess;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(GenerateLogs.class);
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		log.info("Launching Browser");

		driver.get("https://www.crmpro.com/");
		log.info("Free Crm url has been launched");

		String title = driver.getTitle();
		
		
		

		System.out.println("title value is :" + title);
		log.info("title value is" + title);
	}
}
