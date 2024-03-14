package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Excel_Util;
import utils.Extent_Reports;

public class T_Edit_and_SubmitGaruntee {
	public 	WebDriver driver;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	

	public T_Edit_and_SubmitGaruntee(WebDriver driver, Extent_Reports e) {
	PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}
	
	@FindBy(id = "applicationButton")
	WebElement ApplicationModule1;	
	
	@FindBy(xpath = "//div[@class='applicationDropdown']/div[1]")
	WebElement List_application1;
	
	@FindBy(xpath = "//td[.='$6,124.00']/parent::tr/td/ion-button[@title='Edit Application']")
	WebElement ListEdit_application1;
    
    public void Edit_Submit() throws Exception {
  
		ApplicationModule1.click();
		
		List_application1.click();
		Thread.sleep(2000);
		
		ListEdit_application1.click();
		Thread.sleep(4000);
    }
    
}
