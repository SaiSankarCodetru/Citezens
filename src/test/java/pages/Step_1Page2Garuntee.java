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

public class Step_1Page2Garuntee {
	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Step_1Page2Garuntee(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}


	@FindBy(xpath="//p[.='There are some errors on this page. Please correct before continuing.']")
	WebElement Page_Error;

	@FindBy(xpath="//ion-input[@formcontrolname='ProposedFirstName']/input")
	WebElement FirstName;

	@FindBy(xpath = "(//ion-col[@size='24' and @size-md='8'])[1]")
	WebElement Error_Message_FirstName;

	@FindBy(xpath="//ion-input[@formcontrolname='ProposedMiddleName']/input")
	WebElement MiddleName;

	@FindBy(xpath = "(//ion-col[@size='24' and @size-md='8'])[2]")
	WebElement Error_Message_MiddleName;

	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedLastName']/input")
	WebElement LastName;	

	@FindBy(xpath = "(//ion-col[@size='24' and @size-md='8'])[3]")
	WebElement Error_Message_LastName;

	@FindBy(xpath="//select[@formcontrolname='ProposedPhysicalState']")
	WebElement StateDropdown;

	@FindBy(xpath="(//ion-col[@size='24' and @size-md='4'])[1]")
	WebElement Error_Message_State;

	@FindBy(xpath="(//option[.=' Louisiana'])[1]")
	WebElement state;

	@FindBy(xpath="//select[@formcontrolname='ProposedGender']")
	WebElement genderDropdown;

	@FindBy(xpath="//option[.='Male']")
	WebElement gender;

	@FindBy(xpath="(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and"
			+ " @class='md hydrated'])[1]")
	WebElement Error_Message_Gender;

	@FindBy(xpath="//input[@formcontrolname='ProposedBirthDate']")
	WebElement DateOfBirth;

	@FindBy(xpath="//ion-input[@formcontrolname='ProposedAge']")
	WebElement age;

	@FindBy(xpath="(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and"
			+ " @class='md hydrated'])[2]")
	WebElement Error_Message_DateOfBirth;

	@FindBy(xpath="(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and"
			+ " @class='md hydrated'])[4]")
	WebElement Error_Message_ApplicantLocation;

	@FindBy(xpath = "//select[@formcontrolname='SignedState']")
	WebElement signedStateDropdown;

	@FindBy (xpath = "(//option[.=' Alabama'])[2]")
	WebElement SignedState;

	@FindBy(xpath="//select[@formcontrolname='ProposedPreferredLanguage']")
	WebElement preferredlanguage;

	@FindBy(xpath ="//option[.=' English']" )
	WebElement language;

	@FindBy(xpath ="(//ion-label[.='Yes'])[1]" )
	WebElement Call_Yes;

	@FindBy(xpath ="(//ion-label[.='No'])[1]" )
	WebElement Call_No;

	@FindBy(xpath ="(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and"
			+ " @class='md hydrated'])[5]" )
	WebElement Error_Message_Language;

	@FindBy(xpath ="//ion-col[@class = 'md hydrated' and @size-md = '7']" )
	WebElement ErrorMessage_BasePlan;

	@FindBy(xpath = "//select[@formcontrolname='Plan']")
	WebElement plan;

	@FindBy(xpath = "//option[.=' Allegiant Superior Choice Standard Issue']")
	WebElement selectPlan;
	
	@FindBy(xpath = "//option[.=' CICA Life Plus Guaranteed Issue']")
	WebElement selectPlan_Garuntee;

	@FindBy(xpath = "//ion-Checkbox[@formcontrolname='ADB']")
	WebElement Accidental_Checkbox;

	@FindBy(xpath = "//ion-input[@formcontrolname='AmountOfInsurance']/input")
	WebElement	FaceAmount;

	@FindBy(xpath = "//ion-col[@class = 'md hydrated' and @size-md = '3']")
	WebElement	ErrorMessage_FaceAmount;

	@FindBy(xpath = "//ion-label[text()='Annually']/following-sibling::ion-radio")
	WebElement Annually;

	@FindBy(xpath = "//ion-label[text()='Semi-Annually']/following-sibling::ion-radio")
	WebElement Semi_Annually;

	@FindBy(xpath = "//ion-label[text()='Quarterly']/following-sibling::ion-radio")
	WebElement Quarterly;

	@FindBy(xpath = "//ion-label[text()='Monthly']/following-sibling::ion-radio")
	WebElement	Monthly;

	@FindBy(xpath = "(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]")
	WebElement	Yes;

	@FindBy(xpath = "(//ion-label[text()='No']/following-sibling::ion-radio)[2]")
	WebElement	No;

	@FindBy(xpath = "(//ion-col/ion-button[starts-with(@class, 'md button')])[5]")
	WebElement Nextstep_1;

	@FindBy(xpath="//ion-label[text()='Monthly']/following-sibling::ion-radio")
	WebElement premiumType;

	@FindBy(xpath = "(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]")
	WebElement loanRadioBtn;

	@FindBy(xpath = "(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]")
	WebElement calculate;

	@FindBy(xpath = "//span[normalize-space()='Step 2: Proposed Insured Information']")
	WebElement step_2;


	public void Product_Information() throws Exception {

		Actions act = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		String Mandate_Error = "Please enter a value.";
		String Max_Error = "The maximum number of characters is 33.";
		String Max_Char = "qwertyuiopqwertyuiopqwertyuiopqwertyu";
		String Page_Error_ = "There are some errors on this page. Please correct before continuing.";
		String Fc_MxErr = "The maximum amount is 30000.";
		String Fc_MnErr = "The minimum amount is 1000.";

		Thread.sleep(3000);

		C.Scroll_C_scroll2(driver, act, calculate, Page_Error, e, Test.Case1(58),Test.Exp1(58));

		C.Get_Verify(driver, Page_Error, Page_Error_, e, Test.Case1(58),Test.Exp1(58));

		C.Scroll_C_scroll2(driver, act, calculate, FirstName, e, Test.Case1(58),Test.Exp1(58));

		C.Empty_Input(driver, Error_Message_FirstName, Mandate_Error, e, Test.Case1(3), Test.Exp1(3));

		C.Max_Char(driver, FirstName, Error_Message_FirstName, Max_Char,  Max_Error, e, Test.Case1(2), Test.Exp1(2));

		C.Send_verify_Valid_C(driver, FirstName, e, "Travis", Test.Case1(1), Test.Exp1(1));

		C.Max_Char(driver, MiddleName, Error_Message_MiddleName, Max_Char,  Max_Error, e,Test.Case1(5) ,Test.Exp1(5));

		C.Send_verify_Valid_C(driver, MiddleName, e, "tim", Test.Case1(2),Test.Exp1(2));

		C.Empty_Input(driver, Error_Message_LastName, Mandate_Error, e, Test.Case1(8),Test.Case1(8));

		C.Max_Char(driver, LastName, Error_Message_LastName, Max_Char,  Max_Error, e, Test.Case1(7), Test.Case1(7));

		C.Send_verify_Valid_C(driver, LastName, e, "head",  Test.Case1(6),Test.Exp1(6));

		C.Empty_Input(driver, Error_Message_State, Mandate_Error, e,  Test.Case1(11),Test.Exp1(11));		 

		C.C2(driver, StateDropdown, state, e, Test.Case1(10),Test.Exp1(10));

		C.G_Displayed(driver, StateDropdown,e, Test.Case1(9),Test.Exp1(9));//

		C.Empty_Input(driver, Error_Message_Gender, Mandate_Error, e,  Test.Case1(14),Test.Exp1(14));

		C.Selection(driver, act, genderDropdown, "Male", e, Test.Case1(13),Test.Exp1(13));

		C.G_Displayed(driver, genderDropdown,e, Test.Case1(12),Test.Exp1(12));//

		C.Empty_Input(driver, Error_Message_DateOfBirth, Mandate_Error, e, Test.Case1(16),Test.Exp1(16));

		C.DOB_(driver, DateOfBirth, "13031999", e, Test.Case1(15),Test.Exp1(15));

		C.Fields(driver, age,  e, Test.Case1(18),Test.Exp1(18));

		C.Fields(driver, age, e, Test.Case1(20),Test.Exp1(20));

		C.Empty_Input(driver, Error_Message_ApplicantLocation, Mandate_Error, e,  Test.Case1(23),Test.Exp1(23));

		C.C2(driver, signedStateDropdown, SignedState, e,Test.Case1(22),Test.Exp1(22));

		C.Empty_Input(driver, Error_Message_Language, Mandate_Error, e,  Test.Case1(26),Test.Exp1(26));

		C.C2(driver, preferredlanguage, language, e,Test.Case1(25),Test.Exp1(25));

		C.Fields(driver, preferredlanguage, e, Test.Case1(24),Test.Exp1(24));

		C.Fields(driver, Call_Yes, e,Test.Case1(27),Test.Exp1(27));

		C.Fields(driver, Call_No, e,Test.Case1(28),Test.Exp1(28));

		C.Fields(driver, Call_No, e,Test.Case1(39),Test.Exp1(39)); 

		C.act_scroll1(driver, act, calculate, e, Test.Case1(17),Test.Exp1(17));

		C.Empty_Input(driver, ErrorMessage_BasePlan, Mandate_Error, e, Test.Case1(31),Test.Exp1(31)); 

		C.C2(driver, plan, selectPlan, e, Test.Case1(30),Test.Exp1(30));

		C.Fields(driver, preferredlanguage, e, Test.Case1(24),Test.Exp1(24));

		C.Fields(driver, plan,e, Test.Case1(29),Test.Exp1(29));//

		C.Fields(driver, Accidental_Checkbox, e, Test.Case1(37),Test.Exp1(37));

		C.Fields(driver, Accidental_Checkbox ,e, Test.Case1(38),Test.Exp1(38));

		C.Empty_Input(driver, ErrorMessage_FaceAmount, Mandate_Error, e,  Test.Case1(36),Test.Exp1(36));

		C.Max_Char_Scroll(driver, act, FaceAmount, calculate, ErrorMessage_FaceAmount, "Testing", Test.Err_Msg(2, 4, 4), e, Test.Case1(33),Test.Exp1(33));

		C.Max_Char(driver, FaceAmount, ErrorMessage_FaceAmount, "30001", Fc_MxErr, e,  Test.Case1(34),Test.Exp1(34));

		C.SC_C_Send(driver, act, calculate,FaceAmount, ErrorMessage_FaceAmount, "999", Fc_MnErr, e, Test.Case1(35),Test.Exp1(35));

		C.Send_verify_Valid_C(driver, FaceAmount, e, "6581", Test.Case1(32),Test.Exp1(32));

		C.Clk_Is_Enabled(driver, Annually, e,  Test.Case1(42),Test.Exp1(42));
		C.Clk_Is_Enabled(driver, Semi_Annually, e,  Test.Case1(43),Test.Exp1(43));
		C.Clk_Is_Enabled(driver, Quarterly, e,  Test.Case1(44),Test.Exp1(44));
		C.Clk_Is_Enabled(driver, Monthly, e,  Test.Case1(45),Test.Exp1(45));
		C.Clk_Is_Enabled(driver, Yes, e, Test.Case1(46),Test.Exp1(46));
		C.Clk_Is_Enabled(driver, No, e,  Test.Case1(47),Test.Exp1(47));
		calculate.click();
		C.page_Navigation(driver, act, Nextstep_1, step_2, e, Test.Case1(59),Test.Exp1(59));
		//Nextstep_1.click();
	}
}
