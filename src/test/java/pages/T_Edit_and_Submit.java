package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Excel_Util;
import utils.Extent_Reports;

public class T_Edit_and_Submit {
	public 	WebDriver driver;
	public Actions act;
	
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	

	public T_Edit_and_Submit(WebDriver driver, Extent_Reports e) {
	PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}
	
	@FindBy(id = "applicationButton")
	WebElement ApplicationModule1;	
	
	@FindBy(xpath = "//span[.='Step 8: Upload Application ']")
	WebElement Upload_Application;
	
//	@FindBy(xpath = "//h3[.=' Step 8 of 7']/ancestor::form/ion-grid/ion-row[2]/ion-col[starts-with(@class, 'ion-text-right')]/ion-button[1]]")
//	WebElement Table_Of_Content;

	@FindBy(xpath = "(//ion-col[@size='24' and@size-md='18' ]/ion-button[@class = 'md button button-solid ion-activatable ion-focusable hydrated'])[13]")
	WebElement Table_Of_Content;
	
	@FindBy(xpath = "(//td/ion-button[@title='Edit Application'])[last()]")
	WebElement Edit_application1;
	
	@FindBy(xpath = "//span[text()='Step 3: Owner Information']")
	WebElement Step_3;
    
	@FindBy(xpath = "//ion-item/ion-label[.='No']/following-sibling::ion-radio[@role='radio']")
	WebElement step3_No;
	
	@FindBy(xpath = "(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]")
	WebElement NextStep3;
	
	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[3]")
	WebElement NextStep4; 
	
    public void Edit_Submit() throws Exception 
    {
    	WebElement ApplicationModule1=driver.findElement(By.id("applicationButton"));
		Thread.sleep(2000);
		ApplicationModule1.click();
		Thread.sleep(2000);
		WebElement List_application1=driver.findElement(By.xpath("//div[@class='applicationDropdown']/div[1]"));
		Thread.sleep(2000);
		List_application1.click();
		Thread.sleep(2000);
//		WebElement ListEdit_application1	=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[.='$9,069.00']/parent::tr/td/ion-button[@title='Edit Application']")))
		act=new Actions(driver);
		act.scrollToElement(Edit_application1).build().perform();
		Edit_application1.click();
		Thread.sleep(2000);

    	Upload_Application.click();
		Thread.sleep(2000);
		
//		ListEdit_application1.click();
//		Thread.sleep(4000);
		
    }
    
}
