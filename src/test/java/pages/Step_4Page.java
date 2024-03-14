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

public class Step_4Page {
	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Step_4Page(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}

	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[3]")
	WebElement NextStep4; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryFirstName']/input")
	WebElement BenificiaryFirstname;
	
	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryBusinessName']/input")
	WebElement Business_name;

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[6]")
	WebElement Error_BenificicartFirstName_Message; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryMiddleName']/input")
	WebElement BenificiaryMiddlename; 

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[7]")
	WebElement Error_BenificicartMiddleName_Message; 

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[8]")
	WebElement Error_BenificicaryLastName_Message; 

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[4]")
	WebElement Error_BenificicaryAddress_1_Message; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryLastName']/input")
	WebElement BenificiaryLastname;

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryAddress1']/input")
	WebElement BenificiaryAddress_1;

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryAddress2']/input")
	WebElement BenificiaryAddress_2; 

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[5]")
	WebElement Error_MaximumBenificiaryAddress_2_Message; 

	@FindBy(xpath = "//ion-button[normalize-space()='Add Beneficiary']")
	WebElement AddBenificiary; 

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '10' and @size='24'])[2]")
	WebElement Error_BenificicaryCity_Message; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryCity']/input")
	WebElement BenificiaryCity; 

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[4]")
	WebElement Error_BenificicaryState_Message; 

	@FindBy(xpath = "//select[@formcontrolname='BeneficiaryState']")
	WebElement benificiaryState; 

	@FindBy(xpath = "(//option[.=' Arizona'])[2]")
	WebElement Arizona_State; 

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[5]")
	WebElement Error_BenificicaryZipCode_Message; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryZipCode']/input")
	WebElement benificiaryZipcode; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryEmailAddress']/input")
	WebElement benificiaryEmailAddress; 

	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[1]")
	WebElement Error_Message_BenificiaryEmailAddress; 

	@FindBy(xpath = "//ion-input[@formcontrolname= 'BeneficiaryPhone']/input")
	WebElement benificiaryPhone; 

	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[2]")
	WebElement Error_Message_MinimumBenificiaryPhone; 

	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[3]")
	WebElement Error_Message_MinimumBenificiarySSN; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiarySSN']/input")
	WebElement BenificiarySSN; 

	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[4]")
	WebElement Error_Message_BenificiaryDOB; 

	@FindBy(xpath = "//input[@formcontrolname='BeneficiaryBirthDate']")
	WebElement BenificiaryDOB; 

	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[1]")
	WebElement Error_Message_BenificiaryPercent; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryPercent']/input")
	WebElement BenificiaryPercent; 

	@FindBy(xpath = "//p[normalize-space()='Primary Beneficiaries must equal 100']")
	WebElement benificiaryMaxPercentError; 

	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[2]")
	WebElement Error_Message_BenificiaryRelationShip; 

	@FindBy(xpath = "//select[@formcontrolname='BeneficiaryRelation']")
	WebElement Benificiaryrelation; 

	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[3]")
	WebElement error_Message_BenificiaryRelationShipForElementOthers; 

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryOtherExplain']/input")
	WebElement benificiaryOthersRelationsship; 

	@FindBy(xpath = "//option[.=' Other']")
	WebElement Other;

	@FindBy(xpath="(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]")
	WebElement NextStep5;


	public void Beneficiary_Information() throws Exception {
		Actions act = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));//

		String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
		String Add_Max = "913 Alena Lakes Suite 843 35311 Kub Extensions Apt.Lakes Suite 843 ";
		String Max_error ="The maximum number of characters is 33.";
		String Max_error_ ="The maximum number of characters is 50";
		String Mandatory_Error = "Please enter a value.";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String Min_error_Pn ="The minimum number of characters is 10.";
		String Max_error_Pn ="The maximum number of characters is 10.";
		String Min_error_ssn ="The minimum number of characters is 9.";
		String Max_error_ssn ="The maximum number of characters is 9.";
		

		C.Scroll_C_scroll2(driver, act,NextStep4 , BenificiaryFirstname, e, Test.Case4(50), Test.Exp4(50));//1

		C.Empty_Input(driver, Error_BenificicartFirstName_Message,Mandatory_Error , e, Test.Case4(5), Test.Exp4(5));//2
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(1), Test.Exp4(1));//3
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(2), Test.Exp4(2));//4
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(59), Test.Exp4(59));//5
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(60), Test.Exp4(60));//6

		C.Max_Char(driver, BenificiaryFirstname, Error_BenificicartFirstName_Message, Max_Name,Max_error, e, Test.Case4(4), Test.Exp4(4));//7

		C.Send_verify_Valid_C(driver, BenificiaryFirstname, e, "Ludie Cormier", Test.Case4(3), Test.Exp4(3));//8

		C.Max_Char(driver, BenificiaryMiddlename, Error_BenificicartMiddleName_Message, Max_Name,Max_error, e, Test.Case4(7), Test.Exp4(7));//9

		C.Send_verify_Valid_C(driver, BenificiaryMiddlename, e, "Testing", Test.Case4(6), Test.Exp4(6));//10

		C.Empty_Input(driver, Error_BenificicaryLastName_Message,Mandatory_Error , e, Test.Case4(10), Test.Exp4(10));//11

		C.Max_Char(driver, BenificiaryLastname, Error_BenificicaryLastName_Message, Max_Name,Max_error, e, Test.Case4(9), Test.Exp4(9));//12

		C.Send_verify_Valid_C(driver, BenificiaryLastname, e, "Ludie Cormier", Test.Case4(8), Test.Exp4(8));//13

		C.Empty_Input(driver, Error_BenificicaryAddress_1_Message,Mandatory_Error, e, Test.Case4(12), Test.Exp4(12));//14

		C.Max_Char(driver, BenificiaryAddress_1, Error_BenificicaryAddress_1_Message, Add_Max,Max_error, e, Test.Case4(13), Test.Exp4(13));//15

		C.Send_verify_Valid_C(driver, BenificiaryAddress_1, e, "31120 Thurman Course Suite 255", Test.Case4(11), Test.Exp4(11));//16

		C.Max_Char(driver, BenificiaryAddress_2, Error_MaximumBenificiaryAddress_2_Message, Add_Max,Max_error, e, Test.Case4(15), Test.Exp4(15));//17

		C.Send_verify_Valid_C(driver, BenificiaryAddress_2, e, "913 Alena Lakes Suite 843", Test.Case4(14), Test.Exp4(14));//18

		C.act_scroll1(driver, act, AddBenificiary, e, Test.Case4(52), Test.Exp4(52));//19

		C.Empty_Input(driver, Error_BenificicaryCity_Message,Mandatory_Error, e, Test.Case4(53), Test.Exp4(53));//20

		C.Max_Char(driver, BenificiaryCity, Error_BenificicaryCity_Message, Max_Name,Max_error, e, Test.Case4(54), Test.Exp4(54));//21

		C.Send_verify_Valid_C(driver, BenificiaryCity, e, "Springfield", Test.Case4(55), Test.Exp4(55));//22

		C.Empty_Input(driver, Error_BenificicaryState_Message,Mandatory_Error, e, Test.Case4(56), Test.Exp4(56));//23

		C.W_C2(driver, wait, benificiaryState, Arizona_State, e, Test.Case4(19), Test.Exp4(19));//24

		C.Empty_Input(driver, Error_BenificicaryZipCode_Message,Mandatory_Error , e, Test.Case4(24), Test.Exp4(24));//25

		C.Max_Char(driver, benificiaryZipcode, Error_BenificicaryZipCode_Message, "345",
				Min_error_Zp, e, Test.Case4(21), Test.Exp4(21));//26

		C.Max_Char(driver, benificiaryZipcode, Error_BenificicaryZipCode_Message, "3453456",
				Max_error_Zp, e, Test.Case4(22), Test.Exp4(22));//27

		C.Send_verify_Valid_C(driver, benificiaryZipcode, e, "67801", Test.Case4(20), Test.Exp4(20));//28

		C.Max_Char(driver, benificiaryEmailAddress, Error_Message_BenificiaryEmailAddress, "asdsaf",
				"Email is not in the correct format", e, Test.Case4(26), Test.Exp4(26));//29

		C.Max_Char(driver, benificiaryEmailAddress, Error_Message_BenificiaryEmailAddress, Max_Name,Max_error_, e, Test.Case4(27), Test.Exp4(27));//30
//100
		C.Send_verify_Valid_C(driver, benificiaryEmailAddress, e, "none@one.com", Test.Case4(25), Test.Exp4(25));//31

		C.Max_Char(driver, benificiaryPhone, Error_Message_MinimumBenificiaryPhone, "124",
				Min_error_Pn, e, Test.Case4(31), Test.Exp4(31));//32

		C.Max_Char(driver, benificiaryPhone, Error_Message_MinimumBenificiaryPhone, "12487451245871",
				Max_error_Pn, e, Test.Case4(32), Test.Exp4(32));//33

		C.Send_verify_Valid_C(driver, benificiaryPhone, e, "1254874512", Test.Case4(29), Test.Exp4(29));//34

		C.Empty_Input(driver, Error_Message_MinimumBenificiarySSN,Mandatory_Error , e, Test.Case4(38), Test.Exp4(38));//35

		C.Max_Char(driver, BenificiarySSN, Error_Message_MinimumBenificiarySSN, "12345",
				Min_error_ssn, e, Test.Case4(36), Test.Exp4(36));//36

		C.Max_Char(driver, BenificiarySSN, Error_Message_MinimumBenificiarySSN, "123455874512", 
				Max_error_ssn, e, Test.Case4(37), Test.Exp4(37));//37

		C.Send_verify_Valid_C(driver, BenificiarySSN, e, "345845123", Test.Case4(34), Test.Exp4(34));//38

		C.Empty_Input(driver, Error_Message_BenificiaryDOB,Mandatory_Error , e, Test.Case4(40), Test.Exp4(40));//39

		C.DOB_(driver, BenificiaryDOB, "01011974", e, Test.Case4(39), Test.Exp4(39));//40

		C.Empty_Input(driver, Error_Message_BenificiaryPercent,Mandatory_Error , e, Test.Case4(57), Test.Exp4(57));//41

		C.Max_Char(driver, BenificiaryPercent, benificiaryMaxPercentError, "120", "Primary Beneficiaries must equal 100", 
				e, Test.Case4(44), Test.Exp4(44));//42

		C.Send_verify_Valid_C(driver, BenificiaryPercent, e, "100", Test.Case4(43), Test.Exp4(43));//43

		C.Empty_Input(driver,Error_Message_BenificiaryRelationShip,Mandatory_Error, e, Test.Case4(49), Test.Exp4(49));//44

		C.Dropdown_Verify(driver, Benificiaryrelation, Other, error_Message_BenificiaryRelationShipForElementOthers,
				"Please Explain Other Relationship", e, Test.Case4(58), Test.Exp4(58));//45

		C.Send_verify_Valid(driver, benificiaryOthersRelationsship, e, "Others", Test.Case4(48), Test.Exp4(48));//46

		C.page_Navigation(driver, act, NextStep4,NextStep5 , e, Test.Case4(51), Test.Exp4(51));//47
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(16), Test.Exp4(16));//48
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(17), Test.Exp4(17));//49
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(18), Test.Exp4(18));//50
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(23), Test.Exp4(23));//51
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(28), Test.Exp4(28));//52
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(30), Test.Exp4(30));//53
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(33), Test.Exp4(33));//54
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(35), Test.Exp4(35));//55
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(41), Test.Exp4(41));//56
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(42), Test.Exp4(42));//57
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(35), Test.Exp4(35));//55
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(45), Test.Exp4(45));//58
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(46), Test.Exp4(46));//59
		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(47), Test.Exp4(47));//60
		
	//117
		}




}
