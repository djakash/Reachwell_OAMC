package PageObject_Asset_class;

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
	    
	    /////////// Control panel and Asset //////////
	    @FindBy(xpath="//span[text()='Control Panel']")
	    WebElement controlbutt;
		@FindBy(linkText="Asset")
		 WebElement Asset;
		////////////////////////////////////////////////
		
		//click asset_class
	    @FindBy(linkText="Asset Class")
	    WebElement clk_asset_class;
		////////////////////////////////////////////////
	
//click on edit asset_class
@FindBy(xpath="//*[@id='AssetClassTableContainer']/div/table/tbody/tr[1]/td[7]/a/div")
WebElement clk_edit_asset_class;

//enter acc_class name
@FindBy(xpath="//*[@id='AccountHeads']")
WebElement acc_class_name;

//enter parent asset class
@FindBy(xpath="//*[@id='ParentAssetClass']")
 WebElement parent_asset_class;

//enter asset class
@FindBy(xpath="html/body/div[2]/div/div[2]/div/div/div/div[2]/form/fieldset/div[3]/div/input")
WebElement asset_class;

@FindBy(xpath="//*[@id='Description']")
WebElement enter_desp;

//click save 
@FindBy(xpath="//*[@id='LoadRecordsButton']")
WebElement click_save;

//blank acc_class name error message
@FindBy(xpath="//label[@class='error']") 	
WebElement Invalid_acc_class_test_blnk;

//blank asset_class error message
@FindBy(xpath="//label[@class='error']")
WebElement Invalid_asset_class_test_blnk;


//with different asset_class name edit succesfull 
@FindBy(xpath="//*[@id='AssetClassTableContainer']/div/table/tbody/tr[1]/td[2]")
WebElement msg_Valid_result;


public Pageobject_edit(WebDriver Dbrowser)
{
this.browser=Dbrowser;
PageFactory.initElements(browser, this);
}

public void Click_CP()
{
controlbutt.click();

}
//method to click Asset
	public void Click_Asset()
	{
		Asset.click();
		
	}
	
	//click on click asset_class
	public void click_asset_class()
	{
		clk_asset_class.click();
	}
	
	public void edit_asset_class()
	{
		clk_edit_asset_class.click();	
		
	}
	
	//enter class name from Excel sheet
	public void enter_acc_class(String value)
	{
		acc_class_name.clear();
		acc_class_name.sendKeys(value);
	}
	
	//method for entering parent_asset_class
	public void enter_parent_asset_class(String value)
	{
		parent_asset_class.clear();
		parent_asset_class.sendKeys(value);
		
	}
	
	public void enter_asset_class(String value)
	{
		asset_class.clear();
		asset_class.sendKeys(value);
	}
	
	//method to  enter_desp 
	public void enter_desp(String value)
	{
		enter_desp.clear();
		enter_desp.sendKeys(value);
	}
	
	//click save button
	public void click_save()
	{
		click_save.click();
		//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
//1	
	//method for error text with blank acc_class name
	public String Invalid_acc_class_test_blnk(String acc_class,String parent_class,String asset_class)
	{
		enter_acc_class(acc_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_parent_asset_class(parent_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_asset_class(asset_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		click_save();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		return Invalid_asset_class_test_blnk.getText();
	}	
	
//2	
	//method for error text with blank location code
	public String Invalid_asset_class_test_blnk(String acc_class,String parent_class,String asset_class)
		{
		enter_acc_class(acc_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_parent_asset_class(parent_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_asset_class(asset_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		click_save();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		return Invalid_asset_class_test_blnk.getText();
		}
		
//3	
	//method for error text with same_asset_class name
	public String Invalid_same_asset_class_test(String acc_class,String parent_class,String asset_class)
		{
		enter_acc_class(acc_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_parent_asset_class(parent_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_asset_class(asset_class);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		click_save();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		return Invalid_asset_class_test_blnk.getText();
		}		
//4	
	//method for error text with Valid_asset_test
		public String Valid_asset_test(String acc_class,String parent_class,String asset_class)
			{
			enter_acc_class(acc_class);
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_parent_asset_class(parent_class);
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_asset_class(asset_class);
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			click_save();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			return msg_Valid_result.getText();
			}
		
		
//**********************************************************************************
		
//Common process component	
			
	public void Commonprocess_asset_cls_edit(String UN,String PW)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
        browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Click_Asset();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click_asset_class();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		edit_asset_class();
	}
	
}
