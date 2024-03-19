package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class HomePage {

	public 	WebDriver driver;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	public WebDriverWait wait;
	public Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	String path="C:\\Users\\Codetru\\Downloads\\Citizens_pom6\\Citizens_Pom1\\TestData\\Test Data- Citizen's 2.xlsx";

	public HomePage(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}

	public static List<String> getHiddenElementTexts(WebDriver driver, List<WebElement> elements) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> textContents = (List<String>) js.executeScript(
				"return Array.from(arguments[0]).map(element => element.textContent)", elements);
		return textContents;
	}

	@FindBy(id="applicationButton")
	WebElement application_btn;

	@FindBy(xpath="//div[@class='applicationDropdown']/div[1]")
	WebElement list_application1;

	@FindBy(xpath="//div[@class='applicationDropdown']/div[2]")
	WebElement new_application1;

	@FindBy(xpath = "//span[.='Step 1: Product Information']")
	WebElement step1;

	@FindBy(xpath="//tbody/tr/td[1]")
	List<WebElement> hiddenCells;
	String s="";
	public static String S1="";

	public void Open_Application_Module() throws Exception {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		C.W_C1(driver, wait, application_btn, e,Test.Case(5), Test.Exp(5));
		C.W_C1(driver, wait, list_application1, e, Test.Case(6), Test.Exp(6));
		List<String> hiddenElementTexts = getHiddenElementTexts(driver, hiddenCells);
		for (int i = 1; i <= 145; i++) {
			s = data.getCellData(path, 2, i, 0);
			boolean foundMatch = false;
			for (String text : hiddenElementTexts) {
				if (text.contains(s)) {
					//System.out.println(text);
					foundMatch = true;
					break;
				}
			}
			if (!foundMatch) {
				S1=s;
			}
		}
		C.W_C1(driver, wait, application_btn, e,Test.Case(5), Test.Exp(5));
		C.W_C1(driver, wait, new_application1, e, Test.Case(6), Test.Exp(6));
		C.W_C1(driver, wait, step1, e, Test.Case(7), Test.Exp(7));
	}

}
