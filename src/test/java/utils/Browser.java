package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Browser {

	//Actions act;
	WebDriver driver;
	//WebDriverWait wait;
	
	@BeforeTest
	public void beforeTest() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-running-insecure-content");
		options.addArguments("--remote-allow-origins=*");
		//	options.addArguments("--headless") ;
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://cicaamericaqa.citizensinc.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		wait= new WebDriverWait(driver, Duration.ofSeconds(100));
//		act=new Actions(driver);
		
	}

	public void quit() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
