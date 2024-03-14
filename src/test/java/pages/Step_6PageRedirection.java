package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class Step_6PageRedirection {


	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Step_1Page step_1 =new Step_1Page(driver, e);
	Step_2Page step_2 =new Step_2Page(driver, e);
	Step_3Page step_3 =new Step_3Page(driver, e);
	Step_4Page step_4 =new Step_4Page(driver, e);
	Step_5Page step_5 =new Step_5Page(driver, e);
	Step_6Page step_6 =new Step_6Page(driver, e);
	Ext_1 Test = new Ext_1();

	public Step_6PageRedirection(WebDriver driver, Extent_Reports e) {
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
	
	@FindBy(xpath = "(//ion-item/ion-label[.='Yes']/following-sibling::ion-radio)[10]")
	WebElement HealthQuestions8_yes;
	
	@FindBy(xpath = "//ion-checkbox[@formcontrolname='PhysicianNameCheckbox']")
	WebElement no_physician;

	@FindBy(xpath = "//ion-input[@formcontrolname='PhysicianName']/parent::ion-item/parent::ion-col")
	WebElement Error_NoPhysicanCheckBox;

	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]")
	WebElement NextStep7;
	
	@FindBy(xpath = "//ion-input[@formcontrolname='PhysicianName']")
	WebElement Physician_textbox;

	
	@FindBy(xpath = "(//ion-col[@size='24' and @size-md='18']/ion-button[@class='md button button-solid ion-activatable ion-focusable hydrated'])[9]")
	WebElement tableOFContent;
	
	
	public void Predetermination_Questions() throws Exception {

		String Mandatory_Err = "Please enter a value.";
		
			Actions act = new Actions(driver);
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));

			C.Mandate_Click1(driver, act, NextStep6, e, Test.Case6(27), Test.Exp6(27));

			C.Health_Question_M(driver, act, Error_HealthQuestions_1,Mandatory_Err, e, Test.Case6(3), Test.Exp6(3));
//
			C.Health_Question_M(driver, act, Error_HealthQuestions_2,Mandatory_Err, e, Test.Case6(6), Test.Exp6(6));

			C.Health_Question_M(driver, act, Error_HealthQuestions_4,Mandatory_Err, e, Test.Case6(9), Test.Exp6(9));

			C.Health_Question_M(driver, act, Error_HealthQuestions_4,Mandatory_Err, e, Test.Case6(12), Test.Exp6(12));

			C.Health_Question_M(driver, act, Error_HealthQuestions_5,Mandatory_Err, e, Test.Case6(15), Test.Exp6(15));

			C.Health_Question_M(driver, act, Error_HealthQuestions_6,Mandatory_Err, e, Test.Case6(18), Test.Exp6(18));

			C.Health_Question_M(driver, act, Error_HealthQuestions_7,Mandatory_Err, e, Test.Case6(21), Test.Exp6(21));

			C.Health_Question_M(driver, act, Error_HealthQuestions_8,Mandatory_Err, e, Test.Case6(24), Test.Exp6(24));
			
			C.Health_Question_C(driver, act, HealthQuestions1, "1", e, Test.Case6(2), Test.Exp6(2));

			C.Health_Question_C(driver, act, HealthQuestions2, "2", e, Test.Case6(5), Test.Exp6(5));

			C.Health_Question_C(driver, act, HealthQuestions3, "3", e, Test.Case6(8), Test.Exp6(8));

			C.Health_Question_C(driver, act, HealthQuestions4, "4", e, Test.Case6(11), Test.Exp6(11));

			C.Health_Question_C(driver, act, HealthQuestions5, "5", e, Test.Case6(14), Test.Exp6(14));

			C.Health_Question_C(driver, act, HealthQuestions6, "6", e, Test.Case6(17), Test.Exp6(17));

			C.Health_Question_C(driver, act, HealthQuestions7, "7", e, Test.Case6(20), Test.Exp6(20));

//			C.Health_Question_C(driver, act, HealthQuestions8, "8", e, Test.Case6(23), Test.Exp6(23));

			C.act_scroll1(driver, act, NextStep6, e, Test.Case6(29), Test.Exp6(29));
			
			C.Empty_Input(driver, Error_NoPhysicanCheckBox, Mandatory_Err, e, Test.Case6(25), Test.Exp6(25));

			
			
			WebElement HealthQuestions8_yes=driver.findElement(By.xpath("(//ion-item/ion-label[.='Yes']/following-sibling::ion-radio)[10]"));
			act.scrollToElement(NextStep6).build().perform();
			HealthQuestions8_yes.click();
			act.moveToElement(NextStep6).build().perform();
			
//			no_physician.click();
			C.Mandate_Click(driver, no_physician, e, Test.Case6(26), Test.Exp6(26));
			act.moveToElement(NextStep6).build().perform();
			Thread.sleep(3000);
			NextStep6.click();
			Thread.sleep(2000);
			WebElement okbutton_Step_6	=driver.findElement(By.xpath("//span[text()='Ok']"));
			Thread.sleep(1000);
			okbutton_Step_6	.click();
//			**************for other flow******************************
			WebElement tableOFContent =driver.findElement(By.xpath("(//ion-col[@size='24' and @size-md='18']/ion-button[@class='md button button-solid ion-activatable ion-focusable hydrated'])[9]"));
			tableOFContent.click();
			Thread.sleep(1000);
			WebElement Step_1_productInfo=driver.findElement(By.xpath("//span[text()='Step 1: Product Information']"));
			Step_1_productInfo.click();
			Thread.sleep(1000);
			WebElement calculate1=driver.findElement(By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]"));
			act.scrollToElement(calculate1).build().perform();
			Thread.sleep(1000);
			calculate1.click();
			WebElement nextstep1_Again=driver.findElement(By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[5]"));
			act.scrollToElement(nextstep1_Again).build().perform();
			nextstep1_Again.click();
			Thread.sleep(2000);
			WebElement Step_6_predeterminationQues=driver.findElement(By.xpath("//span[text()='Step 6: Predetermination Questions']"));
			Step_6_predeterminationQues.click();
			Thread.sleep(1000);
			WebElement nextstep6_Again=driver.findElement(By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])"));
			act.scrollToElement(nextstep6_Again).build().perform();
			nextstep6_Again.click();
			Thread.sleep(2000);
			
			WebElement okbutton_Step_6_Again	=driver.findElement(By.xpath("//button[@type='button']/span"));
			Thread.sleep(1000);
			okbutton_Step_6_Again.click();
			Thread.sleep(1000);
			WebElement calculate1_Again=driver.findElement(By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]"));

			act.scrollToElement(calculate1_Again).build().perform();
			Thread.sleep(1000);
			WebElement plan_Again=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@formcontrolname='Plan']")));
//			act.scrollToElement(calculate1_Again).build().perform();
			act.scrollToElement(plan_Again).build().perform();
			plan_Again.click();
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[.=' Allegiant Superior Choice Guarantee Issue']"))).click(); 
			WebElement plan_SelectionElement=driver.findElement(By.xpath("//option[.=' Allegiant Superior Choice Guarantee Issue']"));
			Thread.sleep(1000);
			plan_SelectionElement	.click(); 
			calculate1_Again.click();
//			Allegiant Superior Choice Standard Issue
			WebElement stateDropDown=driver.findElement(By.xpath("//select[@formcontrolname='ProposedPhysicalState']"));
			Thread.sleep(1000);
			act.moveToElement(stateDropDown).build().perform();
			stateDropDown.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//option[.=' Louisiana'])[1]"))).click();
			Thread.sleep(1000);
			Thread.sleep(1000);
//			calculate1_Again.click();
			
			
			act.scrollToElement(calculate1_Again).build().perform();
			calculate1_Again.click();
			Thread.sleep(1000);
			WebElement nextstep1_Again_Again=driver.findElement(By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[10]"));
			act.scrollToElement(nextstep1_Again_Again).build().perform();
			nextstep1_Again_Again.click();
			Thread.sleep(1000);
			WebElement nextstep2_Again=driver.findElement(By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[17]"));
			act.scrollToElement(nextstep2_Again).build().perform();
			WebElement city=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@formcontrolname='ProposedPhysicalCity']")));
			city.click();
			WebElement CitySelection=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[.='Dodge City ']")));
			Thread.sleep(1000);
			CitySelection.click();
			Thread.sleep(1000);
//			WebElement nextstep2_Again=driver.findElement(By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[17]"));
			act.scrollToElement(nextstep2_Again).build().perform();
			nextstep2_Again.click();
			WebElement nextstep3_Again=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ion-row[@class='hidden-sm-down md hydrated']/ion-col/ion-button[starts-with(@class, 'md button')])[10]")));
			nextstep3_Again.click();
			WebElement nextstep4_Again= driver.findElement(By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[5]"));
			act.scrollToElement(nextstep4_Again).build().perform();
			nextstep4_Again.click();
			WebElement nextstep5_Again=driver.findElement(By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[6]"));
			Thread.sleep(1000);
			nextstep5_Again.click();
			WebElement nextstep7_Again = driver.findElement(By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[7]"));
			Thread.sleep(1000);
			nextstep7_Again.click();
			WebElement nextstep8=driver.findElement(By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[8]"));
			act.moveToElement(nextstep8).build().perform();
//			nextstep8.click();
			
//			WebElement nextstep8=driver.findElement(By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[8]"));
			act.moveToElement(nextstep8).build().perform();
//			nextstep8.click();
			WebElement signedCity =driver.findElement(By.xpath("//ion-input[@formcontrolname='SignedCity']/input"));
			act.moveToElement(signedCity).build().perform();
			WebElement HoldDateRadioButton_No=driver.findElement(By.xpath("//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col[2]/ion-item"));
			WebElement Error_SignedCity=driver.findElement(By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[4]"));
			act.scrollToElement(Error_SignedCity).build().perform();
			Assert.assertTrue(Error_SignedCity.isDisplayed());
			String LabelErrorSignedCity_Text=Error_SignedCity.getText();
			System.out.println(LabelErrorSignedCity_Text);
			Thread.sleep(1000);
			signedCity.sendKeys("ggdssadfkjgfhfsahklklasfkhalkfhlkasfhlkasfhlkafhlkasfhlkasfhlkasfh");
			act.scrollToElement(Error_SignedCity).build().perform();
			Assert.assertTrue(Error_SignedCity.isDisplayed());
			String LabelError_MaximumSignedCity_Text=Error_SignedCity.getText();
			System.out.println(LabelError_MaximumSignedCity_Text);
			signedCity.clear();
			signedCity.sendKeys("Testing Codetru");
			WebElement Error_SignatureProposedInsurer=driver.findElement(By.xpath("(//h3[text()='Signature']/following-sibling::ion-row[2]/ion-col[@size='24' and @size-md='6'])[1]"));
			act.scrollToElement(Error_SignatureProposedInsurer).build().perform();
			act.scrollToElement(HoldDateRadioButton_No).build().perform();
			Assert.assertTrue(Error_SignatureProposedInsurer.isDisplayed());
			String LabelErrorSignatureProposedInsurer_Text=Error_SignatureProposedInsurer.getText();
			System.out.println(LabelErrorSignatureProposedInsurer_Text);
			WebElement ProposedInsurerSignature=driver.findElement(By.xpath("//h3[.='Signature']/following-sibling::ion-row[2]/ion-col/div/ion-button"));
			ProposedInsurerSignature.click();
			WebElement	signature_pad1= driver.findElement(By.xpath("(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]"));
			Thread.sleep(1000);
			act.clickAndHold(signature_pad1)
			.moveByOffset(25, 25)
			.moveByOffset(35, 30)
			.moveByOffset(16, 26)
			.moveByOffset(-76, -26)
			.moveByOffset(18, 56)
			.moveByOffset(-52, -36)
			.moveByOffset(-21,-25)
			.moveByOffset(36, 26)
			.moveByOffset(-54, 56)
			.release()
			.build()
			.perform();
			driver.findElement(By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]")).click();
			WebElement Error_HoldUntillDate=driver.findElement(By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[6]"));
			act.scrollToElement(Error_HoldUntillDate).build().perform();
			Assert.assertTrue(Error_HoldUntillDate.isDisplayed());
			String LabelErrorHoldUntillDate_Text=Error_HoldUntillDate.getText();
			System.out.println(LabelErrorHoldUntillDate_Text);
			HoldDateRadioButton_No.click();
			act.scrollToElement(nextstep8).build().perform();
			WebElement Error_SignatureOfAgent=driver.findElement(By.xpath("//h3[text()='Agent']/following-sibling::ion-row/ion-col[4][@size='24']"));
			Assert.assertTrue(Error_SignatureOfAgent.isDisplayed());
			String LabelErrorSignatuerOfAgent_Text=Error_SignatureOfAgent.getText();
			System.out.println(LabelErrorSignatuerOfAgent_Text);
			Thread.sleep(1000);
			WebElement SignatureOfAgent=driver.findElement(By.xpath("//div/h3[.='Agent']/following-sibling::ion-row/ion-col[4]/div/ion-button"));
			SignatureOfAgent.click();
			WebElement signature_pad2=driver.findElement(By.xpath("//canvas[@class='signature-pad-canvas hidden-xs-down']"));
			Thread.sleep(1000);
			act.clickAndHold(signature_pad2)
			.moveByOffset(25, 25)
			.moveByOffset(35, 30)
			.moveByOffset(16, 26)
			.moveByOffset(-76, -26)
			.moveByOffset(18, 56)
			.moveByOffset(-52, -36)
			.moveByOffset(-21,-25)
			.moveByOffset(36, 26)
			.moveByOffset(112, 56)
			.release()
			.build()
			.perform();
			driver.findElement(By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]")).click();
			Thread.sleep(1000);
			nextstep8.click();
		
			Thread.sleep(1000);
			WebElement Step_8=driver.findElement(By.xpath("//span[text()='Step 8: Upload Application ']"));
			Thread.sleep(1000);
			Step_8.click();
			Thread.sleep(1000);
			

	}
}
