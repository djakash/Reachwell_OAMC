package PageObject_category;

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
    
    /////////// Control panel and Masters //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(xpath="//li[@id='Masters']")
	 WebElement MastButt;
	
	//category click
    @FindBy(linkText="Category")
    WebElement clk_category;
	////////////////////////////////////////////////
    
//click on edit category
@FindBy(xpath="//*[@id='CategoryTableContainer']/div/table/tbody/tr[1]/td[7]/a/div")
WebElement clk_edit_category;

//enter category name
@FindBy(xpath="//*[@id='CategoryName']")
 WebElement enter_category;

//enter category code
@FindBy(xpath="//*[@id='CategoryCode']")
 WebElement enter_category_code;
//enter category descrip
@FindBy(xpath="//*[@id='Description']")
WebElement enter_desp;

//click save category
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_category;

//blank category message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same category name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	//with different category name edit succesfull 
		@FindBy(xpath="//*[@id='CategoryTableContainer']/div/table/tbody/tr/td[2]")
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

// method to click Masters
public void Click_Masters()
{
MastButt.click();

}

//method to click category
	public void click_category()
	{
		clk_category.click();	
	}
	

//////////////////////////////////////////////////////////////////

public void clk_edit_category()
{
	clk_edit_category.click();
}
//////////////////////////////////////////////////////////////////

//enter category name from Excel sheet
	public void entercategoryname(String value)
	{
		enter_category.clear();
		enter_category.sendKeys(value);
	}
	
	//enter category code from Excel sheet
		public void entercategorycode(String value)
		{
			enter_category_code.clear();
			enter_category_code.sendKeys(value);
		}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.clear();
		enter_desp.sendKeys(value1);
	}

//click save button
public void click_save()
{
	click_save_category.click();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//method for blank category name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same category name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new category name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocesscategory(String UN,String PW,String category_name,String category_code,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_category();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_category();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entercategoryname(category_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entercategorycode(category_code);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
	
	

}
