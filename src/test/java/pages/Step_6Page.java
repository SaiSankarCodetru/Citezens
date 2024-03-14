package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class Step_6Page {


	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Step_6Page(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}

	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[5]")
	WebElement NextStep6;

	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_1;

	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[2]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_2;

	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[3]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_3;

	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[4]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_4;

	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[5]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_5;

	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[6]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_6;

	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[7]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_7;

	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[8]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_8;

	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[3]")
	WebElement HealthQuestions1;

	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[4]")
	WebElement HealthQuestions2;

	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[5]")
	WebElement HealthQuestions3;

	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[6]")
	WebElement HealthQuestions4;

	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[7]")
	WebElement HealthQuestions5;

	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[8]")
	WebElement HealthQuestions6;

	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[9]")
	WebElement HealthQuestions7;

	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[10]")
	WebElement HealthQuestions8;
	
	@FindBy(xpath = "//ion-checkbox[@formcontrolname='PhysicianNameCheckbox']")
	WebElement no_physician;

	@FindBy(xpath = "//ion-input[@formcontrolname='PhysicianName']/parent::ion-item/parent::ion-col")
	WebElement Error_NoPhysicanCheckBox;

	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]")
	WebElement NextStep7;
	
	@FindBy(xpath = "//ion-input[@formcontrolname='PhysicianName']")
	WebElement Physician_textbox;
	
	
	public void Predetermination_Questions() throws Exception {

		String Mandatory_Err = "Please enter a value.";
		
			Actions act = new Actions(driver);
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));

			C.Mandate_Click1(driver, act, NextStep6, e, Test.Case6(27), Test.Exp6(27));//1

			C.Health_Question_M(driver, act, Error_HealthQuestions_1,Mandatory_Err, e, Test.Case6(3), Test.Exp6(3));//2
//
			C.Health_Question_M(driver, act, Error_HealthQuestions_2,Mandatory_Err, e, Test.Case6(6), Test.Exp6(6));//3

			C.Health_Question_M(driver, act, Error_HealthQuestions_4,Mandatory_Err, e, Test.Case6(9), Test.Exp6(9));//4

			C.Health_Question_M(driver, act, Error_HealthQuestions_4,Mandatory_Err, e, Test.Case6(12), Test.Exp6(12));//5

			C.Health_Question_M(driver, act, Error_HealthQuestions_5,Mandatory_Err, e, Test.Case6(15), Test.Exp6(15));//6

			C.Health_Question_M(driver, act, Error_HealthQuestions_6,Mandatory_Err, e, Test.Case6(18), Test.Exp6(18));//7

			C.Health_Question_M(driver, act, Error_HealthQuestions_7,Mandatory_Err, e, Test.Case6(21), Test.Exp6(21));//8

			C.Health_Question_M(driver, act, Error_HealthQuestions_8,Mandatory_Err, e, Test.Case6(24), Test.Exp6(24));//9
			
			C.Health_Question_C(driver, act, HealthQuestions1, "1", e, Test.Case6(2), Test.Exp6(2));//10

			C.Health_Question_C(driver, act, HealthQuestions2, "2", e, Test.Case6(5), Test.Exp6(5));//11

			C.Health_Question_C(driver, act, HealthQuestions3, "3", e, Test.Case6(8), Test.Exp6(8));//12

			C.Health_Question_C(driver, act, HealthQuestions4, "4", e, Test.Case6(11), Test.Exp6(11));//13

			C.Health_Question_C(driver, act, HealthQuestions5, "5", e, Test.Case6(14), Test.Exp6(14));//14

			C.Health_Question_C(driver, act, HealthQuestions6, "6", e, Test.Case6(17), Test.Exp6(17));//15

			C.Health_Question_C(driver, act, HealthQuestions7, "7", e, Test.Case6(20), Test.Exp6(20));//16

			C.Health_Question_C(driver, act, HealthQuestions8, "8", e, Test.Case6(23), Test.Exp6(23));//17

			C.act_scroll1(driver, act, NextStep6, e, Test.Case6(29), Test.Exp6(29));//18
			
			C.Empty_Input(driver, Error_NoPhysicanCheckBox, Mandatory_Err, e, Test.Case6(25), Test.Exp6(25));//19

			C.Mandate_Click(driver, no_physician, e, Test.Case6(26), Test.Exp6(26));//20
			
			C.Mandate_Click(driver, NextStep6, e, Test.Case6(28), Test.Exp6(28));//21
			C.Fields(driver, NextStep6, e, Test.Case6(1), Test.Exp6(1));//22
			C.Fields(driver, NextStep6, e, Test.Case6(4), Test.Exp6(4));//23
			C.Fields(driver, NextStep6, e, Test.Case6(7), Test.Exp6(7));//24
			C.Fields(driver, NextStep6, e, Test.Case6(10), Test.Exp6(10));//25
			C.Fields(driver, NextStep6, e, Test.Case6(13), Test.Exp6(13));//26
			C.Fields(driver, NextStep6, e, Test.Case6(16), Test.Exp6(16));//27
			C.Fields(driver, NextStep6, e, Test.Case6(19), Test.Exp6(19));//28
			C.Fields(driver, NextStep6, e, Test.Case6(22), Test.Exp6(22));//29
//142
	}
}
