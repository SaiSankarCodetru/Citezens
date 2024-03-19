package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import pages.*;
import utils.Extent_Reports;
import java.awt.Desktop;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCases_of_CIC01{

	WebDriver driver;
	Extent_Reports Reports = new Extent_Reports(driver);

	@BeforeSuite
	public void ExtentReportSetup1() {
		Reports.ExtentReportSetup();
	}

	@Test(priority = 1)
	public void Login() throws Exception {
		LoginPage user = new LoginPage(driver, Reports);
		user.Login_into_Application();
	}

	@BeforeTest
	public void chromeLaunch() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-running-insecure-content");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//options.addArguments("--incognito");
		driver.get("https://cicaamericaqa.citizensinc.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));		
	}
	//	@AfterTest
	//	public void closebrowser() throws Exception {
	//		driver.quit();
	//	}
	//
	@AfterSuite
	public void teardown1() throws Exception {
		Reports.teardown();
		Desktop.getDesktop().browse(new File("Citizens.html").toURI());
	}
}
