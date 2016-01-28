package PageObject_item_cat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	    
	// ///////// Control panel and asset //////////
	@FindBy(xpath = "//span[text()='Control Panel']")
	WebElement controlbutt;
	@FindBy(linkText = "Asset")
	WebElement Assetbutt;
	// //////////////////////////////////////////////

	// click item_cat
	@FindBy(linkText = "Item Catalogue")
	WebElement clk_item_cat;
    ////////////////////////////////////////////////
	
	// click on edit item_cat
	@FindBy(xpath = "//*[@id='ItemCatalogueTableContainer']/div/table/tbody/tr[1]/td[10]/a/div")
	WebElement clk_edit_item_cat;

	// enter branch name
	@FindBy(xpath = "//*[@id='OrganizationName']")
	WebElement branch_name;

	// enter item_type
	@FindBy(xpath = "//*[@id='ItemType']")
	WebElement item_type;

	// enter item code
	@FindBy(xpath = "//*[@id='ItemCode']")
	WebElement item_code;

	// enter item name
	@FindBy(xpath = "//*[@id='ItemName']")
	WebElement enter_item_name;

	// enter desp
	@FindBy(xpath = "//*[@id='ItemDescription']")
	WebElement enter_desp;

	// click save
	@FindBy(xpath = "//*[@id='LoadRecordsButton']")
	WebElement click_save;

	// 1
	// Invalid_item_code_test_blnk error message
	@FindBy(xpath = "//label[@class='error']")
	WebElement Invalid_item_code_test_blnk;

	// 2
	// Invalid_brnch_name_test_blnk error message
	@FindBy(xpath = "//label[@class='error']")
	WebElement Invalid_brnch_name_test_blnk;

	// 3
	// Invalid_item_name_test_blnk error message
	@FindBy(xpath = "//label[@class='error']")
	WebElement Invalid_item_name_test_blnk;

	// 4
	// Invalid_same_item_code error message
	@FindBy(xpath = "//label[@class='error']")
	WebElement Invalid_same_item_code;

	// 5
	// same item name error message
	@FindBy(xpath = "//label[@class='error']")
	WebElement Invalid_same_item_name;

	// with different item_cat edit succesfull
	@FindBy(xpath = "//*[@id='ItemCatalogueTableContainer']/div/table/tbody/tr[1]/td[3]")
	WebElement Valid_item_cat_test;


	public Pageobject_edit(WebDriver Dbrowser)
	{
		this.browser = Dbrowser;
		PageFactory.initElements(browser, this);
	}

	public void Click_CP()
	{
		controlbutt.click();

	}

	// / method to click asset
	public void Click_Asset()
	{
		Assetbutt.click();

	}

	// click on click item_cat
	public void click_item_cat()
	{
		clk_item_cat.click();
	}

	// enter branch name from Excel sheet
	public void enter_branch_name(String branch_name1) 
	{
		//branch_name.clear();
		branch_name.sendKeys(branch_name1);
	}

	// method for entering item_type
	public void enter_item_type(String item_type1) 
	{
		//item_type.clear();
		item_type.sendKeys(item_type1);

	}

	// method for entering item_code
	public void enter_item_code(String item_code1)
	{
		item_code.clear();
		item_code.sendKeys(item_code1);
	}

	// method to enter item name
	public void item_name(String item_name1) 
	{
		enter_item_name.clear();
		enter_item_name.sendKeys(item_name1);
	}

	// method to enter desp
	public void enter_desp(String desp) 
	{

		enter_desp.clear();
		enter_desp.sendKeys(desp);
	}

	// click save button
	public void click_save() 
	{
		click_save.click();
		// browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// 1
	// method for error text with blank branch name
	public String Invalid_brnch_name_test_blnk()
												
	{
		return Invalid_brnch_name_test_blnk.getText();
	}

	// 2
	// method for error text with blank item code
	public String Invalid_item_code_test_blnk() 
	{
		return Invalid_item_code_test_blnk.getText();
	}

	// 3
	// method for error text with blank item name
	public String Invalid_item_name_test_blnk() 
	{
		return Invalid_item_name_test_blnk.getText();
	}

	// 4
	// method for error text with same item code
	public String Invalid_same_item_code() 
	
	{
		return Invalid_same_item_code.getText();
	}

	// 5
	// method for error text with same item name
	public String Invalid_same_item_name() 
	{
		return Invalid_same_item_name.getText();
	}

	// 6
	// method for Valid_item_cat_test
	public String Valid_item_cat_test() 
	{
		return Valid_item_cat_test.getText();
	}


	public void Commonprocess_item_cat_edit(String UN,String PW,String branch_name,String item_type,String item_code,String item_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Asset();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_item_cat();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_item_cat.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_branch_name(branch_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_item_type(item_type);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_item_code(item_code);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		item_name(item_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_desp(desp);
		click_save();
	}
	
	

}
