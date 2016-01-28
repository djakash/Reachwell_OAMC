package PageObject_zone;

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
	

	//zone click
    @FindBy(linkText="Zone")
    WebElement clk_zone;
	////////////////////////////////////////////////
    
//click on edit zone
@FindBy(xpath="//*[@id='ZoneTableContainer']/div/table/tbody/tr[1]/td[6]/a/div")
WebElement clk_edit_zone;

//enter zone name
@FindBy(xpath="//*[@id='ZoneName']")
 WebElement enter_zone;

//enter zone descrip
@FindBy(xpath="//input[@id='Description']")
WebElement enter_desp;

//click save zone
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_state;

//blank zone message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same zone name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	//with different zone name edit succesfull 
		@FindBy(xpath="//*[@id='ZoneTableContainer']/div/table/tbody/tr[1]/td[2]")
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

//method to click zone
	public void click_zone()
	{
		clk_zone.click();
		
	}

//////////////////////////////////////////////////////////////////

public void clk_edit_zone()
{
	clk_edit_zone.click();
}
//////////////////////////////////////////////////////////////////

//enter zone name from Excel sheet
	public void enterzonename(String value)
	{
		enter_zone.clear();
		enter_zone.sendKeys(value);
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

//method for blank zone name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same zone name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new zone name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocesszone(String UN,String PW,String TC_ID, String state_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_zone();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_zone();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterzonename(state_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
	
	

}
