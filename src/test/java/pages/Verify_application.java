package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class Verify_application {
	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Verify_application (WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}
	
	@FindBy(xpath = "(//ion-item[.=' List '])[2]")
	WebElement List_application1;

	@FindBy(id = "applicationButton")
	WebElement	ApplicationModule1;
	
	@Test
	public void f() throws Exception {

		Set<String> windows=	driver.getWindowHandles();
		for (String window : windows) {
			if (window.equals(YopmailValidation.parent)) {
				driver.switchTo().window(YopmailValidation.parent);
				driver.switchTo().alert().accept();
				
			}
		}
		Thread.sleep(1000);
		ApplicationModule1.click();
		Thread.sleep(2000);
		List_application1.click();
		Actions act = new Actions(driver);
		WebElement last=	driver.findElement(By.xpath("(//td/ion-button[@title='Edit Application'])[last()]"));
		act.scrollToElement(last).build().perform();


	}

}
/*
 * Thread.sleep(2000);
 * 
 * Set<String> windows= driver.getWindowHandles(); for (String window : windows)
 * { if (window.equals(parent)) {
 * 
 * driver.switchTo().window(parent); driver.switchTo().alert().accept(); } }
 * Thread.sleep(1000); ApplicationModule1.click(); Thread.sleep(2000);
 * List_application1.click(); Actions act = new Actions(driver); WebElement
 * last= driver.findElement(By.
 * xpath("(//td/ion-button[@title='Edit Application'])[last()]"));
 * act.scrollToElement(last).build().perform();
 */



