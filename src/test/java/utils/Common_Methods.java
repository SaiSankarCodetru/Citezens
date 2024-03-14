package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.itextpdf.text.Element;

public class Common_Methods {

	SoftAssert soft = new SoftAssert();

	public void Mandate_Click(WebDriver driver, WebElement Element,Extent_Reports e,String info, String pass ) throws Exception {
		e.test = e.verifying(info);
		try {
			Element.click();
			e.test.pass(pass);
		}
		catch (Exception e2) {
			e.test.fail("Fail"+e2);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}
	public void Mandate_Click1(WebDriver driver, Actions act, WebElement Element,Extent_Reports e,String info,String pass ) throws Exception {
		e.test = e.verifying(info);
		try {
			Thread.sleep(1000);
			act.moveToElement(Element).build().perform();
			Thread.sleep(1000);
			Element.click();
			e.test.pass(pass);
		}
		catch (Exception e2) {
			e.test.fail("Fail"+e2);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}
	public void Mandate_Click2(WebDriver driver, Actions act, WebElement Element,WebElement element,Extent_Reports e,String info,String pass ) throws Exception {
		e.test = e.verifying(info);
		try {
			Thread.sleep(2000);
			act.moveToElement(Element).build().perform();
			Thread.sleep(2000);
			Element.click();
			Thread.sleep(2000);
			act.scrollToElement(element).build().perform();
			e.test.pass(pass);
		}
		catch (Exception e2) {
			e.test.fail("Fail"+e2);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Selection(WebDriver driver, Actions act, WebElement Element,String data,Extent_Reports e,String info, String pass)throws Exception {

		e.test = e.verifying(info);
		try {
			Thread.sleep(1000);
			Select selectgender =new Select(Element);
			selectgender.selectByVisibleText(data);
			e.test.pass(pass);
		} catch (Exception ex) {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}
	public void Send_verify_Valid(WebDriver driver,WebElement Element, Extent_Reports e ,String name,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.sendKeys(name);
		Thread.sleep(1000);
		String value = Element.getAttribute("value");
		if(value.contains(name)) {
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Send_verify_Valid_C(WebDriver driver,WebElement Element, Extent_Reports e ,String name,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.clear();
		Element.sendKeys(name);
		Thread.sleep(1000);
		String value = Element.getAttribute("value");
		if(value.contains(name)) {
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Cl_Ck_Send(WebDriver driver,WebElement Element,WebElement element, Extent_Reports e ,String name,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.click();
		element.clear();
		element.sendKeys(name);
		Thread.sleep(1000);
		String value = element.getAttribute("value");
		if(value.contains(name)) 
		{
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Ck_Cl_Send(WebDriver driver,WebElement Element,WebElement element, Extent_Reports e ,String name,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.click();
		element.clear();
		element.sendKeys(name);
		Thread.sleep(1000);
		String value = Element.getAttribute("value");
		if(value.contains(name)) {
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Send_verify_age(WebDriver driver,WebElement Element, Extent_Reports e ,String name,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.sendKeys(name);
		Thread.sleep(1000);
		String value = Element.getAttribute("value");
		if(value.contains(name)) {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}else {
			e.test.pass(value+"----"+pass);
		}
	}

	public void Attribute_Value(WebDriver driver,WebElement Element, Extent_Reports e ,String name,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Thread.sleep(1000);
		String value = Element.getAttribute("value");
		if(value.contains(name)) {
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Attribute_Valu(WebDriver driver,WebElement Element,WebElement Value_Element, Extent_Reports e ,String name,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.click();
		Value_Element.click();
		Thread.sleep(3000);
		String value = Element.getText();
		if(value.contains(name)) {
			System.out.println(value+"----"+pass);
			e.test.pass(value);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Click_2_V(WebDriver driver,WebElement Element,WebElement element,WebElement Err_element, Extent_Reports e ,String name,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.click();
		element.click();
		Thread.sleep(3000);
		String value = Err_element.getText();
		if(value.contains(name)) {
			System.out.println(value+"----"+pass);
			e.test.pass(value);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Clk_Is_Enabled(WebDriver driver, WebElement Element, Extent_Reports e ,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.click();
		if(Element.isEnabled()){
			e.test.pass(pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Is_Displayed(WebDriver driver, WebElement Element, Extent_Reports e ,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		if(Element.isDisplayed()){
			e.test.pass(pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Click_Displayed(WebDriver driver,WebElement element, WebElement Element, Extent_Reports e ,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		element.click();
		Thread.sleep(2000);
		if(Element.isDisplayed()){
			e.test.pass(pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void G_Displayed(WebDriver driver,WebElement element, Extent_Reports e ,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Thread.sleep(1000);
		String value = element.getText();
		if(value.contains(value)){
			e.test.pass(pass+"------"+value);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Click_NotDisplayed(WebDriver driver,WebElement Element, WebElement element, Extent_Reports e ,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.click();
		Thread.sleep(2000);
		if(!element.isDisplayed()){
			e.test.pass(pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Send_Dispalyed(WebDriver driver,WebElement Element,WebElement Error_Element, Extent_Reports e ,String name,
			String name1,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.sendKeys(name);
		String value = Element.getAttribute("value");
		if(value.contains(name1)) {
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void DOB_(WebDriver driver, WebElement Element,String data,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			Element.sendKeys(data);
			Thread.sleep(1000);
			e.test.pass(pass);
		}catch (Exception ec) {
			e.test.fail("Fail"+ec);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}

	}

	public void Get_Verify(WebDriver driver,WebElement Element,String data, Extent_Reports e , String info, String pass) throws Exception {
		e.test = e.verifying(info);
		if(Element.getText().contains(data)){
			e.test.pass(pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Max_Char(WebDriver driver,WebElement Element,WebElement Error_Element,String name, String data,Extent_Reports e,
			String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Thread.sleep(1000);
		Element.clear();
		Element.sendKeys(name);
		Thread.sleep(1500);
		soft.assertTrue(Error_Element.isDisplayed());
		String value = Error_Element.getText();
		System.out.println(value);
		if(value.contains(data)) {
			Thread.sleep(1000);
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Max_Char_C(WebDriver driver,WebElement Element,WebElement Error_Element,WebElement element,String name, 
			String data,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Thread.sleep(1000);
		Element.clear();
		Element.sendKeys(name);
		element.click();
		Thread.sleep(2000);
		soft.assertTrue(Error_Element.isDisplayed());
		String value = Error_Element.getText();
		System.out.println(value);
		if(value.contains(data)) {
			Thread.sleep(1000);
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Max_Char_Act(WebDriver driver,Actions act, WebElement Element,WebElement Error_Element,String name, 
			String data,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.clear();
		Element.sendKeys(name);
		Thread.sleep(1000);
		act.moveToElement(Error_Element).build().perform();
		soft.assertTrue(Error_Element.isDisplayed());
		String value = Error_Element.getText();
		System.out.println(value);
		if(value.contains(data)) {
			Thread.sleep(3000);
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}
	public void Max_Char_sc2(WebDriver driver,Actions act, WebElement Element,WebElement element,WebElement Error_Element,
			String name,String data,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.clear();
		Element.sendKeys(name);
		Thread.sleep(1000);
		act.moveToElement(element).build().perform();
		act.moveToElement(Error_Element).build().perform();
		soft.assertTrue(Error_Element.isDisplayed());
		String value = Error_Element.getText();
		System.out.println(value);
		if(value.contains(data)) {
			Thread.sleep(1000);
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Max_Char_Scroll(WebDriver driver,Actions act, WebElement Element,WebElement Scroll,WebElement Error_Element,String name,
			String data,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.sendKeys(name);
		Thread.sleep(1500);
		act.moveToElement(Scroll).build().perform();
		Scroll.click();
		soft.assertTrue(Error_Element.isDisplayed());
		String value = Error_Element.getText();
		System.out.println(value);
		if(value.contains(data)) {
			Thread.sleep(1000);
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}


	public void SC_C_Send(WebDriver driver,Actions act, WebElement Element,WebElement element,WebElement Error_Element,String name,
			String data,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try{
			act.scrollToElement(Element).build().perform();
			Element.click();
			element.clear();
			element.sendKeys(name);
			Thread.sleep(2000);
			Element.click();
			soft.assertTrue(Error_Element.isDisplayed());
			String value = Error_Element.getText();
			if(value.contains(data)) {
				Thread.sleep(1000);
				e.test.pass(value+"----"+pass);
			}else {
				e.test.fail("Fail");
				e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
			}
		}catch (Exception ex) {
			e.test.fail("Unable to select plan"+"------------"+ex);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void C_Send_C(WebDriver driver, WebElement Element,WebElement element,WebElement Error_Element,String name,
			String data,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try{
			Element.click();
			element.clear();
			element.sendKeys(name);
			Thread.sleep(1000);
			Element.click();
			soft.assertTrue(Error_Element.isDisplayed());
			String value = Error_Element.getText();
			if(value.contains(data)) {
				Thread.sleep(1000);
				e.test.pass(value+"----"+pass);
			}else {
				e.test.fail("Fail");
				e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
			}
		}catch (Exception ex) {
			e.test.fail("Unable to select plan"+"------------"+ex);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Empty_Input(WebDriver driver,WebElement Element, String data, Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		soft.assertTrue(Element.isDisplayed());
		String value = Element.getText();
		System.out.println(value);
		if(value.contains(data)) {
			e.test.pass(value+"----"+pass);

		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Sc_Empty_Input(WebDriver driver, Actions act,WebElement Element, String data, Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		act.scrollToElement(Element).build().perform();
		soft.assertTrue(Element.isDisplayed());
		String value = Element.getText();
		System.out.println(value);
		if(value.contains(data)) {
			e.test.pass(value+"----"+pass);

		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Dropdown_Verify(WebDriver driver,WebElement Element,WebElement Value_element, WebElement Error_Element, 
			String data, Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		Element.click();
		Thread.sleep(1000);
		Value_element.click();
		Thread.sleep(2000);
		Element.click();
		Thread.sleep(1000);
		soft.assertTrue(Error_Element.isDisplayed());
		String value = Error_Element.getText();
		System.out.println(value);
		if(value.contains(data)) {
			e.test.pass(value+"----"+pass);

		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void page_Navigation(WebDriver driver,Actions act,WebElement element, WebElement D_Element, 
			Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		act.moveToElement(element).build().perform();
		element.click();
		Thread.sleep(2000);
		if(D_Element.isDisplayed()) {
			e.test.pass(pass);

		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void W_C2(WebDriver driver,WebDriverWait wait, WebElement Element, WebElement element,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			wait.until(ExpectedConditions.visibilityOf(Element)).click();
			wait.until(ExpectedConditions.visibilityOf(element)).click();
			e.test.pass(pass);
		}catch (Exception ec) {
			e.test.fail("Fail"+ec);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void W_C1(WebDriver driver,WebDriverWait wait, WebElement Element,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			wait.until(ExpectedConditions.visibilityOf(Element)).click();
			e.test.pass(pass);
		}catch (Exception ec) {
			e.test.fail("Fail"+ec);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void W_S(WebDriver driver,WebDriverWait wait, WebElement Element,String data,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			wait.until(ExpectedConditions.visibilityOf(Element)).sendKeys(data);
			e.test.pass(pass);
		}catch (Exception ec) {
			e.test.fail("Fail"+ec);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}


	public void C2(WebDriver driver, WebElement Element, WebElement element,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			Element.click();
			Thread.sleep(1000);
			element.click();
			Thread.sleep(1000);
			e.test.pass(pass);
		}catch (Exception ec) {
			e.test.fail("Fail"+ec);
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void step_5_(WebDriver driver,WebElement Element, WebElement element, WebElement Visible_element,Extent_Reports e,String info,String pass) throws Exception {

		e.test = e.verifying(info);
		Element.click();
		element.click();
		Thread.sleep(2000);
		if(Visible_element.isDisplayed()) {
			e.test.pass(pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	//Step 6
	public void Health_Question_M(WebDriver driver,Actions act,WebElement Element,String data, Extent_Reports e,String info, String pass) throws Exception {

		e.test = e.verifying(info);
		act.scrollToElement(Element).build().perform();
		soft.assertTrue(Element.isDisplayed());
		String value = Element.getText();
		if(value.contains(data)) {
			System.out.println(value);
			e.test.pass(value+"----"+pass);
		}else {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}
	//Step 6
	public void Health_Question_C(WebDriver driver,Actions act,WebElement Element,String c, Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			act.scrollToElement(Element).build().perform();
			Element.click();
			Thread.sleep(1500);
			e.test.pass(pass+c);
		}
		catch (Exception e2) {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	//for step -8
	public void Signature(WebDriver driver,Actions act,WebElement Element1,WebElement Element2,WebElement Element3,WebElement Element4,
			int a,int b, int c, int d, int e, int f, int g,int h,int i, int j, int k, int l, int m, int n,int o,int p, int q, int r, 
			Extent_Reports er,String info, String pass) throws Exception {
		er.test = er.verifying(info);
		try {
			Element1.click();
			Thread.sleep(1000);
			act.clickAndHold(Element2).moveByOffset(a, b).moveByOffset(c, d).moveByOffset(e, f).moveByOffset(g, h)
			.moveByOffset(i, j).moveByOffset(k, l).moveByOffset(m,n).moveByOffset(o, p).moveByOffset(q, r)
			.release().build().perform();
			Element3.click();
			Thread.sleep(2000);
			if(Element4.isDisplayed()) {
				er.test.pass(pass);
			}else {
				er.test.fail("Fail");
				er.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
			}	
		}
		catch (Exception e2) {
			er.test.fail("Fail"+e2);
			er.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	//step 8
	public void act_scroll1(WebDriver driver,Actions act,WebElement Element1,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			act.scrollToElement(Element1).build().perform();
			if(Element1.isDisplayed()) {
				e.test.pass(pass);
			}else {
				e.test.fail("Fail");
				e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
			}
		}catch (Exception ec) {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void act_scroll2(WebDriver driver,Actions act,WebElement Element1,WebElement Element2,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			act.scrollToElement(Element1).build().perform();
			Thread.sleep(2000);
			act.scrollToElement(Element2).build().perform();
			if(Element2.isDisplayed()) {
				e.test.pass(pass);
			}else {
				e.test.fail("Fail");
				e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
			}
		}catch (Exception ec) {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Scroll_C_scroll2(WebDriver driver,Actions act,WebElement Element1,WebElement Element2,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			act.scrollToElement(Element1).build().perform();
			Element1.click();
			act.scrollToElement(Element2).build().perform();
			if(Element2.isDisplayed()) {
				e.test.pass(pass);
			}else {
				e.test.fail("Fail");
				e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
			}
		}catch (Exception ec) {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	//step 8
	public void Click_Scroll(WebDriver driver,Actions act,WebElement Element1,WebElement Element2,Extent_Reports e,String info, String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			Element1.click();
			act.scrollToElement(Element2).build().perform();
			if(Element2.isDisplayed()) {
				e.test.pass(pass);
			}else {
				e.test.fail("Fail");
				e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
			}
		}catch (Exception ec) {
			e.test.fail("Fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Scroll_Click(WebDriver driver,WebDriverWait wait,Actions act,WebElement Element1,Extent_Reports e,String info,String pass) throws Exception {
		e.test = e.verifying(info);
		try {

			act.scrollToElement(Element1).build().perform();
			wait.until(ExpectedConditions.visibilityOf(Element1)).click();
			Thread.sleep(1000);
			if(Element1.isDisplayed()) {
				Thread.sleep(4000);
				e.test.pass(pass);
			}else {
				e.test.fail("Unable to Scroll to element");
				e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
			}
		}catch (Exception ec) {
			e.test.fail("Unable to Scroll to element");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Fields(WebDriver driver,WebElement Element1,Extent_Reports e,String info,String pass) throws Exception {
		e.test = e.verifying(info);
		try {
			e.test.pass(pass);

		}catch (Exception ec) {
			e.test.fail("fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void Frames(WebDriver driver, Extent_Reports e,String info,String pass ) throws Exception {
		e.test = e.verifying(info);
		try {
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			Thread.sleep(1000);
			e.test.pass(pass);

		}catch (Exception ec) {
			e.test.fail("fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}

	public void switchToNewWindow(WebDriver driver, WebDriverWait wait, String url, Extent_Reports e, String info, String pass ) throws Exception {
		e.test = e.verifying(info);
		try {
			Thread.sleep(2000);
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(url);
			e.test.pass(pass);
		}catch(Exception ec){
			e.test.fail("fail");
			e.test.addScreenCaptureFromPath(Extent_Reports.capturescreenshot(driver));
		}
	}
	
//	public void clickByJavaScript(WebDriver driver, WebDriverWait wait, WebElement element, Extent_Reports e, String info, String pass) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		 WebElement ele = (WebElement) js.executeScript(element);
//		open_file.click();
//	}

}