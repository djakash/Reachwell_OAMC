package Pageobject_CP_Role;

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
    
    /////////// Control panel and Roles //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(linkText="Roles")
	 WebElement Rolesbutt;
	////////////////////////////////////////////////
	
	//Role click
    @FindBy(linkText="Role")
    WebElement clk_Role;
	////////////////////////////////////////////////
    
    //create Role click
    @FindBy(xpath="//*[@id='WFRoleTableContainer']/div/div[3]/div[2]/span[4]/span[2]")
    WebElement create_Role;
  
    //enter parent name
    @FindBy(xpath="//*[@id='ParentWFRole']")
     WebElement enter_parent;
  
    //enter role name
    @FindBy(xpath="//*[@id='RoleName']")
     WebElement enter_Role;
    
    //enter role descrip
    @FindBy(xpath="//*[@id='Description']")
    WebElement enter_desp;
    
    //click save role
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_role;
    
    //blank role message
	@FindBy(xpath="//label[@class='error']")
	WebElement Invalid_test_blnk;
	
	//same role name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different role name edit succesfull 
	@FindBy(xpath="//*[@id='WFRoleTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click Roles
		public void Click_Roles()
		{ 
			Rolesbutt.click();
			
		}
	
	// method to click Roles
	public void click_Role()
	{
		clk_Role.click();
		
	}
	
	//click on create Role
	public void create_Role()
	{
		create_Role.click();
	}
	
	//enter Role name from Excel sheet
	public void enterRolename(String Role_name)
	{
		enter_Role.sendKeys(Role_name);
	}
	
	//click on enter parent_Role
		public void enter_parent_code(String parent)
		{
			enter_parent.sendKeys(parent);
		}
	

	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_role.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank Role name
	public String Invalid_Rolename_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}

	//method for blank Role code
	public String Invalid_Rolecode_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}
	
	//method for error text with same Role name
		public String Invalid_Rolename_test()
		{
			return msg_Invalid_result.getText();
		}
	
		//method for error text with same Role code
				public String Invalid_Rolecode_test()
				{
					return msg_Invalid_result.getText();
				}	
	//method new Role name entered
	public String Valid_Role_test()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_Roles_Role(String UN,String PW,String Role_name,String parent,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Roles();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_Role();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_Role();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterRolename(Role_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_parent_code(parent);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
}
