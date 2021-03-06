package PageObject_criticality;
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
	
	//criticality click
    @FindBy(xpath="//span[text()=' Criticality']")
    WebElement clk_criti;
	////////////////////////////////////////////////
    
    //create criticality click
    @FindBy(xpath="//span[text()='Create Criticality']")
    WebElement create_criti;
  
    //enter criticality name
    @FindBy(xpath="//input[@id='Criticality']")
     WebElement enter_criti;
    
    //enter criticality descrip
    @FindBy(xpath="//input[@id='Color']")
    WebElement enter_desp;
    
    //click save criticality
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_criti;
    
    
    
    //blank criticality message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same criti name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	
	@FindBy(xpath="//*[@id='CriticalityTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click criticality
	public void click_criti()
	{
		clk_criti.click();
		
	}
	
	//click on create criticality
	public void create_criti()
	{
		create_criti.click();
	}
	
	//enter criti name from Excel sheet
	public void entercritiname(String value)
	{
		enter_criti.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_criti.click();
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
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocesscriti(String UN,String PW,String TC_ID, String criti_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_criti();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_criti();
		entercritiname(criti_name);
		enterdescrip(desp);
		click_save();
	}
}
