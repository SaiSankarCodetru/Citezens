package utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Extent_Reports {
WebDriver driver;

public Extent_Reports(WebDriver driver) {
	this.driver = driver;
}
	public File file ;
	public ExtentReports ext ;
	public ExtentSparkReporter SparkReporter;
	public ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	public	ExtentTest test;

	public void ExtentReportSetup() {

		ext=new ExtentReports();
		file = new File("Citizens.html");
		SparkReporter=new ExtentSparkReporter(file);
		ext.attachReporter(SparkReporter);
		SparkReporter.config().setTheme(Theme.DARK);
		SparkReporter.config().setDocumentTitle("Citizens_Reports");
		ext.attachReporter(SparkReporter);

	}

	public ExtentTest verifying(String details) {
		test =	ext.createTest(details);
		return test;
	}
	
	public static String capturescreenshot(WebDriver driver) throws Exception {
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File destinationfilepath=new File("C://Users//Codetru User 30//eclipse-workspace//laptop//Screenshots//"+System.currentTimeMillis()+".png"); 
		File destinationfilepath=new File(System.getProperty("user.dir")+"//Screenshots//"+System.currentTimeMillis()+".png"); 
		String absolutepathlocation =destinationfilepath.getAbsolutePath();
		FileUtils.copyFile(srcfile, destinationfilepath);
		return absolutepathlocation;
	}
	
	public void teardown() {
		ext.flush();
	}
}
