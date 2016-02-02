package PageObject_invoice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pageobject_create {

	public WebDriver browser;
	
	//*************************************************
	//Strorage for Elements
	///////////////for login///////////////////////
	@FindBy(xpath="//input[@id='username']")
	 WebElement UNtext;
    
    @FindBy(xpath="//input[@id='password']")
    WebElement PassTf;
	////////////////////////////////////////////////
    
    /////////// Control panel and Masters //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(xpath="//li[@id='Masters']")
	 WebElement MastButt;
	
	//invoice click
    @FindBy(xpath="//span[text()=' Invoice Type']")
    WebElement clk_invoice;
	////////////////////////////////////////////////
    
    //create invoice click
    @FindBy(xpath="//span[text()='Create Invoice Type']")
    WebElement create_invoice;
  
    //enter invoice name
    @FindBy(xpath="//input[@id='InvoiceTypeName']")
     WebElement enter_invoice;
    
    //enter invoice descrip
    @FindBy(xpath="//input[@id='InvoiceTypeDescription']")
    WebElement enter_desp;
    
    //click save invoice
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_invoice;
    
    
    
    //blank invoice message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same invoice name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different criti name edit succesfull 
	@FindBy(xpath="//*[@id='InvoiceTypeTableContainer']/div/table/tbody/tr[1]/td[2]")
	WebElement msg_Valid_result;
	//html body div#wrap div#header.topborder.relative div.floatR.extra_gap div.floatL div span#username.bold a.proper
	
	//***************************************
	
	//Action on those Elements through different methods
	
	//constructor to initialize browser
	
	public Pageobject_create(WebDriver Dbrowser)
	{
		this.browser=Dbrowser;
		PageFactory.initElements(browser, this);
				
	}
	
	//methods for different actions
	/// method to click CP
	public void Click_CP()
	{
		controlbutt.click();
		
	}
	
	// method to click Masters
	public void Click_Masters()
	{
		MastButt.click();
		
	}
	
	// method to click invoice
	public void click_invoice()
	{
		clk_invoice.click();
		
	}
	
	//click on create invoice
	public void create_invoice()
	{
		create_invoice.click();
	}
	
	//enter criti name from Excel sheet
	public void enterinvoicename(String value)
	{
		enter_invoice.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_invoice.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank invoice name
	public String Invalid_invoice_test_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same invoice name
		public String Invalid_invoice_test()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new invoice name entered
	public String Valid_invoice_test()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocessinvoice(String UN,String PW,String TC_ID, String criti_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_invoice();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_invoice();
		enterinvoicename(criti_name);
		enterdescrip(desp);
		click_save();
	}
}
