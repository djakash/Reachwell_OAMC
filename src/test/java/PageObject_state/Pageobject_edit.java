package PageObject_state;

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
	

	//state click
    @FindBy(linkText="State")
    WebElement clk_state;
	////////////////////////////////////////////////
    
//click on edit state
@FindBy(xpath="//*[@id='StateTableContainer']/div/table/tbody/tr[1]/td[6]/a/div")
WebElement clk_edit_state;

//enter state name
@FindBy(xpath="//input[@id='StateName']")
 WebElement enter_state;

//enter state descrip
@FindBy(xpath="//input[@id='Description']")
WebElement enter_desp;

//click save state
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_state;

//blank invoice message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same invoice name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	//with different invoice name edit succesfull 
		@FindBy(xpath="//*[@id='StateTableContainer']/div/table/tbody/tr[1]/td[2]")
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

// method to click criticality
public void click_state()
{
	clk_state.click();

}

//////////////////////////////////////////////////////////////////

public void clk_edit_state()
{
	clk_edit_state.click();
}
//////////////////////////////////////////////////////////////////

//enter criti name from Excel sheet
	public void enterstatename(String value)
	{
		enter_state.clear();
		enter_state.sendKeys(value);
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
	click_save_state.click();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//method for blank criticality name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same criticality name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new criticality name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocessinvoice(String UN,String PW,String TC_ID, String state_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_state();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_state();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterstatename(state_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
	
	

}
