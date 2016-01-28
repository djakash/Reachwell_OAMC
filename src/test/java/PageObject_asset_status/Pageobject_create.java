package PageObject_asset_status;
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
    
	// ///////// Control panel and Asset //////////
	@FindBy(xpath = "//span[text()='Control Panel']")
	WebElement controlbutt;
	@FindBy(linkText = "Asset")
	WebElement Asset;
	// //////////////////////////////////////////////

	// click asset_status
	@FindBy(linkText = "Asset Status")
	WebElement clk_asset_status;
	////////////////////////////////////////////////
    
    //create asset_status click
    @FindBy(xpath="//*[@id='AssetStatusTableContainer']/div/div[3]/div[2]/span[4]/span[2]")
    WebElement create_asset_status;
  
    //enter asset_status name
    @FindBy(xpath="//input[@id='AssetStatus'][@name='AssetStatus']")
     WebElement enter_asset_status;
    
    //enter asset_status descrip
    @FindBy(xpath="//*[@id='Description']")
    WebElement enter_desp;
    
    //click save
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_asset_status;
    
    
    
    //blank asset_status message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same asset_status name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different asset_status name edit succesfull 
	@FindBy(xpath="//*[@id='AssetStatusTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click Asset
		public void Click_Asset()
		{
			Asset.click();
			
		}
		
	//click on click asset_class
		public void click_asset_status()
		{
			clk_asset_status.click();
		}
	
	//click on create asset_status
	public void create_asset_status()
	{
		create_asset_status.click();
	}
	
	//enter asset_status name from Excel sheet
	public void enterasset_statusname(String value)
	{
		enter_asset_status.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_asset_status.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank asset_status name
	public String Invalid_asset_status_test_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same asset_status name
		public String Invalid_asset_status_test()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new asset_status name entered
	public String Valid_asset_status_test()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_asset_status(String UN,String PW,String asset_status_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Asset();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_asset_status();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_asset_status();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterasset_statusname(asset_status_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_save();
	}
}
