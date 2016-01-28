package PageObject_asset_status;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject_edit {
	
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
    
	// click on edit asset_status
	@FindBy(xpath = "//*[@id='AssetStatusTableContainer']/div/table/tbody/tr[1]/td[6]/a/div")
	WebElement clk_edit_asset_status;

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

public Pageobject_edit(WebDriver Dbrowser)
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
	
	//click on Edit asset_status
	public void Edit_asset_status()
	{
		clk_edit_asset_status.click();
	}
	
	//enter asset_status name from Excel sheet
	public void enterasset_statusname(String value)
	{
		enter_asset_status.clear();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_asset_status.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.clear();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_asset_status.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank asset_status name
	public String Invalid_edit_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same asset_status name
		public String Invalid_edit()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new asset_status name entered
	public String Valid_edit()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocessasset_status_edit(String UN,String PW,String asset_status_name,String desp)
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
		Edit_asset_status();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterasset_statusname(asset_status_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_save();
	}
	
	

}
