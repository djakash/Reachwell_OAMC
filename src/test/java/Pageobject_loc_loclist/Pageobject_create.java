package Pageobject_loc_loclist;

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
    
    /////////// Control panel and location //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(linkText="Location")
	 WebElement location;
	////////////////////////////////////////////////
	
	//loc_list click
    @FindBy(linkText="Location List")
    WebElement clk_loc_list;
	////////////////////////////////////////////////
    
    //create loc_list click
    @FindBy(xpath="//*[@id='LocationTableContainer']/div/div[3]/div[2]/span[4]/span[2]")
    WebElement create_loc_list;
  
    //enter parent name
    @FindBy(xpath="//input[@id='ParentLocation']")
     WebElement enter_parent_loc;
    
  //enter loc_type
    @FindBy(xpath="//input[@id='WorkSpaceType']")
     WebElement enter_loc_type;
    
  //enter loc_code
    @FindBy(xpath="//input[@id='LocationCode']")
    WebElement enter_loc_code;
    
   //enter loc_name
    @FindBy(xpath="//input[@id='LocationName']")
    WebElement enter_loc_name;
    
    //enter loc descrip
    @FindBy(xpath="//*[@id='LocationDescription']")
    WebElement enter_desp;
    
    //click save loc
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_loc;
    
    //no entries found error
    @FindBy(xpath="//*[@id='WorkSpaceTypeResults']")
    WebElement no_entries;
    
    
    //blank loc message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same region name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different loc name edit succesfull 
	@FindBy(xpath="//*[@id='LocationTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click location
	public void Click_Location()
	{
		location.click();
		
	}
	
	// method to click loc_list
	public void click_loc_list()
	{
		clk_loc_list.click();
		
	}
	
	//click on create region
	public void create_loc_list()
	{
		create_loc_list.click();
	}
	
	//enter parent name from Excel sheet
	public void enterparent_name(String value)
	{
		enter_parent_loc.sendKeys(value);
	}
	
	//enter loc_type name from Excel sheet
	public void enter_loc_type(String value)
	{
		enter_loc_type.sendKeys(value);
	}
		
	//enter loc_code name from Excel sheet
	public void enter_loc_code(String value)
	{
	    enter_loc_code.sendKeys(value);
	}
				
	//enter loc_name from Excel sheet
	public void enter_loc_name(String value)
	{
		enter_loc_name.sendKeys(value);
	}			
	
	//enter descpription
	public void enterdescrip(String value1)
	{	
		enter_desp.sendKeys(value1);
	}
	

	//click save button
	public void click_save()
	{
		click_save_loc.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method to check Invalid_loctype_test_blnk
		public String Invalid_loctype_test_blnk(String parent,String loc_type,String loc_code,String loc_name,String desp)
		{
			enterparent_name(parent);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_type(loc_type);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_code(loc_code);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_name(loc_name);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enterdescrip(desp);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			click_save();
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			return msg_Invalid_result_blank.getText();
			
		}
		
		//method to check Invalid_loctype_test
	public String Invalid_loctype_test(String parent,String loc_type,String loc_code,String loc_name,String desp)
		{//String akash="";
			enter_loc_type(loc_type);
	    
		    browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    return  no_entries.getText();
		}	
				
	//method to check Invalid_locname_test_blnk
	public String Invalid_locname_test_blnk(String parent,String loc_type,String loc_code,String loc_name,String desp)
	   {
			enterparent_name(parent);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_code(loc_code);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_name(loc_name);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enterdescrip(desp);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_type(loc_type);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			click_save();
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			return msg_Invalid_result.getText();
					
		}					
				
	//method to check Invalid_same_locname_test
		public String Invalid_same_locname_test(String parent,String loc_type,String loc_code,String loc_name,String desp)
		   {
			enterparent_name(parent);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_type(loc_type);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_code(loc_code);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enter_loc_name(loc_name);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			enterdescrip(desp);
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			click_save();
			browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
			return msg_Invalid_result.getText();
						
			}	
	
		//method to check Valid_loc_test
				public String Valid_loc_test(String parent,String loc_type,String loc_code,String loc_name,String desp)
				   {
					enterparent_name(parent);
					browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					enter_loc_type(loc_type);
					browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					enter_loc_code(loc_code);
					browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					enter_loc_name(loc_name);
					browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					enterdescrip(desp);
					browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					click_save();
					browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
					return msg_Valid_result.getText();
								
					}
	
	//method for blank Country name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same Country name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new Country name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	

	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_loclist(String UN,String PW)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Location();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_loc_list();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_loc_list();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*enterparent_name(parent);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_loc_type(loc_type);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_loc_code(loc_code);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_loc_name(loc_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();*/
	}
}
