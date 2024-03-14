package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class Step_5Page {
	public 	WebDriver driver;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Step_5Page(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}

	@FindBy(xpath="(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]")
	WebElement exist_no;

	@FindBy(xpath="(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]")
	WebElement NextStep5;

	@FindBy(xpath="(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[1]")
	WebElement error_Message_ExistingInsurQuest_1;

	@FindBy(xpath="(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[2]")
	WebElement error_Message_ExistingInsurQuest_2;

	@FindBy(xpath="(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]")
	WebElement ExitingInsurance_Question_1;
	
	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']")
	WebElement Error_HealthQuestions_1;


	public void Existing_Insurance() throws Exception {

		Actions act = new Actions(driver);
		String Mandatory_Error = "Please enter a value.";
		
			Thread.sleep(1000);
			C.Mandate_Click1(driver, act, NextStep5, e, Test.Case5(7), Test.Exp5(7));//1
			
			C.Fields(driver, ExitingInsurance_Question_1, e, Test.Case5(2), Test.Exp5(2));//2
			
			C.Empty_Input(driver, error_Message_ExistingInsurQuest_1, Mandatory_Error, e, Test.Case5(4), Test.Exp5(4));//3
			
			C.Fields(driver, ExitingInsurance_Question_1, e, Test.Case5(3), Test.Exp5(3));//4
			C.Fields(driver, ExitingInsurance_Question_1, e, Test.Case5(1), Test.Exp5(1));//5
			C.Fields(driver, ExitingInsurance_Question_1, e, Test.Case5(5), Test.Exp5(5));//6


			C.Empty_Input(driver, error_Message_ExistingInsurQuest_2, Mandatory_Error, e, Test.Case5(8), Test.Exp5(8));//7

			C.step_5_(driver, ExitingInsurance_Question_1, NextStep5,Error_HealthQuestions_1 , e, Test.Case5(6), Test.Exp5(6));//8

//121
	}


}
