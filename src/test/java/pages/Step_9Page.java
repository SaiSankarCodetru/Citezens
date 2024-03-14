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

public class Step_9Page {
	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Step_9Page(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}

	@FindBy(xpath="//span[text()='Step 9: Make a Payment']")
	WebElement MakePayment_Step_9;
	@FindBy(xpath="//ion-button[normalize-space()='Next']")
	WebElement nextButton_PolicyPayment;
	@FindBy(xpath="(//ion-content[contains(@class, ion-padding)])[6]")
	WebElement waitUntill;
	@FindBy(xpath="(//ion-col/ion-button[@size='small' and @color='primary'])[1]")
	WebElement nxtBtn;
	@FindBy(xpath="//ion-checkbox[@formcontrolname='disclaimerYes']")
	WebElement Disclaimeryes;
	@FindBy(xpath="//ion-label[.=' Relationship']/parent::ion-item/following-sibling::div[.=' Please enter a value. ']")
	WebElement Error_PolicyPayment_Relationship;
	@FindBy(xpath="(//ion-col[@size='24' and @size-md='8' and @class='md hydrated'])[5]")
	WebElement ErrorMessage_PolicyPayment_PaymentType;
	@FindBy(xpath="//select[@formcontrolname='Relationship']")
	WebElement RelationShipDropDown;
	@FindBy(xpath="//option[.='Parent ']")
	WebElement RelationShip_Parent;
	@FindBy(xpath="//select[@formcontrolname='PaymentType']")
	WebElement PaymentType;
	@FindBy(xpath="//option[.='Premium']")
	WebElement PaymentType_premium;
	@FindBy(xpath="//ion-button[@color='primary' and @size-md='8']")
	WebElement NextBtn_BillingPage;
	@FindBy(xpath="(//h3[.='Payment Preferences']/following-sibling::ion-row/ion-col[@size='24'])[1]")
	WebElement Error_FormOfPayment;
	@FindBy(xpath="(//ion-radio[@slot='start' and @aria-checked='false'])[1]")
	WebElement CreditCard;
	@FindBy(xpath="(//h3[.='Payment Preferences']/following-sibling::ion-row/ion-col[@size='24'])[2]")
	WebElement Error_ReccuringPayemtns;
	@FindBy(xpath="//ion-checkbox[@role='checkbox']")
	WebElement Reccuring_CheckBox;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @size-md='12'])[1]")
	WebElement Error_BillignFirstName;
	@FindBy(xpath="//ion-input[@formcontrolname='CardHolderFirstName']/input")
	WebElement BillingFirstName;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @size-md='12'])[2]")
	WebElement Error_BillignLastName;
	@FindBy(xpath="//ion-input[@formcontrolname='CardHolderLastName']/input")
	WebElement BillingLastName;
	@FindBy(xpath="//ion-input[@formcontrolname='Zip']/input")
	WebElement billingZipCode;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[3]")
	WebElement Error_BillignStreetAddress;
	@FindBy(xpath="//ion-input[@formcontrolname='StreetAddress']/input")
	WebElement billingStreetAddress;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[4]")
	WebElement Error_BillignCityAndRegion;
	@FindBy(xpath="//ion-input[@formcontrolname='City']/input")
	WebElement billingCityAndRegion;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[5]")
	WebElement Error_BillignState;
	@FindBy(xpath="//select[@formcontrolname='State']")
	WebElement billingState;
	@FindBy(xpath="//option[.=' Arkansas']")
	WebElement StateSelection;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[6]")
	WebElement Error_BillignZipCode;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[7]")
	WebElement Error_BillignCountry;
	@FindBy(xpath="//select[@formcontrolname='Country']")
	WebElement billingCountry;
	@FindBy(xpath="//option[.=' COLOMBIA']")
	WebElement billingCountrySelection;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[8]")
	WebElement Error_BillignPhoneNumber;
	@FindBy(xpath="//ion-input[@formcontrolname='Phone']/input")
	WebElement BillingPhoneNumber;
	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[9]")
	WebElement Error_BillignEmailAddress;
	@FindBy(xpath="//ion-input[@formcontrolname='Email']/input")
	WebElement BillingEmailAddress;
	@FindBy(xpath="//input[@name='cardNumber']")
	WebElement CardNumber;
	@FindBy(id="cardholderName")
	WebElement cardHolderName;
	@FindBy(id="cardNumber-hint")
	WebElement Error_CardNumber;
	@FindBy(id="cardholderName-hint")
	WebElement Error_CardHoldername;
	@FindBy(id="expiryMonth")
	WebElement ExpiryMonth;
	@FindBy(id="expiryDate-hint")
	WebElement Error_ExpiryMonth;
	@FindBy(id="expiryYear")
	WebElement ExpiryYear;
	@FindBy(id="expiryDate-hint")
	WebElement Error_ExpiryYear;
	@FindBy(id="securityCode")
	WebElement SecurityCode;
	@FindBy(id="securityCode-hint")
	WebElement Error_SecurityCode;
	@FindBy(id="pin-helptxt")
	WebElement SecurityCode_PInHintVisa_Master;
	@FindBy(id="submitButton")
	WebElement MakePayment ;

	//--------------------------------------
	//ACH Payment Method
	@FindBy(xpath="//ion-label[text()='ACH (Automated Clearing House) ']/following-sibling::ion-radio[@slot='start']")
	WebElement ACh;
	@FindBy(xpath="(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[2]")
	WebElement Error_AcountType;
	@FindBy(xpath="//select[@formcontrolname='AccountType']")
	WebElement AcountType;
	@FindBy(xpath="//option[.=' Checking ']")
	WebElement SavingType;
	@FindBy(xpath="(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[3]")
	WebElement Error_AcountNumber;
	@FindBy(xpath="//ion-input[@formcontrolname='AccountNumber']/input")
	WebElement AcountNumber;
	@FindBy(xpath="//ion-input[@formcontrolname='RoutingNumber']/parent::ion-item/parent::ion-col")
	WebElement Error_RoutingNumber;
	@FindBy(xpath="//ion-input[@formcontrolname='RoutingNumber']/input")
	WebElement RountingNumber;

	public void Make_a_Payment() throws Exception {

		String Max_Name = "PaymentasdfgaedfsdfgwSEDFGASDFGBASDFGBASDFGASDFGBASDFGSADF1234sdfsghdsfghjdfgh2345";
		String max_name = "sadfgsadfgsadfghasfgasdfghsadfgasdfghsadfghsdafghjasdfgn";
		String Max_error_70 ="The maximum number of characters is 70";
		String Max_error_50 ="The maximum number of characters is 50";
		String Mandatory_Err = "Please enter a value.";

		Actions act = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		//MakePayment_Step_9.click();
		C.W_C1(driver, wait, MakePayment_Step_9, e, Test.Case10(1), Test.Exp10(1));
		

		C.W_C2(driver, wait, nextButton_PolicyPayment, waitUntill, e, Test.Case10(19), Test.Exp10(19));

		C.act_scroll1(driver, act, nxtBtn, e,Test.Case10(67), Test.Exp10(67));

		C.C2(driver, Disclaimeryes, nxtBtn, e, Test.Case10(18), Test.Exp10(18));


		

	
		C.Empty_Input(driver, Error_PolicyPayment_Relationship,Mandatory_Err, e,Test.Case10(7), Test.Exp10(7));

		C.Empty_Input(driver, ErrorMessage_PolicyPayment_PaymentType,"Please choose a payment type.", e,Test.Case10(10), Test.Exp10(10));

		C.Fields(driver, PaymentType_premium, e, Test.Case10(11), Test.Exp10(11));

		C.C2(driver, RelationShipDropDown, RelationShip_Parent, e, Test.Case10(6), Test.Exp10(6));

		
		C.C2(driver, PaymentType, PaymentType_premium, e, Test.Case10(9), Test.Exp10(9));
		

		C.Fields(driver, NextBtn_BillingPage, e, Test.Case10(12), Test.Exp10(12));

		C.Fields(driver, RelationShip_Parent, e, Test.Case10(13), Test.Exp10(13));

		C.Fields(driver, Disclaimeryes, e, Test.Case10(14), Test.Exp10(14));

		C.Fields(driver, CreditCard, e, Test.Case10(15), Test.Exp10(15));

		C.Fields(driver, nxtBtn, e, Test.Case10(16), Test.Exp10(16));

		C.Click_Scroll(driver, act, nextButton_PolicyPayment, nxtBtn, e, Test.Case10(17), Test.Exp10(17));

	
		C.C2(driver, Disclaimeryes, nxtBtn, e, Test.Case10(18), Test.Exp10(18));
		

		C.Scroll_Click(driver, wait, act, NextBtn_BillingPage, e, Test.Case10(136), Test.Exp10(136));

		C.Sc_Empty_Input(driver, act, Error_FormOfPayment, Mandatory_Err, e, Test.Case10(22), Test.Exp10(22));

		
		C.Mandate_Click(driver, CreditCard, e,Test.Case10(23), Test.Exp10(23));

		C.Fields(driver, ACh, e, Test.Case10(24), Test.Exp10(24));
		C.Fields(driver, AcountNumber, e, Test.Case10(25), Test.Exp10(25));
		C.Fields(driver, Error_AcountType, e, Test.Case10(26), Test.Exp10(26));
		C.Fields(driver, Error_AcountNumber, e, Test.Case10(27), Test.Exp10(27));

		C.Sc_Empty_Input(driver, act, Error_ReccuringPayemtns, Mandatory_Err, e, Test.Case10(29), Test.Exp10(29));

		C.Fields(driver, StateSelection, e, Test.Case10(43), Test.Exp10(43));
		C.Fields(driver, nxtBtn, e, Test.Case10(45), Test.Exp10(45));
		C.Fields(driver, billingState, e, Test.Case10(44), Test.Exp10(44));
		C.Fields(driver, Error_BillignState, e, Test.Case10(46), Test.Exp10(46));
		//Reccuring_CheckBox.click();
		Thread.sleep(1500);
		C.Mandate_Click(driver, Reccuring_CheckBox, e,Test.Case10(27), Test.Exp10(27));

		C.Sc_Empty_Input(driver, act, Error_BillignFirstName, Mandatory_Err, e, Test.Case10(33), Test.Exp10(33));

		
		C.Max_Char_Act(driver, act, BillingFirstName, Error_BillignFirstName, "dsfdsafgdsafgdsfg",
				"The maximum number of characters is 15.", e,  Test.Case10(32), Test.Exp10(32));

			
		C.Send_verify_Valid_C(driver, BillingFirstName, e, "Testing Payment", Test.Case10(31), Test.Exp10(31));
		C.Fields(driver, nxtBtn, e, Test.Case10(45), Test.Exp10(45));
		
		C.Sc_Empty_Input(driver, act, Error_BillignLastName, Mandatory_Err, e, Test.Case10(36), Test.Exp10(36));

		
		C.Max_Char_sc2(driver,act,BillingLastName,billingZipCode,Error_BillignLastName,Max_Name, Max_error_70, e,Test.Case10(35),Test.Exp10(35));

		Thread.sleep(1000);
		
		C.Send_verify_Valid_C(driver, BillingLastName, e, "Testing Payment lastname", Test.Case10(34), Test.Exp10(34));

		C.Sc_Empty_Input(driver, act, Error_BillignStreetAddress, Mandatory_Err, e, Test.Case10(39), Test.Exp10(39));

		
		C.Max_Char(driver,billingStreetAddress,Error_BillignStreetAddress,max_name,Max_error_50,e,Test.Case10(38),Test.Exp10(38));

		
		C.Send_verify_Valid_C(driver, billingStreetAddress, e, "Austin, texas USA", Test.Case10(37), Test.Exp10(37));

		C.Sc_Empty_Input(driver, act, Error_BillignCityAndRegion,Mandatory_Err, e, Test.Case10(42), Test.Exp10(42));

	
		C.Max_Char(driver,billingCityAndRegion,Error_BillignCityAndRegion,max_name,"The maximum number of characters is 40.",
				e,Test.Case10(41),Test.Exp10(41));
			Thread.sleep(2000);
		
		C.Send_verify_Valid_C(driver, billingCityAndRegion, e, "Dallas", Test.Case10(40), Test.Exp10(40));

		
		C.Sc_Empty_Input(driver, act, Error_BillignState,Mandatory_Err, e, Test.Case10(46), Test.Exp10(46));

	
		C.C2(driver, billingState, StateSelection, e, Test.Case10(44), Test.Exp10(44));

		C.Sc_Empty_Input(driver,act, Error_BillignZipCode, Mandatory_Err, e,Test.Case10(126), Test.Exp10(126));

		C.Max_Char_Act(driver, act, billingZipCode, Error_BillignZipCode, "asdfasd","Please use a number format.", e,  Test.Case10(48), Test.Exp10(48));

		
		C.Max_Char(driver,billingZipCode,Error_BillignZipCode,"1234","The minimum number of characters is 5.",e,Test.Case10(49),Test.Exp10(49));

	
		C.Max_Char(driver,billingZipCode,Error_BillignZipCode,"5478415114155211","The maximum number of characters is 5.",
				e,Test.Case10(50),Test.Exp10(50));

		Thread.sleep(1000);

		C.Send_verify_Valid_C(driver, billingZipCode, e, "67801", Test.Case10(1), Test.Exp10(1));

		C.Fields(driver, billingCountry, e, Test.Case10(51), Test.Exp10(52));

		C.Fields(driver,billingCountrySelection, e, Test.Case10(53), Test.Exp10(53));

		C.Fields(driver, Error_BillignCountry, e, Test.Case10(54), Test.Exp10(54));

		C.Fields(driver, billingCountry, e, Test.Case10(55), Test.Exp10(55));

		C.Sc_Empty_Input(driver,act, Error_BillignCountry, "Please choose a Country", e,Test.Case10(54), Test.Exp10(54));

		C.C2(driver, billingCountry, billingCountrySelection, e, Test.Case10(53), Test.Exp10(53));

		C.act_scroll1(driver, act, NextBtn_BillingPage, e, Test.Case10(127), Test.Exp10(127));

		C.Sc_Empty_Input(driver,act, Error_BillignPhoneNumber, Mandatory_Err, e,Test.Case10(128), Test.Exp10(128));

		C.Max_Char(driver,BillingPhoneNumber,Error_BillignPhoneNumber,"sadfasdd","Please use a number format.",e,Test.Case10(57),Test.Exp10(57));

		
		C.Max_Char(driver,BillingPhoneNumber,Error_BillignPhoneNumber,"1254812","The minimum number of characters is 10.",
				e,Test.Case10(129),Test.Exp10(129));

	
		C.Max_Char(driver,BillingPhoneNumber,Error_BillignPhoneNumber,"125481212512","The maximum number of characters is 10.",
				e,Test.Case10(58),Test.Exp10(58));
		
		C.Send_verify_Valid_C(driver, BillingPhoneNumber, e, "1254812123", Test.Case10(56), Test.Exp10(56));

		C.Sc_Empty_Input(driver,act, Error_BillignEmailAddress, Mandatory_Err, e,Test.Case10(62), Test.Exp10(62));

		C.Max_Char(driver,BillingEmailAddress,Error_BillignEmailAddress,"asas","Email is not in the correct format",
				e,Test.Case10(61),Test.Exp10(61));

		C.Max_Char(driver,BillingEmailAddress,Error_BillignEmailAddress,"sdasdfgasdfaSdfgasdfbsDfgasdfgnasdfgsdfgsdzfghdfsgdhfjgfdg",
				"The maximum number of characters is 50.",e,Test.Case10(63),Test.Exp10(63));

		C.Send_verify_Valid_C(driver, BillingEmailAddress, e, "none@none.com", Test.Case10(60), Test.Exp10(60));

		C.Fields(driver, AcountNumber, e, Test.Case10(64), Test.Exp10(64));

	    C.Fields(driver, Error_AcountNumber, e, Test.Case10(65), Test.Exp10(65));

		C.Scroll_Click(driver, wait, act, NextBtn_BillingPage, e, Test.Case10(66), Test.Exp10(66));

		C.Frames(driver, e,Test.Case10(130), Test.Exp10(130));

		C.Fields(driver, CardNumber, e, Test.Case10(92), Test.Exp10(92));

		C.Fields(driver, cardHolderName, e, Test.Case10(93), Test.Exp10(93));

		C.Fields(driver, CardNumber, e, Test.Case10(94), Test.Exp10(94));

		C.Fields(driver, cardHolderName, e, Test.Case10(95), Test.Exp10(95));

		CardNumber.click();  
		
		C.Max_Char_C(driver, CardNumber, Error_CardNumber, cardHolderName, "123456567", "Enter a valid card number", e, Test.Case10(131), Test.Exp10(131));

		
		C.Max_Char_C(driver, CardNumber, Error_CardNumber, cardHolderName, "5555555555554444124541", "Enter a valid card number", e, 
				Test.Case10(74), Test.Exp10(74));
		
		C.Send_verify_Valid_C(driver, CardNumber, e, "5555555555554444", Test.Case10(72), Test.Exp10(72));
		Thread.sleep(1000);		

		C.Empty_Input(driver, Error_CardHoldername,"Enter a valid cardholder's name", e,Test.Case10(79), Test.Exp10(79));

		Thread.sleep(1000);

		C.Max_Char_C(driver, cardHolderName, Error_CardHoldername, CardNumber, "12451232", "Enter a valid cardholder's name", 
				e, Test.Case10(132), Test.Exp10(132));

		C.Send_verify_Valid_C(driver, cardHolderName, e, "AUTHORISED", Test.Case10(78), Test.Exp10(78));

	
		C.Click_2_V(driver, ExpiryMonth,CardNumber,Error_ExpiryMonth, e,"Enter a valid month",Test.Case10(85), Test.Exp10(85));

	
		C.C_Send_C(driver, CardNumber, ExpiryMonth, Error_ExpiryMonth, "13", "Enter a valid month", e, Test.Case10(84),Test.Exp10(84));

		
		C.Send_verify_Valid_C(driver, ExpiryMonth, e, "12", Test.Case10(80), Test.Exp10(80));

		
		C.Click_2_V(driver, ExpiryYear, CardNumber, Error_ExpiryYear, e, "Enter a valid year",Test.Case10(88),Test.Exp10(88));

		C.Max_Char_C(driver, ExpiryYear, Error_ExpiryYear, CardNumber, "23", "Expiry date must be in the future", e, Test.Case10(90), Test.Exp10(90));

		
		C.Cl_Ck_Send(driver,CardNumber, ExpiryYear, e, "24", Test.Case10(89), Test.Exp10(89));

		Thread.sleep(1000);

		C.Max_Char_C(driver, SecurityCode, Error_SecurityCode, CardNumber, "12", "Enter a valid security code", e, Test.Case10(133), Test.Exp10(133));

		C.Cl_Ck_Send(driver,SecurityCode, SecurityCode, e, "123", Test.Case10(97), Test.Exp10(97));

		C.Empty_Input(driver, SecurityCode_PInHintVisa_Master,"Last 3 digits on the back of card", e,Test.Case10(100), Test.Exp10(100));

		C.Max_Char_C(driver, CardNumber, SecurityCode_PInHintVisa_Master, SecurityCode, "371449635398431", "4 digits on the front of card", 
				e, Test.Case10(134), Test.Exp10(134));

		C.Send_verify_Valid_C(driver, CardNumber, e, "5555555555554444", Test.Case10(99), Test.Exp10(99));

		Thread.sleep(1000);
		C.Cl_Ck_Send(driver,SecurityCode, SecurityCode, e, "123", Test.Case10(102), Test.Exp10(102));

		//MakePayment.click();
		C.Mandate_Click(driver, MakePayment, e, Test.Case10(135), Test.Exp10(135));

		C.Fields(driver, cardHolderName, e, Test.Case10(103), Test.Exp10(103));
		C.Fields(driver, cardHolderName, e, Test.Case10(104), Test.Exp10(104));
		C.Fields(driver, cardHolderName, e, Test.Case10(105), Test.Exp10(105));
		C.Fields(driver, cardHolderName, e, Test.Case10(106), Test.Exp10(106));
		C.Fields(driver, cardHolderName, e, Test.Case10(107), Test.Exp10(107));
		C.Fields(driver, cardHolderName, e, Test.Case10(108), Test.Exp10(108));
		C.Fields(driver, cardHolderName, e, Test.Case10(109), Test.Exp10(109));
		C.Fields(driver, nxtBtn, e, Test.Case10(2), Test.Exp10(2));

		C.Fields(driver, nextButton_PolicyPayment, e, Test.Case10(3), Test.Exp10(3));

		C.Fields(driver, PaymentType, e, Test.Case10(4), Test.Exp10(4));

		C.Fields(driver, nxtBtn, e, Test.Case10(5), Test.Exp10(5));

		C.Fields(driver, PaymentType, e, Test.Case10(8), Test.Exp10(8));

	}
}
