package Pageobject_Employ_qual;

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
    @FindBy(linkText="Employee")
	 WebElement employbutt;
	////////////////////////////////////////////////
	
  //Qualification click
    @FindBy(linkText="Qualification")
    WebElement clk_qual;
	////////////////////////////////////////////////
    
//click on edit qual
@FindBy(xpath="//*[@id='QualificationTableContainer']/div/table/tbody/tr[1]/td[6]/a/div")
WebElement clk_edit_qual;

//enter Qualification name
@FindBy(xpath="//*[@id='Name']")
 WebElement enter_qual;

//enter qual descrip
@FindBy(xpath="//*[@id='Description']")
WebElement enter_desp;

//click save qual
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_qual;



//blank qual message
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result_blank;

//same qual name error msg
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result;

//first text box text
@FindBy(xpath="//*[@id='QualificationTableContainer']/div/table/tbody/tr[1]/td[2]")
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

//method to click employee
	public void Click_Employee()
	{ 
		employbutt.click();
				
	}
	// method to click qual
		public void click_qual()
		{
			clk_qual.click();
			
		}
		

//////////////////////////////////////////////////////////////////

public void clk_edit_qual()
{
clk_edit_qual.click();
}
//////////////////////////////////////////////////////////////////

//enter certi name from Excel sheet
	public void enterqualname(String value)
	{
		enter_qual.clear();
		enter_qual.sendKeys(value);
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
	click_save_qual.click();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//method for blank qual name
	public String getInvalidqualResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same qual name
		public String getInvalidqualResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new qual name entered
	public String getvalidqualResult()
	{
		//browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocessqual_edit(String UN,String PW,String TC_ID, String qual_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Employee();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_qual();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_qual();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterqualname(qual_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
	
	

}
