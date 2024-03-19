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

public class TestCases_of_CICA{

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

	@Test(priority = 2)
	public void Homepage()  throws Exception {
		HomePage user = new HomePage(driver, Reports);
		user.Open_Application_Module();
	}

	@Test(priority = 3)
	public void Step_1() throws Exception {
		Step_1Page user = new Step_1Page(driver, Reports);
		user.Product_Information();
	}

	@Test(priority = 4)
	public void Step_2() throws Exception {
		Step_2Page user = new Step_2Page(driver, Reports);
		user.Proposed_Insured_Information();
	}

	@Test(priority = 5)
	public void Step_3() throws Exception {
		Step_3Page user = new Step_3Page(driver, Reports);
		user.Policy_Owner_Information();
	}

	@Test(priority = 6)
	public void Step_4() throws Exception {
		Step_4Page user = new Step_4Page(driver, Reports);
		user.Beneficiary_Information();
	}

	@Test(priority = 7)
	public void Step_5() throws Exception {
		Step_5Page user = new Step_5Page(driver, Reports);
		user.Existing_Insurance();
	}

	@Test(priority = 8)
	public void Step_6() throws Exception {
		Step_6Page user = new Step_6Page(driver, Reports);
		user.Predetermination_Questions();
	}

	@Test(priority = 9)
	public void Step_7() throws Exception {
		Step_7Page user = new Step_7Page(driver, Reports);
		user.Remarks();
	}

	@Test(priority = 10)
	public void Step_8() throws Exception {
		Step_8Page user = new Step_8Page(driver, Reports);
		user.Disclosure_and_Signature();
	}

	@Test(priority = 11)
	public void Update() throws Exception {
		T_Edit_and_Submit user = new T_Edit_and_Submit(driver, Reports);
		user.Edit_Submit();
	}

	@Test(priority = 12)
	public void Step_10() throws Exception {
		Step_9Page user = new Step_9Page(driver, Reports);
		user.Make_a_Payment();
	}

	@Test(priority=13)
	public void email_verify() throws Exception{
		YopmailValidation validation= new YopmailValidation(driver, Reports);
		validation.mail_validation() ;
	}

	@Test(priority = 14)
	public void application() throws Exception {
		Verify_application verify=new Verify_application(driver, Reports);
		verify.f();
	}

	@BeforeTest
	public void chromeLaunch() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-running-insecure-content");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		options.addArguments("--incognito");
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
