package Pageobject_Employ_depart;

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
	@FindBy(linkText="Employee")
	 WebElement employbutt;
	////////////////////////////////////////////////
	
	//Department click
    @FindBy(linkText="Department")
    WebElement clk_depart;
	////////////////////////////////////////////////
    
    //create Department click
    @FindBy(xpath="//span[text()='Create Department']")
    WebElement create_depart;
  
    //enter depart name
    @FindBy(xpath="//*[@id='GroupName']")
     WebElement enter_depart;
    
  //enter depart code
    @FindBy(xpath="//*[@id='GroupCode']")
     WebElement enter_depart_code;
    
    
    //enter depart descrip
    @FindBy(xpath="//*[@id='GroupDescription']")
    WebElement enter_desp;
    
    //click save depart
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_desig;
    
    //blank depart message
	@FindBy(xpath="//label[@class='error']")
	WebElement Invalid_test_blnk;
	
	//same depart name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different depart name edit succesfull 
	@FindBy(xpath="//*[@id='GroupTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click employee
		public void Click_Employee()
		{ 
			employbutt.click();
			
		}
	
	// method to click depart
	public void click_depart()
	{
		clk_depart.click();
		
	}
	
	//click on create depart
	public void create_depart()
	{
		create_depart.click();
	}
	
	//enter desig name from Excel sheet
	public void enterdepartname(String depart_name)
	{
		enter_depart.sendKeys(depart_name);
	}
	
	//click on enter depart_code
		public void enter_depart_code(String depart_code)
		{
			enter_depart_code.sendKeys(depart_code);
		}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_desig.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank depart name
	public String Invalid_departname_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}

	//method for blank depart code
	public String Invalid_departcode_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}
	
	//method for error text with same depart name
		public String Invalid_departname_test()
		{
			return msg_Invalid_result.getText();
		}
	
		//method for error text with same depart code
				public String Invalid_departcode_test()
				{
					return msg_Invalid_result.getText();
				}	
	//method new depart name entered
	public String Valid_depart_test()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_employ_depart(String UN,String PW,String depart_name,String depart_code,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Employee();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_depart();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_depart();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdepartname(depart_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_depart_code(depart_code);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
}
