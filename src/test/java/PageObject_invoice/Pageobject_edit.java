package PageObject_invoice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageobject_edit {
	
	public WebDriver browser;
	
	// *************************************************
	// Strorage for Elements
	// /////////////for login///////////////////////
	@FindBy(xpath = "//input[@id='username']")
	WebElement UNtext;

	@FindBy(xpath = "//input[@id='password']")
	WebElement PassTf;
	// //////////////////////////////////////////////

	// ///////// Control panel and Masters //////////
	@FindBy(xpath = "//span[text()='Control Panel']")
	WebElement controlbutt;
	@FindBy(xpath = "//li[@id='Masters']")
	WebElement MastButt;

	// invoice click
	@FindBy(xpath = "//span[text()=' Invoice Type']")
	WebElement clk_invoice;
	// //////////////////////////////////////////////

	// click on edit invoice
	@FindBy(xpath = "//*[@id='InvoiceTypeTableContainer']/div/table/tbody/tr[1]/td[5]/a/div")
	WebElement clk_edit_invoice;

	// enter invoice name
	@FindBy(xpath = "//input[@id='InvoiceTypeName']")
	WebElement enter_invoice;

	// enter invoice descrip
	@FindBy(xpath = "//input[@id='InvoiceTypeDescription']")
	WebElement enter_desp;

	// click save invoice
	@FindBy(xpath = "//button[@id='LoadRecordsButton']")
	WebElement click_save_invoice;

	// blank invoice message
	@FindBy(xpath = "//label[@class='error']")
	WebElement msg_Invalid_result_blank;

	// same invoice name error msg
	@FindBy(xpath = "//label[@class='error']")
	WebElement msg_Invalid_result;

	// with different invoice name edit succesfull
	@FindBy(xpath = "//*[@id='InvoiceTypeTableContainer']/div/table/tbody/tr[1]/td[2]")
	WebElement msg_Valid_result;

	public Pageobject_edit(WebDriver Dbrowser) 
	{
		this.browser = Dbrowser;
		PageFactory.initElements(browser, this);
	}

	public void Click_CP() 
	{
		controlbutt.click();

	}

	// method to click Masters
	public void Click_Masters()
	{
		MastButt.click();

	}

	// method to click criticality
	public void click_invoice() 
	{
		clk_invoice.click();

	}

//////////////////////////////////////////////////////////////////

	public void clk_edit_invoice() {
		clk_edit_invoice.click();
	}

	// ////////////////////////////////////////////////////////////////

//enter criti name from Excel sheet
	public void enterinvoicename(String value)
	{
		enter_invoice.clear();
		enter_invoice.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.clear();
		enter_desp.sendKeys(value1);
	}

	// click save button
	public void click_save() {
		click_save_invoice.click();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// method for blank criticality name
	public String Invalid_edit_blnk() {
		return msg_Invalid_result_blank.getText();
	}
	
	//method for error text with same criticality name
		public String Invalid_edit()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new criticality name entered
	public String Valid_edit()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocessinvoice(String UN,String PW,String TC_ID, String criti_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click_invoice();
		//browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(browser,20);
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='InvoiceTypeTableContainer']/div/table/tbody/tr[1]/td[5]/a/div")));
        ele.click();
        //clk_edit_invoice();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		enterinvoicename(criti_name);
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		enterdescrip(desp);
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click_save();
	}
	
	

}
